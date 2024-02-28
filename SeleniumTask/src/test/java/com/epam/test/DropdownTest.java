package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.DropdownPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DropdownTest {

    WebDriver webDriver;
    DropdownPage dropdownPage;

    @BeforeClass
    @Parameters("EnterWebDriver")
    public void settingUp(@Optional("chrome") String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://the-internet.herokuapp.com/dropdown");
        dropdownPage = new DropdownPage(webDriver);
    }

    @Test
    public void verifyDropDown()
    {
        Assert.assertTrue(dropdownPage.dropdownVerification());
    }

    @AfterTest
    public void removeServices()
    {
        webDriver.quit();
        dropdownPage = null;
    }
}
