package com.google.pages;


import com.google.utils.Driver;
import com.google.utils.Driver2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    @FindBy (name = "q")
    private WebElement searchBox;

    public MainPage(){
        PageFactory.initElements(Driver2.getDriver(), this);
    }

    public WebElement getSearchBox(){
        return searchBox;
    }

    public String getTitle(){
        return Driver2.getDriver().getTitle();
    }









}
