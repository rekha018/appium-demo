package com.appiumdemo.pages;

import java.time.Duration;

import com.appiumdemo.utils.DriverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage {
    AppiumDriver driver;

    public ProgressBarPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(accessibility = "Views")
    @iOSXCUITFindBy(accessibility = "Views")
    private WebElement views;

    @AndroidFindBy(accessibility = "Progress Bar")
    @iOSXCUITFindBy(accessibility = "Progress Bar")
    private WebElement progressBar;

    @AndroidFindBy(id = "io.appium.android.apis:id/show_horizontal")
    @iOSXCUITFindBy(accessibility = "Show Horizontal")
    private WebElement progressBtn;

    public void openProgressBar() {
        views.click();
        progressBar.click();
    }

    public void startProgress() {
        progressBtn.click();
    }
}
