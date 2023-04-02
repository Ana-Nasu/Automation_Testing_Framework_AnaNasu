package com.qa;

import com.qa.managers.WebDriverManager;
import com.qa.pageObjects.HomePage;
import com.qa.pageObjects.RegisterPage;
import org.openqa.selenium.WebElement;
import sun.lwawt.macosx.CThreading;

import java.io.InterruptedIOException;

public class RegisterRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com");

        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();


        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("Ana","Nasu","testingprofile@mailinator.com", "testare1");

        Thread.sleep(10000);
        registerPage.closeBrowser();

    }

}
