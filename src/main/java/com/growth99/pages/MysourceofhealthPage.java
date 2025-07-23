package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class MysourceofhealthPage {

	WebDriver driver;
	WebUtils webUtils;

	public MysourceofhealthPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils = new WebUtils(driver);
	}

	@FindBy (xpath="//li[@class='elementor-icon-list-item elementor-inline-item']//span[contains(text(), 'behealthy@mysourceofhealth.com')]")
	WebElement emailid;

	
public void clickonemailid()
{
	
	webUtils.verifyEmailId("//li[@class='elementor-icon-list-item elementor-inline-item']//span[contains(text(), 'behealthy@mysourceofhealth.com')]");
	webUtils.clickOnElement(emailid);
	webUtils.captureScreenshot("email");
}

	
	

}
