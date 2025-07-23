package com.growth99.testcases.prerelease;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.ViewMoreButtonPage;

public class ViewMoreAndLearnmoreButton extends BaseClass {

	WebDriver driver;
	public JsonNode PreReleaseDataJsonData;
	ViewMoreButtonPage validateViewmoreButtonpage;

	ViewMoreAndLearnmoreButton(){
		super();
		PreReleaseDataJsonData = getJsonData("PreReleaseData.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("googleUrl");
		validateViewmoreButtonpage = new ViewMoreButtonPage(driver);
	}


	@Test(priority = 0)
	public void validateViewmoreLearnmorebutton(){
		//JsonNode testData=	PreReleaseDataJsonData.get("validateViewmoreLearnmorebutton");
		validateViewmoreButtonpage.validateViewmoreLearnmorebutton();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
