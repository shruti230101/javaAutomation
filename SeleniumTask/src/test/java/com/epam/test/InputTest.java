package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.InputPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class InputTest {

    WebDriver webDriver;
    InputPage inputServices;

    @BeforeClass
    @Parameters("EnterWebDriver")
    public void settingUp(String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://the-internet.herokuapp.com/inputs");
        inputServices = new InputPage();
    }

    @Test
    public void verifyInputField()
    {
        Assert.assertEquals(inputServices.verifyInputTextField(webDriver), "3");
    }

    @Test
    public void verfiyArrowUpKey()
    {
        Assert.assertNotEquals(inputServices.verifyInputTextField(webDriver), inputServices.usingArrowUpKey(webDriver));
    }

    @Test
    public void verfiyArrowDownKey()
    {
        Assert.assertNotEquals(inputServices.verifyInputTextField(webDriver), inputServices.usingArrowDownKey(webDriver));
    }

    @AfterTest
    public void removeServices()
    {
        inputServices = null;
    }
}
