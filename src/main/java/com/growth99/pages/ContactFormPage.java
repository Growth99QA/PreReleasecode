package com.growth99.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.growth99.utils.WebUtils;

public class ContactFormPage {

	WebDriver driver;
	WebUtils webUtils;

	public ContactFormPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils = new WebUtils(driver);
	}
	
	String thankYouUrl="https://kathrynrussoaesthetics.com/thank-you/";

	@FindBy (xpath="//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-5962']//a[contains(text(),'Contact')]")
	WebElement contactMenu;

	@FindBy (xpath="//iframe[@title='Contact Form']")
	WebElement contactFormIframe;

	@FindBy (xpath="//input[@name='First Name']")
	WebElement firstName;

	@FindBy (xpath="//input[@name='Last Name']")
	WebElement lastName;

	@FindBy (xpath="//input[@name='Email']")
	WebElement email;

	@FindBy (xpath="//input[@name='Phone Number']")
	WebElement phoneNumber;

	@FindBy (xpath="//input[@value='Facebook']")
	WebElement faceBookCheckBox;

	@FindBy (xpath="//input[@value='Botox/Dysport']")
	WebElement botoxCheckBox;

	@FindBy (xpath="//input[@name='I Consent']")
	WebElement consentCheckbox;

	@FindBy (xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy (xpath="//img[@class='attachment-full size-full wp-image-510']")
	WebElement websiteLogo;



	public void switchBackToDefaultContent(){
		webUtils.switchToDefaultContent();
	}

	public void clickOnSubmitButton() {
		webUtils.scrollToElement(submitButton);
		webUtils.waitForElementToBeClickable(By.xpath("//button[@type='submit']"));
		webUtils.clickTheElement(submitButton);
	}

	public void clickOnConsentCheckbox() {
		webUtils.clickOnElement(consentCheckbox);
	}

	public void enterPhone(String phone) {
		webUtils.enterText(phoneNumber, phone);
	}

	public void enterEmail(String emailAddress) {
		webUtils.enterText(email, emailAddress);
	}

	public void enterLastName(String lname) {
		webUtils.enterText(lastName, lname);
	}

	public void enterFirstName(String fname) {
		webUtils.enterText(firstName, fname);
	}

	public void switchToContactFormIframe() {
		webUtils.scrollToElement(contactFormIframe);
		driver.switchTo().frame(contactFormIframe);
		
	}

	public void clickOnContactMenu() {
		webUtils.clickOnElement(contactMenu);
	}

	public void validateThankYouPageAfterSubmittingContactForm() {
		webUtils.waitForURLToContain(thankYouUrl);
		webUtils.validateCurrentURL(thankYouUrl);
	}

	public void navigateToHomePage() {
		webUtils.clickOnElement(websiteLogo);
	}


	public void submitContactForm(HashMap<String, String> data) {
		clickOnContactMenu();
		switchToContactFormIframe();
		webUtils.captureScreenshot("ContactformDesktop");
		enterFirstName(data.get("firstname"));
		enterLastName(data.get("lastname"));
		enterEmail(data.get("email"));
		enterPhone(data.get("mobile"));
		//clickOnConsentCheckbox();
		clickOnSubmitButton();
		webUtils.captureScreenshot("thankyouPAageDesktop");
		
	
		
	}
	public void submitContactFormIphone(HashMap<String, String> data) {
		clickOnContactMenu();
		switchToContactFormIframe();
		webUtils.captureScreenshot("ContactformIphone");
		enterFirstName(data.get("firstname"));
		enterLastName(data.get("lastname"));
		enterEmail(data.get("email"));
		enterPhone(data.get("mobile"));
		//clickOnConsentCheckbox();
		clickOnSubmitButton();
		webUtils.captureScreenshot("thankyouPAageIphone");
	
	
	}
	public void submitContactFormIpad(HashMap<String, String> data) {
		clickOnContactMenu();
		switchToContactFormIframe();
		webUtils.captureScreenshot("ContactformIpad");
		enterFirstName(data.get("firstname"));
		enterLastName(data.get("lastname"));
		enterEmail(data.get("email"));
		enterPhone(data.get("mobile"));
		//clickOnConsentCheckbox();
		clickOnSubmitButton();
		webUtils.captureScreenshot("thankyouPAageIpad");
		
		}
	
}