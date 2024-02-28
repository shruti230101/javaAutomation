package com.epam.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumBasePage {

    public WebElement verifyTextInputField(WebDriver webDriver)
    {
        WebElement inputField = webDriver.findElement(By.id("myTextInput2"));
        inputField.clear();
        inputField.sendKeys("Shruti");
        return inputField;
    }

    public WebElement extractText(WebDriver webDriver)
    {
        WebElement iFrame = webDriver.findElement(By.id("myFrame2"));
        webDriver.switchTo().frame(iFrame);
        return webDriver.findElement(By.cssSelector("body"));

        //this will fail because we have switched to the frame, we need to again do switchTo defaultContent
        //webDriver.findElement(By.id("radioButton2")).click();
    }
}
