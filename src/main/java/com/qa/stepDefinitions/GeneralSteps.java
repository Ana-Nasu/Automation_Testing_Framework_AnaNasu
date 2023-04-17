package com.qa.stepDefinitions;

import contextManagers.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;

public class GeneralSteps {
    private final TestContext testContext;
    public GeneralSteps(TestContext context){
        testContext = context;
    }
    @Given("{string} is accessed")
    public void isAccessed(String string) {
        testContext.getWebDriverManager().getDriver().get(string);

    }


}
