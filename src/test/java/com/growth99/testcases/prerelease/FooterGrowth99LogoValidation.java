package com.growth99.testcases.prerelease;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.FooterGrowth99LogoValidationPage;

public class FooterGrowth99LogoValidation extends BaseClass {

WebDriver driver;
public JsonNode FooterGrowth99LogoValidationJsonData;
FooterGrowth99LogoValidationPage FooterGrowth99LogoValidationPage;


// setup-->career-->tearDown, setup-->contact-->tearDown

FooterGrowth99LogoValidation(){
super();
FooterGrowth99LogoValidationJsonData = getJsonData("FooterGrowth99LogoValidation.json");
}

@BeforeClass
public void setup() {
driver=initilazeBrowserWithUrl("cherryMediSpaUrl");
FooterGrowth99LogoValidationPage = new FooterGrowth99LogoValidationPage(driver);

}


@Test(priority = 0)
public void validateFooterGrowth99Logo() throws InterruptedException{
//JsonNode testData= FooterGrowth99LogoValidationJsonData.get("validateChatbotLogo");
Thread.sleep(15000);
FooterGrowth99LogoValidationPage.validateFooterGrowth99Logo();
Thread.sleep(10000);

driver.manage().window().setSize(new org.openqa.selenium.Dimension(375, 812)); // iPhone X size
Thread.sleep(10000);
FooterGrowth99LogoValidationPage.validateFooterGrowth99LogoOnIphone();
}

//@Test(priority = 1)
public void validateChatbotOnIphone() throws InterruptedException{
JsonNode testData= FooterGrowth99LogoValidationJsonData.get("validateChatbotLogo");
Thread.sleep(5000);

driver.manage().window().setSize(new org.openqa.selenium.Dimension(375, 812)); // iPhone X size
Thread.sleep(10000);
FooterGrowth99LogoValidationPage.validateFooterGrowth99LogoOnIphone();
}


@AfterClass
public void tearDown() {
driver.quit();
}


}