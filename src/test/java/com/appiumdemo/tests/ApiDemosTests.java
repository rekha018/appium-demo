package com.appiumdemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appiumdemo.base.BaseTest;
import com.appiumdemo.pages.AlertDialogsPage;
import com.appiumdemo.pages.ControlsPage;
import com.appiumdemo.pages.HomePage;
import com.appiumdemo.pages.LogTextBoxPage;
import com.appiumdemo.pages.ProgressBarPage;
import com.appiumdemo.utils.DriverFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ApiDemosTests extends BaseTest {

    private AppiumDriver driver;
    private HomePage homePage;

    @Test
    public void testAlertDialogs() {
        homePage = new HomePage();
        AlertDialogsPage alert = new AlertDialogsPage();
        driver = DriverFactory.getDriver();

        homePage.openAppMenu();
        alert.openAlertDialogs();
        alert.openOkCancelDialog();
        alert.clickOk();
        Assert.assertTrue(driver.getPageSource().contains("App/Alert Dialogs"));
    }

    @Test
    public void testControls() {
        homePage = new HomePage();
        ControlsPage controls = new ControlsPage();
        driver = DriverFactory.getDriver();

        homePage.openViewsMenu();
        controls.openControls();
        controls.openLightTheme();
        controls.toggleCheckbox();

        Assert.assertTrue(driver.findElement(
                AppiumBy.id("io.appium.android.apis:id/check1")).isSelected());
    }

    @Test
    public void testLogTextBox() {
        homePage = new HomePage();
        LogTextBoxPage log = new LogTextBoxPage();
        driver = DriverFactory.getDriver();

        homePage.openTextMenu();
        log.openLogTextBox();
        log.clickAdd();

        Assert.assertTrue(driver.getPageSource().contains("Log"));
    }

    @Test
    public void testProgressBar() {
        homePage = new HomePage();
        ProgressBarPage progress = new ProgressBarPage();
        driver = DriverFactory.getDriver();

        progress.openProgressBar();
        progress.startProgress();

        Assert.assertTrue(driver.getPageSource().contains("Progress"));
    }
}