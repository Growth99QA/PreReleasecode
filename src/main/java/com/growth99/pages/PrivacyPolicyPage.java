package com.growth99.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.growth99.utils.Utilities;
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
