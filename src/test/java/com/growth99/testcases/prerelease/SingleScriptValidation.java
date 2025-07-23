package com.growth99.testcases.prerelease;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.SingleScriptValidationPage;

public class SingleScriptValidation extends BaseClass {

	WebDriver driver;
	public JsonNode PreReleaseDataJsonData;
	SingleScriptValidationPage SingleScriptValidationPage;


	SingleScriptValidation(){
		super();
		PreReleaseDataJsonData = getJsonData("PreReleaseData.json");
	}


	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("preRElease");
		SingleScriptValidationPage = new SingleScriptValidationPage(driver);
	}
	@Test(priority = 0)
	public void validateSingleScript(){
		//JsonNode testData=	PreReleaseDataJsonData.get("validateSingleScript");
		
		SingleScriptValidationPage.validatecliffhangerBooknow();
		
		 // iPhone 12
		driver.manage().window().setSize(new Dimension(390, 840)); // iPhone 12
		SingleScriptValidationPage.validateCliffhangerBooknowoOnIphone();
		
		driver.manage().window().setSize(new Dimension(1024, 1366)); 
		SingleScriptValidationPage.validateCliffhangerBooknowoOnIpad();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
