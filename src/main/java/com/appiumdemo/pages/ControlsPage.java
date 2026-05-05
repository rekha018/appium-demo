package com.appiumdemo.pages;

import java.time.Duration;

import com.appiumdemo.utils.DriverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ControlsPage {
    AppiumDriver driver;

    public ControlsPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(accessibility = "Controls")
    @iOSXCUITFindBy(accessibility = "Controls")
    private WebElement controls;

    @AndroidFindBy(accessibility = "1. Light Theme")
    @iOSXCUITFindBy(accessibility = "1. Light Theme")
    private WebElement lightTheme;

    @AndroidFindBy(accessibility = "check1")
    @iOSXCUITFindBy(accessibility = "check1")
    private WebElement checkbox;

    public void openControls() {
        controls.click();
    }

    public void openLightTheme() {
        lightTheme.click();
    }

    public void toggleCheckbox() {
        checkbox.click();
    }
}
