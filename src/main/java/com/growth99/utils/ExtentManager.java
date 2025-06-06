package com.growth99.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.HashMap;
import java.util.Map;

public class ExtentManager {
    private static final Map<String, ExtentReports> extentMap = new HashMap<>();

    public static ExtentReports getReporter(String className) {
        if (!extentMap.containsKey(className)) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("ExtentReport/" + className + "_ExtentReport.html");
            ExtentReports extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extentMap.put(className, extent);
        }
        return extentMap.get(className);
    }

    public static void flushExtent(String className) {
        if (extentMap.containsKey(className)) {
            extentMap.get(className).flush();
        }
    }
}
