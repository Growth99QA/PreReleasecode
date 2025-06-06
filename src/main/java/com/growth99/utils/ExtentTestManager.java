package com.growth99.utils;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {

    private static ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return extentTestThread.get();
    }

    public static void setTest(ExtentTest test) {
        extentTestThread.set(test);
    }

    public static void removeTest() {
        extentTestThread.remove();
    }
}
