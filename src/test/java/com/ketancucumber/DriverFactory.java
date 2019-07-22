package com.ketancucumber;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void openBrowser(){
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("https://www.argos.co.uk/");
    }
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    public void impliciteWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
    }
}
