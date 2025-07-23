package com.growth99.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class HamburgerAndHeaderPage {

	WebDriver driver;
	WebUtils webUtils;

	public HamburgerAndHeaderPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}

	@FindBy (xpath="//video[@class='elementor-background-video-hosted']")
	WebElement heroimage;
	


	
	public void validateHeroMedialoading() {
		webUtils.validateHeroMedia(By.xpath("//video[@class='elementor-background-video-hosted']"),null);
		webUtils.captureScreenshot("desktop");
	}

	public void validateHeroMedialoadingiphone() {
		webUtils.validateHeroMedia(By.xpath("//video[@class='elementor-background-video-hosted']"),null);
		webUtils.captureScreenshot("iphone");
	}

	public void validateHeroMedialoadingipad() {
		webUtils.validateHeroMedia(By.xpath("//video[@class='elementor-background-video-hosted']"),null);
		webUtils.captureScreenshot("ipad");
	}

}
