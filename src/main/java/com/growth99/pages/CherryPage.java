package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class CherryPage {

	WebDriver driver;
	WebUtils webUtils;

	public CherryPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}

	@FindBy (xpath="//a[text()='ABOUT']")
	WebElement aboutUsMenu;

	@FindBy (xpath="//a[text()='ABOUT US']")
	WebElement aboutUsSubMenu;

	@FindBy (xpath="//h1")
	WebElement pageTitle;
	
	@FindBy (xpath="//img[@alt='Cherry Medical Aesthetics logo']")
	WebElement cherryLogo;
	
	@FindBy (xpath="//img[@alt='ABOUT US at Cherry Medical Aesthetics in Denver, CO']")
	WebElement aboutUsPageHeroImage;
	
	
	public void clickOnAboutUsMenu() {
		webUtils.clickOnElement(aboutUsMenu);
	}

	public void mouseHoverOnAboutUs() {
		webUtils.hoverOverElement(aboutUsMenu);
	}

	public void clickOnAboutUsSubMenu() {
		webUtils.clickOnElement(aboutUsSubMenu);
	}

	public String getPageTitle() {
		String actualPageTitle =	webUtils.getText(pageTitle);
		return actualPageTitle;
	}
	
	public void navigateToHomePage() {
		webUtils.clickOnElement(cherryLogo);
	}

	public boolean validateAboutUsHeroImage() {
		boolean status = webUtils.isImageValid(aboutUsPageHeroImage, "About Us Page Hero Image");
		return status;
       
    }
}
