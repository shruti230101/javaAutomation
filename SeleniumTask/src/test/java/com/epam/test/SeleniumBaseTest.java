package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.SeleniumBasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumBaseTest {

    WebDriver webDriver;
    SeleniumBasePage seleniumBase;

    @BeforeClass
    @Parameters("ChromeWebDriver")
    public void setSeleniumBase(@Optional("chrome")String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.navigate().to("https://seleniumbase.io/demo_page");
        seleniumBase = new SeleniumBasePage();
    }

    @Test
    public void verifyTestInputField()
    {
        Assert.assertEquals(seleniumBase.verifyTextInputField(webDriver).getAttribute("value"), "Shruti");
    }

    @Test
    public void verifyExtractedMessage()
    {
        Assert.assertEquals(seleniumBase.extractText(webDriver).getText(), "iFrame Text");
    }
}
