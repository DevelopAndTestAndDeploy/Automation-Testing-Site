package com.automationtestingsite.tests;

import com.automationtestingsite.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.automationtestingsite.tests.DriverFactory.driver;
import static com.automationtestingsite.tests.DriverFactory.getDriver;

public class OrderComplete extends BasePage {

    public OrderComplete() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = (getDriver());
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver = null;
    }

    @Test
    public void endToEndTest() {
        HomePage home = new HomePage(driver);
        home.getTestStoreLink().click();
    }



}
