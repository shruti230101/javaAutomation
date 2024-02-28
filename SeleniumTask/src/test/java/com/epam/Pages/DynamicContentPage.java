package com.epam.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicContentPage {

    public boolean verifyDynamicContent(WebDriver webDriver)
    {
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/img"));
        webDriver.navigate().refresh();

//        new FluentWait<>(webDriver)
//                .withTimeout(Duration.ofSeconds(2))
//                .pollingEvery(Duration.ofMillis(300))
//                .ignoring(ElementNotInteractableException.class);

        return element.isDisplayed();
    }
}
