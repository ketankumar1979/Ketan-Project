package com.ketancucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setup(){
        driverFactory.openBrowser();
        driverFactory.maximiseBrowser();
        driverFactory.impliciteWait();
    }
    @After
    public void teardown(){
        driverFactory.closeBrowser();
    }
}
