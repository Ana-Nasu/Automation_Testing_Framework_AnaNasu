package com.qa.pageObjects;

import com.qa.managers.PropertiesManagers;
import com.qa.managers.WaitManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Method;

public abstract class Page {

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")
    protected WebElement myAccountButton;
    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")
    protected WebElement registerButton;
    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a")
    protected WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/a")
    protected WebElement desktopsButton;
    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a")
    protected WebElement macButton;

    protected WebDriver driver;
    protected WaitManager waitManager;
    protected final String BASER_URL = PropertiesManagers.getApplicationURL();

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitManager = new WaitManager( driver);
        this.driver = driver;
    }

    public void navigateToRegisterPage() {
        WaitManager.waitTillTheElementIsVisible(myAccountButton);
        myAccountButton.click();
        WaitManager.waitTillTheElementIsClickable(registerButton);
        registerButton.click();
    }
    public void navigateToLoginPage(){
        myAccountButton.click();
        loginButton.click();
    }

    public static void navigateToPage(String pageName,WebDriver driver){
        Method method;
        try{
            method = Class.forName("pageObjects."+ pageName).getMethod("toPage");
            method.invoke(Class.forName("pageObjects." + pageName).getConstructor(WebDriver.class).newInstance(driver));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void selectDesktopOption() {
        desktopsButton.click();
        macButton.click();
    }

    public void closeBrowser(){
        driver.quit();
    }

}
