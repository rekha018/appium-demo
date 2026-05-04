package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LayoutsPage {
    private AndroidDriver driver;

    public LayoutsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By layouts = AppiumBy.accessibilityId("Layouts");
    private By defaultLayout = AppiumBy.accessibilityId("1. Default");

    public void openLayouts() {
        driver.findElement(layouts).click();
    }

    public void openDefaultLayout() {
        driver.findElement(defaultLayout).click();
    }
}
