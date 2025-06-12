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

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.SingleScriptValidationPage;

import com.growth99.utils.Utilities;

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
		driver=initilazeBrowserWithUrl("eaestheticsandacnecareUrl");
		SingleScriptValidationPage = new SingleScriptValidationPage(driver);
	}
	@Test(priority = 0)
	public void validateSingleScript(){
		JsonNode testData=	PreReleaseDataJsonData.get("validateSingleScript");
		
		SingleScriptValidationPage.validatecliffhangerBooknow();
		
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
