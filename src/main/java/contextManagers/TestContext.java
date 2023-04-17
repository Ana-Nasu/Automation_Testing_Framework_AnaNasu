package contextManagers;

import com.qa.managers.WebDriverManager;

public class TestContext {
    private final WebDriverManager webDriverManager;
    public TestContext() {
        webDriverManager = new WebDriverManager("CHROME");
    };

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }
}
