package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By appMenu = AppiumBy.accessibilityId("App");
    private final By viewsMenu = AppiumBy.accessibilityId("Views");
    private final By textMenu = AppiumBy.accessibilityId("Text");

    public void openAppMenu() {
          driver.findElement(appMenu).click();
    }

    public void openViewsMenu() {
        driver.findElement(viewsMenu).click();
    }

    public void openTextMenu() {
        driver.findElement(textMenu).click();
    }
}
