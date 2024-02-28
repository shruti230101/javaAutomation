package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.MultipleWindowsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultipleWindowsTest {

    WebDriver webDriver;
    MultipleWindowsPage multipleWindowsService;

    @BeforeClass
    @Parameters("EnterWebDriver")
    public void settingUp(@Optional("chrome")String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://the-internet.herokuapp.com/windows");
        multipleWindowsService = new MultipleWindowsPage();
    }

    @Test
    public void verifyInputField()
    {
        Assert.assertTrue(multipleWindowsService.multipleWindows(webDriver));
    }


    @AfterTest
    public void removeServices()
    {
        multipleWindowsService = null;
    }
}
