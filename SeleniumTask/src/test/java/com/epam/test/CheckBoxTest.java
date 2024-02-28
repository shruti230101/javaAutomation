package com.epam.test;

import com.epam.factory.WebDriverFactory;
import com.epam.Pages.CheckboxPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckBoxTest {

    WebDriver webDriver;
    CheckboxPage checkboxPage;

    @BeforeClass
    @Parameters("EnterWebDriver")
    public void settingUp(@Optional("chrome") String ChromeWebDriver)
    {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriver = webDriverFactory.initiateWebdriver(ChromeWebDriver);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
        checkboxPage = new CheckboxPage(webDriver);
    }

    @Test
    public void verifyFirstCheckBox()
    {
        Assert.assertTrue(checkboxPage.firstCheckBoxSelected());
    }

    @Test
    public void verifySecondCheckBox()
    {
        Assert.assertTrue(checkboxPage.secondCheckBoxDeselected());
    }

    @AfterTest
    public void removeServices()
    {
        checkboxPage = null;
        webDriver.close();
    }
}
