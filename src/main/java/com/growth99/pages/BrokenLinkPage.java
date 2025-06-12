package com.growth99.pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.growth99.utils.WebUtils;

public class BrokenLinkPage {

	WebDriver driver;
	WebUtils webUtils;
	Set<String> allLinks = new HashSet<>();

	public BrokenLinkPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils=new WebUtils(driver);
	}

	
	
	@FindBy (xpath="//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy (xpath="//textarea[@name='q']")
	WebElement searchBox;

	public boolean isNextButtonPresent() {
		boolean status = false;
		try {
			status=nextButton.isDisplayed();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
    }
	
	public void clickOnNextBtn() {
		try {
		nextButton.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterSiteInGoogleSearch(String site) {
		try {
		searchBox.sendKeys(site);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Actions myActions = new Actions(driver);
		myActions.keyDown(Keys.ENTER).keyDown(Keys.ENTER).build().perform();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void extractLinksOnCurrentPage(String domain) {
        List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'" + domain + "')]"));
        for (WebElement link : links) {
            String href = link.getDomAttribute("href");
            if (href != null && !allLinks.contains(href)) {
                allLinks.add(href);
            }
        }
    }
	
	public void collectAllLinks(String domain) {
        while (true) {
            extractLinksOnCurrentPage(domain);

            if (isNextButtonPresent()) {
            	clickOnNextBtn();
            } else {
                break;
            }
        }
    }
	
	 public void validateAllLinks() {
	        for (String url : allLinks) {
	            if (webUtils.isLinkBroken(url)) {
	                System.out.println("❌ Broken: " + url);
	            } else {
	                System.out.println("✅ Working: " + url);
	            }
	        }
	    }

	 public void validateSiteUrl(String site, String domain) {
		 enterSiteInGoogleSearch(site);
		 collectAllLinks(domain);
		 validateAllLinks();
		 allLinks.clear();
	 }
}
