package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    private final String ENDPOINT = "/index.php?route=common/home";
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMyAccountButton(){
        waitManager.waitTillTheElementIsVisible(myAccountButton);
        myAccountButton.click();
    }
    public void clickOnRegisterButton(){
        waitManager.waitTillTheElementIsClickable(registerButton);
        registerButton.click();
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public HomePage toPage(){
        driver.get(BASER_URL + ENDPOINT);
        return this;
    }
}
