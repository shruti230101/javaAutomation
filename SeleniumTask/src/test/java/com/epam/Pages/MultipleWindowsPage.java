package com.epam.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    public boolean multipleWindows(WebDriver webDriver)
    {
        String originalWindow = webDriver.getWindowHandle();
        boolean areMultipleWindows = false;
        if(webDriver.getWindowHandles().size() == 1)
        {
            webDriver.findElement(By.linkText("Click Here")).click();
            for(String windowHandle : webDriver.getWindowHandles())
            {
                if(!originalWindow.contentEquals(windowHandle)) {
                    webDriver.switchTo().window(windowHandle);
                    areMultipleWindows = true;
                    break;
                }
            }
        }
        return areMultipleWindows;
    }
}
