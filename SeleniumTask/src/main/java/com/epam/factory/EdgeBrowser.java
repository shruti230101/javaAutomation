package com.epam.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    private static WebDriver edgeBrowserInstance;
    public static synchronized WebDriver getInstance()
    {
        if(edgeBrowserInstance == null)
            edgeBrowserInstance = new EdgeDriver();

        return edgeBrowserInstance;
    }


}
