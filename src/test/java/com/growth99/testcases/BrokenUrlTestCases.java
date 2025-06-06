package com.growth99.testcases;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.GooglePage;
import com.growth99.pages.RumaPage;
import com.growth99.utils.Utilities;

public class BrokenUrlTestCases extends BaseClass {

	WebDriver driver;
	public JsonNode rumaJsonData;
	RumaPage rumaPage;
	GooglePage googlPage;

	//	setup-->career-->tearDown, setup-->contact-->tearDown

	BrokenUrlTestCases(){
		super();
		rumaJsonData = getJsonData("RumaTestData.json");
	}

	@BeforeMethod
	public void setup() {
		driver=initilazeBrowserWithUrl("googleUrl");
		rumaPage = new RumaPage(driver);
		googlPage = new GooglePage(driver);
	}

	@Test(priority=1)
	public void validateRumaUrlsFromGoogle() {
//		driver.get("https://www.google.com/");
		googlPage.validateSiteUrl("site:ruma.com", "https://ruma.com");
		System.out.println("****************************************************************************");
		driver.quit();
	}

//	@Test(priority=0)
	public void validateCherryUrlsFromGoogle() {
//		driver.get("https://www.google.com/");
		googlPage.validateSiteUrl("site:cherrymedispa.com", "https://cherrymedispa.com");
		System.out.println("****************************************************************************");
		driver.quit();
	}

//	@Test(priority=3)
	public void validatearamedspaUrlsFromGoogle() {
//		driver.get("https://www.google.com/");
		googlPage.validateSiteUrl("site:aramedspa.com", "https://aramedspa.com");
		System.out.println("****************************************************************************");
		driver.quit();
	}
	
//	@Test(priority=4)
	public void validatearabellaknoxspaUrlsFromGoogle() {
//		driver.get("https://www.google.com/");
		googlPage.validateSiteUrl("site:arabellaknox.com", "https://arabellaknox.com");
		System.out.println("****************************************************************************");
		driver.quit();
	}

}
