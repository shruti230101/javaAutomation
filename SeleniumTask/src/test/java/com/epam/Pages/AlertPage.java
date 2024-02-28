package com.epam.Pages;

import org.openqa.selenium.*;

public class AlertPage {

    public boolean jsAlertButton(WebDriver webDriver)
    {
        WebElement jsAlert = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        jsAlert.click();
        try
        {
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }
    }

    public boolean jsConfirmButtonOk(WebDriver webDriver)
    {
        WebElement jsConfirm = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        jsConfirm.click();
        try
        {
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }
    }

    public boolean jsConfirmButtonCancel(WebDriver webDriver)
    {
        WebElement jsConfirm = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        jsConfirm.click();
        try
        {
            Alert alert = webDriver.switchTo().alert();
            alert.dismiss();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }
    }

    public boolean jsPromptButton(WebDriver webDriver)
    {
        WebElement jsPrompt = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        jsPrompt.click();
        try
        {
            Alert alert = webDriver.switchTo().alert();
            alert.sendKeys("Shruti");
            alert.accept();
            return true;
        }
        catch(NoAlertPresentException e)
        {
            return false;
        }
    }
}
