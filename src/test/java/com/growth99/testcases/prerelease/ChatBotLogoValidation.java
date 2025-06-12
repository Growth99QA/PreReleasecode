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
import com.growth99.pages.ChatBotLogoValidationPage;
import com.growth99.pages.GooglePage;
import com.growth99.pages.RumaPage;
import com.growth99.utils.Utilities;

public class ChatBotLogoValidation extends BaseClass {

	WebDriver driver;
	public JsonNode PreReleaseDataJsonData;
	ChatBotLogoValidationPage ChatBotLogoValidationPage;


	//	setup-->career-->tearDown, setup-->contact-->tearDown

	ChatBotLogoValidation(){
		super();
		PreReleaseDataJsonData = getJsonData("PreReleaseData.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("cherryMediSpaUrl");
		ChatBotLogoValidationPage = new ChatBotLogoValidationPage(driver);

	}


	@Test(priority = 0)
	public void validateChatbot(){
		JsonNode testData=	PreReleaseDataJsonData.get("validateChatbotLogo");
		ChatBotLogoValidationPage.validateChatbotLogo();
		driver.manage().window().setSize(new Dimension(390, 840)); // iPhone 12 size
		ChatBotLogoValidationPage.validateChatbotLogoOnIphone();
		driver.manage().window().setSize(new Dimension(1024, 1366));  //ipad Pro View
		ChatBotLogoValidationPage.validateChatbotLogoOnIpad();
	}



	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
