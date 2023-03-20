package com.qa;

import com.qa.managers.WebDriverManager;

import java.io.InterruptedIOException;

public class TestRunner {
    public static void main(String[] args) throws InterruptedIOException, InterruptedException {
        WebDriverManager chromeDriverManager = new WebDriverManager("CHROME");
        chromeDriverManager.getDriver().get("https://www.youtube.com");
        Thread.sleep(10000);
        chromeDriverManager.closeDriver();

        WebDriverManager fireFoxDriverManager = new WebDriverManager("FIREFOX");
        fireFoxDriverManager.getDriver().get("https://google.com");
        Thread.sleep(10000);
        fireFoxDriverManager.closeDriver();
    }


}

