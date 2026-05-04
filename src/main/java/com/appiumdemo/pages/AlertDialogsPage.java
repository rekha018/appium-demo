package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AlertDialogsPage {
   
    private AndroidDriver driver;

    public AlertDialogsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By alertDialogs = AppiumBy.accessibilityId("Alert Dialogs");
    private By okBtn = AppiumBy.accessibilityId("button1");
    private By okCancelBtn = By.id("io.appium.android.apis:id/two_buttons");

    public void openAlertDialogs() {
        driver.findElement(alertDialogs).click();
    }

    public void clickOkCancelDialog() {
        driver.findElement(okCancelBtn).click();
    }

    public void acceptAlert() {
        driver.findElement(okBtn).click();
    }
}
