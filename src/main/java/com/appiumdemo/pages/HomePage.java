package com.appiumdemo.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import com.appiumdemo.utils.DriverFactory;

import java.time.Duration;

public class HomePage {
    AppiumDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @AndroidFindBy(accessibility = "App")
    @iOSXCUITFindBy(accessibility = "App")
    private WebElement appMenu;

    @AndroidFindBy(accessibility = "Views")
    @iOSXCUITFindBy(accessibility = "Views")
    private WebElement viewsMenu;

    @AndroidFindBy(accessibility = "Text")
    @iOSXCUITFindBy(accessibility = "Text")
    private WebElement textMenu;

    public void openAppMenu() {
        appMenu.click();
    }

    public void openViewsMenu() {
        viewsMenu.click();
    }

    public void openTextMenu() {
        textMenu.click();
    }
}
