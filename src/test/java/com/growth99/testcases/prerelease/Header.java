package com.growth99.testcases.prerelease;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.HeaderstickyPage;


public class Header extends BaseClass {

	WebDriver driver;
	public JsonNode PreReleaseDataJsonData;
	com.growth99.pages.HeaderstickyPage HeaderstickyPage;


	Header(){
		super();
		PreReleaseDataJsonData = getJsonData("PreReleaseData.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("cherryMediSpaUrl");
		HeaderstickyPage = new com.growth99.pages.HeaderstickyPage(driver);
	}


	@Test(priority = 0)
	public void validateHeader(){
		JsonNode testData=	PreReleaseDataJsonData.get("validateHeroimageandvideoloading");
		HeaderstickyPage.validateheader();
		
		//driver.manage().window().setSize(new Dimension(390, 840)); // iPhone 12 size
		
//		driver.manage().window().setSize(new Dimension(1024, 1366));  //ipad
//		HeroMediaCheckPage.validateHeroMedialoadingipad();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
