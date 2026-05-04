package com.appiumdemo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ExpandableListsPage {
    private AndroidDriver driver;

    public ExpandableListsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By expandableLists = AppiumBy.accessibilityId("Expandable Lists");
    private By customAdapter = AppiumBy.accessibilityId("1. Custom Adapter");
    private By peopleNames = AppiumBy.accessibilityId("People Names");

    public void openExpandableLists() {
        driver.findElement(expandableLists).click();
    }

    public void openCustomAdapter() {
        driver.findElement(customAdapter).click();
    }

    public void clickPeopleNames() {
        driver.findElement(peopleNames).click();
    }
}