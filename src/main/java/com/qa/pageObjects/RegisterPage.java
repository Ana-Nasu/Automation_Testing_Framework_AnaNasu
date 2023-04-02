package com.qa.pageObjects;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;
    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;
    @FindBy(id = "input-email")
    private WebElement emailInput;
    @FindBy(id = "input-password")
    private WebElement passwordInput;
    @FindBy(xpath= "//*[@id=\"form-register\"]/div/div/div")
    private WebElement privacyCheckBox;
    @FindBy(xpath = "//*[@id=\"form-register\"]/div/div/button")
    private WebElement continueButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void fillInTheRegisterForm(String firstName, String lastName, String email, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
    }


//   // public void registerUserSuccessfully() throws InterruptedException {
//        driver.get("https://demo.opencart.com");
//
//        WebElement myAccountButton = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span"));
//        myAccountButton.click();
//
//        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a"));
//        registerButton.click();
//
//        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
//        firstNameInput.sendKeys("Test");
//
//        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
//        lastNameInput.sendKeys("Data");
//
//        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
//        emailInput.sendKeys("testdata@mailinator.com");
//
//        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
//        passwordInput.sendKeys("pinguin");
//
//        Thread.sleep(2500);
//        WebElement privacyCheckBox = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));
//        privacyCheckBox.click();
//
//        WebElement continueButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//        continueButton.click();
//
//        Thread.sleep(10000);
//    }
//
//    public void loginSuccessfully() throws InterruptedException {
//        driver.get("https://demo.opencart.com");
//
//        WebElement myAccountButton = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span"));
//        myAccountButton.click();
//
//        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a"));
//        loginButton.click();
//
//        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
//        emailInput.sendKeys("testdata@mailinator.com");
//
//        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
//        passwordInput.sendKeys("pinguin");
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"form-login\"]/button"));
//        submitButton.click();
//
//        Thread.sleep(10000);
//
//    }
}
