package com.qa.stepDefinitions;

import com.qa.pageObjects.HomePage;
import com.qa.pageObjects.LoginPage;
import contextManagers.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private TestContext testContext;
    private LoginPage loginPage;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
        loginPage = new LoginPage(testContext.getWebDriverManager().getDriver());

    }

    @Then("Fill the form with the following values")
    public void fillTheFormWithTheFollowingValues(Map<String, String> values) {
        loginPage.fillInTheLoginForm(values.get("email"), values.get("password"));
        loginPage.clickSubmitButton();
        assertEquals(2, values.keySet().size());
    }

}
