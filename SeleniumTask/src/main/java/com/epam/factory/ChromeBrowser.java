package com.epam.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    private static WebDriver chromeBrowserInstance;

    public static synchronized WebDriver getInstance()
    {
        if(chromeBrowserInstance == null)
            chromeBrowserInstance = new ChromeDriver();

        return chromeBrowserInstance;
    }
}
