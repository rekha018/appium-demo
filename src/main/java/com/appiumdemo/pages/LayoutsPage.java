package com.appiumdemo.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import com.appiumdemo.utils.DriverFactory;

import java.time.Duration;

public class LayoutsPage {
    AppiumDriver driver;

    public LayoutsPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(accessibility = "Layouts")
    @iOSXCUITFindBy(accessibility = "Layouts")
    private WebElement layouts;

    @AndroidFindBy(accessibility = "1. Default")
    @iOSXCUITFindBy(accessibility = "1. Default")
    private WebElement defaultLayout;

    public void openLayouts() {
        layouts.click();
    }

    public void openDefaultLayout() {
        defaultLayout.click();
    }
}
