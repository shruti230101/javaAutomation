package com.epam.factory;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver initiateWebdriver(String browser)
    {
        return switch(browser.toLowerCase())
        {
            case "chrome" -> ChromeBrowser.getInstance();
            case "edge" -> EdgeBrowser.getInstance();
            default -> throw new BrowserNotFoundException(browser + " is not a browser.");
        };
    }

}
