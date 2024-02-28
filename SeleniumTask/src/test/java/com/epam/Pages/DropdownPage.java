package com.epam.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends Page {

    @FindBy(id = "dropdown")
    private WebElement dropdownMenu;

    public DropdownPage(WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public boolean dropdownVerification()
    {
        Select dropdown = new Select(dropdownMenu);
        dropdown.selectByVisibleText("Option 1");
        return dropdown.getFirstSelectedOption().isSelected();
    }
}
