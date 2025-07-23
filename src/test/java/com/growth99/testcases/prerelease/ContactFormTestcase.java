package com.growth99.testcases.prerelease;

import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.ContactFormPage;
import com.growth99.utils.Utilities;
import com.fasterxml.jackson.databind.JsonNode;


public class ContactFormTestcase extends BaseClass {
	WebDriver driver;
	public JsonNode contactfromJsonData ;
	ContactFormPage contactFormPage;


	ContactFormTestcase(){
		super();
		contactfromJsonData = getJsonData("ContactFormTestData.json");
	}

	@BeforeClass
	public void setup() {
		driver=initilazeBrowserWithUrl("preRElease");
		contactFormPage = new ContactFormPage(driver);	
	}


	@Test(priority = 0)
	public void submitContactForm()  {
		JsonNode testData=	contactfromJsonData.get("submitContactForm");
		
		HashMap<String, String> mapObj = new HashMap<String, String>();
		mapObj.put("firstname",testData.get("firstName").asText());
		mapObj.put("lastname",testData.get("lastName").asText());
		mapObj.put("email",testData.get("email").asText());
		mapObj.put("mobile", Utilities.generateRandomNumber());
		contactFormPage.navigateToHomePage();	
		contactFormPage.submitContactForm(mapObj);
		contactFormPage.switchBackToDefaultContent();
		contactFormPage.validateThankYouPageAfterSubmittingContactForm();
			
		
	}
	@Test(priority = 1)
	public void submitContactFormIphone()  {
		driver.manage().window().setSize(new Dimension(390, 840)); // iPhone 12

		JsonNode testData=	contactfromJsonData.get("submitContactForm");
		
		HashMap<String, String> mapObj = new HashMap<String, String>();
		mapObj.put("firstname",testData.get("firstName").asText());
		mapObj.put("lastname",testData.get("lastName").asText());
		mapObj.put("email",testData.get("email").asText());
		mapObj.put("mobile", Utilities.generateRandomNumber());
		contactFormPage.navigateToHomePage();	
		contactFormPage.submitContactForm(mapObj);
		contactFormPage.switchBackToDefaultContent();
		contactFormPage.validateThankYouPageAfterSubmittingContactForm();
	
		
	}
	@Test(priority = 2)
	public void submitContactFormIpad()  {
		driver.manage().window().setSize(new Dimension(1024, 1366)); 
		
		JsonNode testData=	contactfromJsonData.get("submitContactForm");
		
		HashMap<String, String> mapObj = new HashMap<String, String>();
		mapObj.put("firstname",testData.get("firstName").asText());
		mapObj.put("lastname",testData.get("lastName").asText());
		mapObj.put("email",testData.get("email").asText());
		mapObj.put("mobile", Utilities.generateRandomNumber());
		contactFormPage.navigateToHomePage();	
		contactFormPage.submitContactForm(mapObj);
		contactFormPage.switchBackToDefaultContent();
		contactFormPage.validateThankYouPageAfterSubmittingContactForm();
		
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
