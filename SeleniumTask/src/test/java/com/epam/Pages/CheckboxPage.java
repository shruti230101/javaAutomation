package com.epam.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends Page{

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement firstCheckBox;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement secondCheckBox;

    public CheckboxPage(WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public boolean firstCheckBoxSelected()
    {
        firstCheckBox.click();
        return firstCheckBox.isSelected();
    }

    public boolean secondCheckBoxDeselected()
    {
        secondCheckBox.click();
        return firstCheckBox.isSelected();
    }
}

