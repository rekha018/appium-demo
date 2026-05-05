package com.appiumdemo.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import com.appiumdemo.utils.DriverFactory;

import java.time.Duration;

public class LogTextBoxPage {
    AppiumDriver driver;

    public LogTextBoxPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(accessibility = "LogTextBox")
    @iOSXCUITFindBy(accessibility = "LogTextBox")
    private WebElement logTextBox;

    @AndroidFindBy(id = "io.appium.android.apis:id/add")
    @iOSXCUITFindBy(accessibility = "Add")
    private WebElement addBtn;

    public void openLogTextBox() {
        logTextBox.click();
    }

    public void clickAdd() {
        addBtn.click();
    }
}
