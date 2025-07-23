package com.growth99.pages;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class ViewMoreButtonPage {

	WebDriver driver;
	WebUtils webUtils;

	public ViewMoreButtonPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}


	public void validateViewmoreLearnmorebutton() {

		List<String> urls = Arrays.asList(
				"https://monarchcharleston.gogroth.com/",
				"https://monarchcharleston.gogroth.com/",
				"https://monarchcharleston.gogroth.com/blog/"
				);
		webUtils.checkMoreButtonsOnPages(driver, urls);
		webUtils.captureScreenshot("viewmore button");
	}
}
