package com.growth99.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.growth99.utils.Utilities;
import com.growth99.utils.WebUtils;

public class ChatBotLogoValidationPage {

	WebDriver driver;
	WebUtils webUtils;
	public ChatBotLogoValidationPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}


	@FindBy (xpath="//div[@class='chatbot-icon-bg']")
	WebElement chatBotLogo;

	public void validateChatbotLogo() {
		String style = webUtils.getAttribute(chatBotLogo, "style");
		System.out.println(style);
		int start = style.indexOf("url(");
		int end = style.indexOf(")", start);
		String url = style.substring(start + 4, end).replace("'", "").replace("\"", "");
		System.out.println("Extracted URL: " + url);
		webUtils.isImageValid(url, "Chatbot Logo");
		webUtils.captureScreenshot("chatbotlogoDesktop");
		webUtils.captureScreenshot("chatbotlogoiphone");
	}
	public void validateChatbotLogoOnIphone() {
		String style = webUtils.getAttribute(chatBotLogo, "style");
		System.out.println(style);
		int start = style.indexOf("url(");
		int end = style.indexOf(")", start);
		String url = style.substring(start + 4, end).replace("'", "").replace("\"", "");
		System.out.println("Extracted URL: " + url);
		webUtils.isImageValid(url, "Chatbot Logo");
		webUtils.captureScreenshot("chatbotlogoiphone");

	}
	public void validateChatbotLogoOnIpad() {
		String style = webUtils.getAttribute(chatBotLogo, "style");
		System.out.println(style);
		int start = style.indexOf("url(");
		int end = style.indexOf(")", start);
		String url = style.substring(start + 4, end).replace("'", "").replace("\"", "");
		System.out.println("Extracted URL: " + url);
		webUtils.isImageValid(url, "Chatbot Logo");
		webUtils.captureScreenshot("chatbotlogoipad");

	}
	
	 
}
