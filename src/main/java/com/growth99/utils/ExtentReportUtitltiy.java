package com.growth99.utils;

import java.io.File;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtitltiy {
	
	public static ExtentReports generateExtentReport() {
		
		ExtentReports extentReport = new ExtentReports();
		File filePath = new File(System.getProperty("user.dir")+"\\ExtentReport\\extentReport.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(filePath);
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Automation Result");
		spark.config().setDocumentTitle("Gorwth99 Automation Report");
		spark.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");
		
		extentReport.attachReporter(spark);
//		Properties  configProp = Utilities.loadProperties("configs\\config.properties");
//		extentReport.setSystemInfo("Application Url", configProp.getProperty("url"));
//		extentReport.setSystemInfo("Browser Name", configProp.getProperty("browser"));
		extentReport.setSystemInfo("OS Name", System.getProperty("os.name"));
		extentReport.setSystemInfo("System UserName", System.getProperty("user.name"));
		extentReport.setSystemInfo("Java version",System.getProperty("java.version"));
		return extentReport;	
		
	}

}
