package com.appiumdemo.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void initDriver(String platform) {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            if (platform.equalsIgnoreCase("android")) {

                caps.setCapability("platformName", "Android");
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("deviceName", "Android Emulator");
                caps.setCapability("app",
                        System.getProperty("user.dir") + "/apps/ApiDemos-debug.apk");

                driver.set(new AndroidDriver(
                        new URL("http://127.0.0.1:4723"), caps));

            } else if (platform.equalsIgnoreCase("ios")) {

                caps.setCapability("platformName", "iOS");
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("deviceName", "iPhone Simulator");
                caps.setCapability("app",
                        System.getProperty("user.dir") + "/apps/TestApp.app");

                driver.set(new IOSDriver(
                        new URL("http://127.0.0.1:4723"), caps));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}