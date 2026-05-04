package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ControlsPage {
    private AndroidDriver driver;

    public ControlsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By controls = AppiumBy.accessibilityId("Controls");
    private By lightTheme = AppiumBy.accessibilityId("1. Light Theme");
    private By checkbox = AppiumBy.accessibilityId("check1");

    public void openControls() {
        driver.findElement(controls).click();
    }

    public void openLightTheme() {
        driver.findElement(lightTheme).click();
    }

    public void toggleCheckbox() {
        driver.findElement(checkbox).click();
    }
}
