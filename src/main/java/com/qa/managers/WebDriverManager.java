package com.qa.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverManager {
    private final String webDriverType;
    private WebDriver driver;

    public WebDriverManager(String webDriverType) {
        this.webDriverType = webDriverType;

    }
    public WebDriver getDriver(){
        if (driver == null){
            driver = createDriver();
        }
        return driver;
    }

    public void closeDriver(){
        driver.quit();
    }

    private WebDriver createDriver() {
        switch (webDriverType) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "FIREFOX":
                System.setProperty("webdriver.firefox.driver", "src/main/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("The driver was not created.");
                System.out.println("There isn't defined such type of Driver: " + webDriverType);
        }
        return driver;
    }
}
