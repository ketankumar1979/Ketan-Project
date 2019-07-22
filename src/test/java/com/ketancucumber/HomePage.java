package com.ketancucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    @FindBy(id = "searchTerm")
    private WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    private WebElement magnifierGlass;

    public String homePageUrl(){
        return driver.getCurrentUrl();
    }

    public void doSearch(String item){
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
    }
}
