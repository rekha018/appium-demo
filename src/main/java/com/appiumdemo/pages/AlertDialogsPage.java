package com.appiumdemo.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appiumdemo.utils.DriverFactory;

import io.appium.java_client.AppiumDriver;

public class AlertDialogsPage {

    AppiumDriver driver;

    public AlertDialogsPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(accessibility = "Alert Dialogs")
    @iOSXCUITFindBy(accessibility = "Alert Dialogs")
    private WebElement alertDialogs;

    @AndroidFindBy(accessibility = "OK Cancel dialog with a message")
    @iOSXCUITFindBy(accessibility = "OK Cancel dialog with a message")
    private WebElement okCancelDialog;

    // @AndroidFindBy(xpath =
    // "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okBtn;

    public void openAlertDialogs() {
        alertDialogs.click();
    }

    public void openOkCancelDialog() {
        okCancelDialog.click();
    }

    public void clickOk() {
        okBtn.click();
    }
}
