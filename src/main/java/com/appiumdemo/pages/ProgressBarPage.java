package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ProgressBarPage {
    private AndroidDriver driver;

    public ProgressBarPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By views = AppiumBy.accessibilityId("Views");
    private By progressBar = AppiumBy.accessibilityId("Progress Bar");
    private By progressBtn = By.id("io.appium.android.apis:id/show_horizontal");

    public void openProgressBar() {
        driver.findElement(views).click();
        driver.findElement(progressBar).click();
    }

    public void startProgress() {
        driver.findElement(progressBtn).click();
    }
}
