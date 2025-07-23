package com.growth99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class SingleScriptValidationPage {

	WebDriver driver;
	WebUtils webUtils;

	public SingleScriptValidationPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}


	//@FindBy (xpath="//span[contains(text(),'BOOK NOW')]")
	//WebElement cliffhangerBooknow;

	@FindBy (xpath="//button[@aria-label='Book Now']")
	WebElement SingleScriptBooknow;

	@FindBy (xpath="//button[@aria-label='Self Assessment']")
	WebElement SingleScriptSelfAssessment;
	@FindBy (xpath="//button[@aria-label='Contact']")
	WebElement SingleScriptContact;
	@FindBy (xpath="//button[@aria-label='Feedback']")
	WebElement SingleScriptFeedback;


	public void validatecliffhangerBooknow() {
		//webUtils.switchToFrameByElement(cliffhangerBooknow);

		webUtils.clickOnElement(SingleScriptSelfAssessment);
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Self Assessment')]"));
		webUtils.captureScreenshot("SingleScriptSelfAssessmentDESKTOP");
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptContact);
		webUtils.captureScreenshot("SingleScriptContactDESKTOP");
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Contact')]"));
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptFeedback);
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Feedback')]"));
		webUtils.captureScreenshot("SingleScriptFeedbackDESKTOP");
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptBooknow);
		webUtils.captureScreenshot("SingleScriptBooknowDesktop");
		
	}
	public void validateCliffhangerBooknowoOnIphone() {
		webUtils.clickOnElement(SingleScriptSelfAssessment);
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Self Assessment')]"));
		webUtils.captureScreenshot("SingleScriptSelfAssessmentIphone");
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptContact);
		webUtils.captureScreenshot("SingleScriptContactIphone");
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Contact')]"));
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptFeedback);
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Feedback')]"));
		webUtils.captureScreenshot("SingleScriptFeedbackIphone");
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptBooknow);
		webUtils.captureScreenshot("SingleScriptBooknowIphone");

	}
	
	public void validateCliffhangerBooknowoOnIpad() {
		webUtils.clickOnElement(SingleScriptSelfAssessment);
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Self Assessment')]"));
		webUtils.captureScreenshot("SingleScriptSelfAssessmentIPad");
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptContact);
		webUtils.captureScreenshot("SingleScriptContactIpad");
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Contact')]"));
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptFeedback);
		webUtils.waitForElementToBeVisible(By.xpath("//h2[contains (text(),'Feedback')]"));
		webUtils.captureScreenshot("SingleScriptFeedbackIpad");
		webUtils.closeHtmlPopup(By.xpath("//button[@class='close']"));
		webUtils.clickOnElement(SingleScriptBooknow);
		webUtils.captureScreenshot("SingleScriptBooknowIPad");

	}
}
