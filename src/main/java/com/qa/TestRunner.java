package com.qa;

import com.qa.managers.WebDriverManager;
import com.qa.pageObjects.CategoryItemList;
import org.openqa.selenium.WebDriver;

import java.io.InterruptedIOException;

public class TestRunner {
    public static void main(String[] args) throws InterruptedIOException, InterruptedException {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com");
//        chromeDriverManager.getDriver().get("https://www.youtube.com");
//        Thread.sleep(10000);
//        chromeDriverManager.closeDriver();
//
//        WebDriverManager fireFoxDriverManager = new WebDriverManager("FIREFOX");
//        fireFoxDriverManager.getDriver().get("https://google.com");
//        Thread.sleep(10000);
//        fireFoxDriverManager.closeDriver();

        CategoryItemList categoryItemList = new CategoryItemList(webDriverManager.getDriver());
        categoryItemList.selectDesktopOption();
        System.out.println(categoryItemList.getProductListSize() == 1);
        categoryItemList.closeBrowser();
    }

}


