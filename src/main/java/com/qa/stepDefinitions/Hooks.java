package com.qa.stepDefinitions;

import contextManagers.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void setUpBeforeEachTest() {
        testContext.getWebDriverManager().getDriver();
    }

    @After
    public void tearDownAfterEachTest() {
        testContext.getWebDriverManager().closeDriver();
    }
}
