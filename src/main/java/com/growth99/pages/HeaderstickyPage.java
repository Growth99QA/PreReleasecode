package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class HeaderstickyPage {

	WebDriver driver;
	WebUtils webUtils;

	public HeaderstickyPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}
	
	
	public void validateheader() {

		webUtils.verifyEmailId("//span[contains(text(),'reception@cherrymedispa.com')]");
		webUtils.verifyMobileNumber("//span[@class='elementor-icon-list-text'][normalize-space()='(720) 479-8793']");
		
		//		webUtils.checkAndClickHamburgerMenuMobile(null);
		//		webUtils.captureScreenshot("iPhone");
		//		webUtils.verifySocialMediaIcons(null);
		//		webUtils.verifyMobileNumber(null);

	}	       
}
