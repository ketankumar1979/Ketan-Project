package com.ketancucumber;

public class ResultPage extends DriverFactory {
    public String getResultPageUrl(){
       return driver.getCurrentUrl();
    }
}
