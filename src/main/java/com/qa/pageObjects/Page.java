package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")
    protected WebElement myAccountButton;
    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")
    protected WebElement registerButton;
    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/a")
    protected WebElement desktopsButton;
    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a")
    protected WebElement macButton;

    protected WebDriver driver;
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void navigateToRegisterPage() {
        myAccountButton.click();
        registerButton.click();
    }

    public void selectDesktopOption() {
        desktopsButton.click();
        macButton.click();
    }

    public void closeBrowser(){
        driver.quit();
    }

}
