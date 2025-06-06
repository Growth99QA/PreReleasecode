package com.growth99.listeners;

import com.aventstack.extentreports.Status;
import com.growth99.base.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.growth99.utils.ExtentReportUtitltiy;
import com.growth99.utils.ExtentTestManager;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.*;

public class MyListeners implements ITestListener {

    private ExtentReports extentReports;

    @Override
    public void onStart(ITestContext context) {
        extentReports = ExtentReportUtitltiy.generateExtentReport();
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        ExtentTestManager.setTest(extentReports.createTest(testName));
        ExtentTestManager.getTest().log(Status.INFO, testName + " started executing");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().log(Status.PASS, result.getMethod().getMethodName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	WebDriver driver = BaseClass.getDriver();
        String testName = result.getName();

        if (driver != null) {
            File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destPath = System.getProperty("user.dir") + "/Screenshots/" + testName + ".png";
            try {
                FileHandler.copy(srcScreenshot, new File(destPath));
                ExtentTestManager.getTest().addScreenCaptureFromPath(destPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed: " + result.getThrowable());
   
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().log(Status.SKIP, result.getMethod().getMethodName() + " skipped");
    }
}




