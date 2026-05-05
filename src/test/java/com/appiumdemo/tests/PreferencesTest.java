package com.appiumdemo.tests;

import org.testng.annotations.Test;

import com.appiumdemo.base.BaseTest;
import com.appiumdemo.pages.PreferencesPage;

public class PreferencesTest extends BaseTest {

    @Test
    public void testWifiSetup() {
        PreferencesPage page = new PreferencesPage();
        page.configureWifi("MyPassword123");
    }
}