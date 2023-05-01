package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.devtools.v85.domstorage.model.DomStorageItemRemoved;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

    private final String ENDPOINT ="/index.php?route=account/login";
    @FindBy(id = "input-email")
    private WebElement emailInput;
    @FindBy(id = "input-password")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"form-login\"]/button")
    private WebElement submitLoginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickSubmitButton(){
        submitLoginButton.click();
    }

    public void fillInTheLoginForm( String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
    }

    public LoginPage toPage(){
        driver.get(BASER_URL + ENDPOINT);
        return this;
    }
}
