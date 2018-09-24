package com.appiumSamples.wordpress.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait webDriverWait;

    public BasePage(AppiumDriver<MobileElement>driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver,15);
    }


}
