package com.growth99.testcases;

import java.io.IOException;
import java.net.*;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.CherryPage;

public class CherryMediSpaTestCase extends BaseClass{

	WebDriver driver;
	public JsonNode cherryJsonData;
	CherryPage cherryPage;
	
	CherryMediSpaTestCase(){
		super();
		cherryJsonData = getJsonData("CherryTestData.json");
	}
	
	
	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("cherryMediSpaUrl");
		cherryPage = new CherryPage(driver);
	}

	
	@Test(priority = 0)
	public void validateCareerSubMenu() throws InterruptedException{
		
		JsonNode testData=	cherryJsonData.get("validateCareerSubMenu");
		
		cherryPage.navigateToHomePage();
		String expectedAboutUsTitle = testData.get("expectedAboutUsTitle").asText();
		cherryPage.mouseHoverOnAboutUs();
		cherryPage.clickOnAboutUsSubMenu();
		String actualAboutUsTitle = cherryPage.getPageTitle();
		Assert.assertEquals(actualAboutUsTitle, expectedAboutUsTitle, testData.get("assertValidationText").asText());
		
	}
	
	@Test(priority = 1)
	public void validateAboutUsTabTitle() {
		JsonNode testData=	cherryJsonData.get("validateAboutUsTabTitle");
		cherryPage.navigateToHomePage();
		String expectedTabTitle = testData.get("expectedTabTitle").asText();
		cherryPage.mouseHoverOnAboutUs();
		cherryPage.clickOnAboutUsSubMenu();
		String actualTabTitle = driver.getTitle();
		Assert.assertEquals(actualTabTitle, expectedTabTitle,testData.get("assertTabTitleValidation").asText());
	}
	
	@Test(priority = 2)
	public void validateAboutUsHeroImage() throws MalformedURLException, IOException {
		JsonNode testData=	cherryJsonData.get("validateAboutUsHeroImage");
		cherryPage.navigateToHomePage();
		cherryPage.mouseHoverOnAboutUs();
		cherryPage.clickOnAboutUsSubMenu();
		boolean status = cherryPage.validateAboutUsHeroImage();
		Assert.assertEquals(status, true,testData.get("assertAboutUsHeroImageValidation").asText());
		
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
