package com.appiumdemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appiumdemo.utils.DriverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PreferencesPage {

    AppiumDriver driver;

    public PreferencesPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Cross-platform elements

    @AndroidFindBy(accessibility = "Preference")
    @iOSXCUITFindBy(accessibility = "Preference")
    private WebElement preferenceMenu;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    @iOSXCUITFindBy(accessibility = "3. Preference dependencies")
    private WebElement dependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSwitch")
    private WebElement wifiCheckbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")
    @iOSXCUITFindBy(accessibility = "WiFi settings")
    private WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/edit")
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    private WebElement wifiInput;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    // Actions

    public void configureWifi(String password) {
        preferenceMenu.click();
        dependencies.click();
        wifiCheckbox.click();
        wifiSettings.click();
        wifiInput.sendKeys(password);
        okButton.click();
    }
}