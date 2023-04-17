package com.qa.stepDefinitions;

import com.qa.pageObjects.HomePage;
import contextManagers.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePageSteps {
    private TestContext testContext;
    private HomePage homePage;

    public HomePageSteps(TestContext testContext) {
        this.testContext = testContext;
        homePage = new HomePage(testContext.getWebDriverManager().getDriver());

    }

    @When("MyAccount button is clicked")
    public void myAccountButtonIsClicked() {
        homePage.clickOnMyAccountButton();
    }

    @And("Register button is clicked")
    public void registerButtonIsClicked() {
        homePage.clickOnRegisterButton();
    }

    @And("Login button is clicked")
    public void loginButtonIsClicked() {
        homePage.clickOnLoginButton();
    }
}
