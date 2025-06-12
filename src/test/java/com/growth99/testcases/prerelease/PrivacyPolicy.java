package com.growth99.testcases.prerelease;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.growth99.pages.PrivacyPolicyPage;
import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.SingleScriptValidationPage;

import com.growth99.utils.Utilities;

public class PrivacyPolicy extends BaseClass {

	WebDriver driver;
	public JsonNode PreReleaseDataJsonData;
	PrivacyPolicyPage PrivacyPolicyPage;


	PrivacyPolicy(){
		super();
		PreReleaseDataJsonData = getJsonData("PreReleaseData.json");
	}

	

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("eaestheticsandacnecareUrl");
		PrivacyPolicyPage = new PrivacyPolicyPage(driver);
	}
	@Test(priority = 0)
	public void validatePrivacyPolicy(){
		JsonNode testData=	PreReleaseDataJsonData.get("validatePrivacyPolicy");
		
		PrivacyPolicyPage.privacyPolicyOnfooter();
		
		driver.manage().window().setSize(new Dimension(390, 840)); // iPhone 12
		PrivacyPolicyPage.privacyPolicyOnfooterIphone();
		
		driver.manage().window().setSize(new Dimension(1024, 1366)); 
		PrivacyPolicyPage.privacyPolicyOnfooterIpad();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
