package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class PrivacyPolicyPage {

	WebDriver driver;
	WebUtils webUtils;

	public PrivacyPolicyPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}

	@FindBy (xpath="//a[contains(text(),'Privacy Policy')]")
	WebElement privacyPolicy;

	public void privacyPolicyOnfooter() {

		webUtils.scrollToBottom();
		webUtils.scrollToElement(privacyPolicy);
		webUtils.captureScreenshot("PrivacyPolicyDesktop");
		webUtils.clickOnElement(privacyPolicy);

	}
		public void privacyPolicyOnfooterIpad() {

		webUtils.scrollToBottom();
		webUtils.scrollToElement(privacyPolicy);
		webUtils.captureScreenshot("PrivacyPolicyIpad");
		
	}
		public void privacyPolicyOnfooterIphone() {

			webUtils.scrollToBottom();
			webUtils.scrollToElement(privacyPolicy);
			webUtils.captureScreenshot("PrivacyPolicyiphone");
		}

}
