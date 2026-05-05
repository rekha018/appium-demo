package com.appiumdemo.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.appiumdemo.utils.DriverFactory;

public class BaseTest {

    // @Parameters({"platform"})
    @BeforeMethod
    public void setup() {
        DriverFactory.initDriver("android");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
