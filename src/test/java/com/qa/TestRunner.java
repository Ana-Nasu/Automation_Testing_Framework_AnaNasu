package com.qa;

import com.qa.managers.WebDriverManager;
import com.qa.pageObjects.CategoryItemList;
import com.qa.pageObjects.HomePage;
import com.qa.pageObjects.RegisterPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.InterruptedIOException;

@RunWith(JUnit4.class)
public class TestRunner {
    @Test
    public void registerUserWithSuccess() {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com");

        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();


        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("Ana","Nasu","testingprofile@mailinator.com", "testare1");
        registerPage.closeBrowser();
    }
    @Test
    public void verifyNumberOfMacsInDesktopCategory(){
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com");

        CategoryItemList categoryItemList = new CategoryItemList(webDriverManager.getDriver());
        categoryItemList.selectDesktopOption();
        Assert.assertEquals(1, categoryItemList.getProductListSize());
        categoryItemList.closeBrowser();
    }
    @Test
    public void verifyNumberOfMacsInDesktopCategoryFail(){
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com");

        CategoryItemList categoryItemList = new CategoryItemList(webDriverManager.getDriver());
        categoryItemList.selectDesktopOption();
        Assert.assertEquals(3, categoryItemList.getProductListSize());
        categoryItemList.closeBrowser();
    }


}

