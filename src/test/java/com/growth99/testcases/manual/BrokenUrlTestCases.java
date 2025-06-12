package com.growth99.testcases.manual;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.CherryPage;
import com.growth99.pages.GooglePage;
import com.growth99.pages.RumaPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BrokenUrlTestCases extends BaseClass {

    WebDriver driver;
    public JsonNode rumaJsonData;
    com.growth99.pages.BrokenLinkPage BrokenLinkPage;

    @BeforeClass
    public void setup() {
        driver = initilazeBrowserWithUrl("googleUrl");
        BrokenLinkPage = new com.growth99.pages.BrokenLinkPage(driver);
    }

//    @Test(priority = 1)
    public void validateRumaUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:ruma.com", "https://ruma.com");
        System.out.println("****************************************************************************");
    }

    @Test(priority = 2)
    public void validateCherryUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:cherrymedispa.com", "https://cherrymedispa.com");
        System.out.println("****************************************************************************");
    }

    @Test(priority = 3)
    public void validateAramedspaUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:aramedspa.com", "https://aramedspa.com");
        System.out.println("****************************************************************************");
    }

    @Test(priority = 4)
    public void validateArabellaknoxspaUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:arabellaknox.com", "https://arabellaknox.com");
        System.out.println("****************************************************************************");
    }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
