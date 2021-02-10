package com.google.pages;

import com.google.utils.Driver;
import com.google.utils.Driver2;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {

    @FindBy(className = "N6sL8d")
    private String searchResult;

    public GoogleSearch(){
        PageFactory.initElements(Driver2.getDriver(), this);
    }

    public String getSearchResult(){
        return searchResult;
    }


}
