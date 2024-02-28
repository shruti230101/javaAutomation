package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.DynamicContentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DynamicContentTest {

    WebDriver webDriver;
    DynamicContentPage dynamicContentServices;


    @BeforeClass
    @Parameters("EnterWebDriver")
    public void settingUp(String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://the-internet.herokuapp.com/dynamic_content");
        dynamicContentServices = new DynamicContentPage();
    }

    @Test
    public void verifyCheckBox()
    {
        Assert.assertFalse(dynamicContentServices.verifyDynamicContent(webDriver));
    }

    @AfterTest
    public void removeServices()
    {
        dynamicContentServices = null;
    }
}
