package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.AlertPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertTest {

    WebDriver webDriver;
    AlertPage alertService;

    @BeforeClass
    @Parameters("EnterWebDriver")
    public void settingUp(@Optional("chrome")String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
        alertService = new AlertPage();
    }

    @Test
    public void verifyJsAlertButton()
    {
        Assert.assertTrue(alertService.jsAlertButton(webDriver));
    }

    @Test
    public void verifyJsPromptButton()
    {
        Assert.assertTrue(alertService.jsPromptButton(webDriver));
    }
}
