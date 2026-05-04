package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LogTextBoxPage {
    private AndroidDriver driver;

    public LogTextBoxPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By logTextBox = AppiumBy.accessibilityId("LogTextBox");
    private By addBtn = By.id("io.appium.android.apis:id/add");

    public void openLogTextBox() {
        driver.findElement(logTextBox).click();
    }

    public void clickAdd() {
        driver.findElement(addBtn).click();
    }
}
