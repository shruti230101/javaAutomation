package com.epam.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputPage {

    public String verifyInputTextField(WebDriver webDriver)
    {
        WebElement inputField = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
        inputField.sendKeys("3");
        return inputField.getAttribute("value");
    }

    public String usingArrowUpKey(WebDriver webDriver)
    {
        WebElement inputField = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
        inputField.sendKeys(Keys.ARROW_UP);
        return inputField.getAttribute("value");
    }

    public String usingArrowDownKey(WebDriver webDriver)
    {
        WebElement inputField = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
        inputField.sendKeys(Keys.ARROW_DOWN);
        return inputField.getAttribute("value");
    }
}
