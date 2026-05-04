package com.appiumdemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appiumdemo.base.BaseTest;
import com.appiumdemo.pages.AlertDialogsPage;
import com.appiumdemo.pages.ControlsPage;
import com.appiumdemo.pages.ExpandableListsPage;
import com.appiumdemo.pages.HomePage;
import com.appiumdemo.pages.LogTextBoxPage;
import com.appiumdemo.pages.ProgressBarPage;

import io.appium.java_client.AppiumBy;

public class ApiDemosTests extends BaseTest {

    @Test
    public void testAlertDialogFlow() {
        HomePage home = new HomePage(driver);
        AlertDialogsPage alert = new AlertDialogsPage(driver);

        home.openAppMenu();
        alert.openAlertDialogs();
        alert.clickOkCancelDialog();
        alert.acceptAlert();
    }

    @Test
    public void ScrollViewTest() {
        HomePage home = new HomePage(driver);

        home.openViewsMenu();

        // Scroll to "ScrollView"
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\"ScrollView\"));")).click();

        Assert.assertTrue(driver.getPageSource().contains("ScrollView"));
    }

    @Test
    public void ExpandableListTest() {
        HomePage home = new HomePage(driver);
        ExpandableListsPage list = new ExpandableListsPage(driver);

        home.openViewsMenu();
        list.openExpandableLists();
        list.openCustomAdapter();
        list.clickPeopleNames();

        Assert.assertTrue(driver.getPageSource().contains("Arnold"));
    }

    @Test
    public void ControlsTest() {
        HomePage home = new HomePage(driver);
        ControlsPage controls = new ControlsPage(driver);

        home.openViewsMenu();
        controls.openControls();
        controls.openLightTheme();
        controls.toggleCheckbox();

        Assert.assertTrue(driver.findElement(
                AppiumBy.id("io.appium.android.apis:id/check1")).isSelected());
    }

    @Test
    public void AlertDialogsTest() {
        HomePage home = new HomePage(driver);
        AlertDialogsPage alert = new AlertDialogsPage(driver);

        home.openAppMenu();
        alert.openAlertDialogs();
        alert.clickOkCancelDialog();
        alert.acceptAlert();

        Assert.assertTrue(driver.getPageSource().contains("App"));
    }

    @Test
    public void LogTextBoxTest() {
        HomePage home = new HomePage(driver);
        LogTextBoxPage log = new LogTextBoxPage(driver);

        home.openTextMenu();
        log.openLogTextBox();
        log.clickAdd();

        Assert.assertTrue(driver.getPageSource().contains("Log"));
    }

    @Test
    public void ListsTest() {
        HomePage home = new HomePage(driver);

        home.openViewsMenu();

        driver.findElement(AppiumBy.accessibilityId("Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Array")).click();

        Assert.assertTrue(driver.getPageSource().contains("Item 1"));
    }

    @Test
    public void ProgressBarTest() {
        HomePage home = new HomePage(driver);
        ProgressBarPage progress = new ProgressBarPage(driver);

        progress.openProgressBar();
        progress.startProgress();

        Assert.assertTrue(driver.getPageSource().contains("Progress"));
    }

    @Test
    public void HorizontalScrollTest() {
        HomePage home = new HomePage(driver);

        home.openViewsMenu();

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Horizontal ScrollView\"));")).click();

        // Click a tab inside horizontal scroll
        driver.findElement(AppiumBy.accessibilityId("Tab 2")).click();

        Assert.assertTrue(driver.getPageSource().contains("Tab 2"));
    }
}