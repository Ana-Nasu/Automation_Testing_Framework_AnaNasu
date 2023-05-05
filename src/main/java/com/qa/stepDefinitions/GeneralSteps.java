package com.qa.stepDefinitions;

import com.qa.pageObjects.Page;
import contextManagers.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class GeneralSteps {
    private final TestContext testContext;

    public GeneralSteps(TestContext context) {
        testContext = context;
    }

    @Given("{string} is accessed")
    public void isAccessed(String addressUrl) {
        testContext.getWebDriverManager().getDriver().get(addressUrl);
    }

    @Then("{string} is present within the current url")
    public void isPresentWithinTheCurrentUrl(String keyword) {
        assertTrue(testContext.getWebDriverManager().getDriver().getCurrentUrl().contains(keyword));
    }

    @Given("{string} is opened")
    public void isOpened(String pageName) {
        Page.navigateToPage(pageName, testContext.getWebDriverManager().getDriver());
        System.out.println("Pagina " + pageName + " a fost accesata.");
    }
}

