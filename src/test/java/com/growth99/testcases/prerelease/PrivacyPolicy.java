package com.growth99.testcases.prerelease;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.growth99.pages.PrivacyPolicyPage;
import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;

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
		driver=initilazeBrowserWithUrl("preRElease");
		PrivacyPolicyPage = new PrivacyPolicyPage(driver);
	}
	@Test(priority = 0)
	public void validatePrivacyPolicy(){
		//JsonNode testData=	PreReleaseDataJsonData.get("validatePrivacyPolicy");
		
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
