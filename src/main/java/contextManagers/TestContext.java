package contextManagers;

import com.qa.managers.PropertiesManagers;
import com.qa.managers.WebDriverManager;

public class TestContext {
    private final WebDriverManager webDriverManager;
    public TestContext() {
        webDriverManager = new WebDriverManager(PropertiesManagers.getBrowserType());
    };

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }
}
