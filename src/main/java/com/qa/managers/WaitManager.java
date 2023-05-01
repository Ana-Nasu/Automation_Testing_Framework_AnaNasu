package com.qa.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class WaitManager {
    private static WebDriver driver;
    private static WebDriverWait webDriverWait;


    public WaitManager(WebDriver driver) {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitTillTheElementIsVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitTillTheElementIsClickable(WebElement element)
    {webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

