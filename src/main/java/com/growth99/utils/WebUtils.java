package com.growth99.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebUtils {

	private WebDriver driver;
	private WebDriverWait wait;
	private Logger logger = Logger.getLogger(WebUtils.class.getName());

	public WebUtils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	 private ExtentTest getExtentTest() {
	        return ExtentTestManager.getTest();
	    }

	 private String getElementLocator(WebElement element) {
	        String desc = element.toString();
	        return desc.substring(desc.indexOf("->") + 2, desc.length() - 1).trim();
	    }

	    private void logSuccess(String message) {
	        logger.log(Level.INFO, message);
	        getExtentTest().log(Status.INFO, message);
	    }

	    private void logFailure(String error) {
	        logger.log(Level.SEVERE, error);
	        getExtentTest().log(Status.FAIL, error);
	    }

	    public void clickOnElement(WebElement element) {
	        try {
	            wait.until(ExpectedConditions.elementToBeClickable(element));
	            element.click();
	            logSuccess("Clicked on element: " + getElementLocator(element));
	        } catch (Exception e) {
	            logFailure("Failed to click on element: " + e.getMessage());
	        }
	    }

	    public void enterText(WebElement element, String text) {
	        try {
	            wait.until(ExpectedConditions.visibilityOf(element));
	            element.clear();
	            element.sendKeys(text);
	            logSuccess("Entered text '" + text + "' into element: " + getElementLocator(element));
	        } catch (Exception e) {
	            logFailure("Failed to enter text: " + e.getMessage());
	        }
	    }

	public void clearAndEnterText(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.clear();
			element.sendKeys(text);
			logSuccess("Cleared and entered text '" + text + "' on element: "+getElementLocator(element));
		} catch (Exception e) {
			logFailure("Failed to enter text: " + e.getMessage());
		}
	}

	public String getText(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			String text = element.getText();
			logSuccess("Got text '" + text + "' from element: " +getElementLocator(element));
			
			return text;
		} catch (Exception e) {
			logFailure("Exception while getting text from element: " +e.getMessage());
			return null;
		}
	}

	public String getAttribute(WebElement element, String attribute) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			String attrVal = element.getDomAttribute(attribute);
			logSuccess("Got attribute '" + attribute + "' value '" + attrVal + "' from element: " +getElementLocator (element));
			return attrVal;
		} catch (Exception e) {
			logFailure("Exception while getting attribute '" + attribute + "' from element: " +e.getMessage());
			return null;
		}
	}

	public void hoverOverElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			wait.until(ExpectedConditions.visibilityOf(element));
			actions.moveToElement(element).perform();
			logSuccess( "Hovered over element: " +getElementLocator( element));
		} catch (Exception e) {
			//e.getMessage());
			logFailure("Exception while hovering over element: " +e.getMessage());
		
		}
	}

	public void doubleClick(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			actions.doubleClick(element).perform();
			logSuccess( "Double clicked element: "  +getElementLocator( element));
			
		} catch (Exception e) {
			logFailure("Exception while double clicking element: " +e.getMessage());
		}
	}

	public void rightClick(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			actions.contextClick(element).perform();
			logSuccess( "Right clicked element: "  +getElementLocator( element));
		} catch (Exception e) {
			logFailure("Exception while right clicking element: " +e.getMessage());
		}
	}

	// Dropdown / Select

	public void selectByVisibleText(WebElement element, String visibleText) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(visibleText);
			logSuccess("Selected dropdown option by visible text: " + visibleText +getElementLocator( element));
		} catch (Exception e) {
			logFailure("Exception whileselecting dropdown by visible text:  "+ visibleText +e.getMessage());
			
		}
	}

	public void selectByValue(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
			logSuccess("Selected dropdown option by value: " + value +getElementLocator( element));
			
		} catch (Exception e) {
			logFailure("Exception while selecting dropdown by value: " + value  +e.getMessage()); 
		}
	}

	public void selectByIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			select.selectByIndex(index);
			logSuccess("Selected dropdown option by value: " + index +getElementLocator( element));
		} catch (Exception e) {
			logFailure("Exception while selecting dropdown by index: " + index  +e.getMessage()); 
		}
	}

	public String getSelectedOption(WebElement element) {
		try {
			Select select = new Select(element);
			WebElement selected = select.getFirstSelectedOption();
			String selectedText = selected.getText();
			logSuccess("Got selected dropdown option: " + selectedText +getElementLocator( element));
			return selectedText;
		} catch (Exception e) {
			logFailure("Exception while getting selected dropdown option: "  +e.getMessage()); 
			return null;
		}
	}

	public List<String> getAllDropdownOptions(WebElement element) {
		List<String> optionsText = new ArrayList<>();
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement option : options) {
				optionsText.add(option.getText());
			}
			logSuccess("Got all dropdown options ");
		} catch (Exception e) {
			logFailure("Exception while getting all dropdown options"  +e.getMessage()); 
		}
		return optionsText;
	}

	// Checkbox / Radio Buttons

	public void selectCheckbox(WebElement element) {
		try {
			if (!element.isSelected()) {
				element.click();
				logSuccess("Selected checkbox: "  +getElementLocator( element));
			}
		} catch (Exception e) {
			logFailure( "Exception while selecting checkbox: " +e.getMessage()); 
		}
	}

	public void deselectCheckbox(WebElement element) {
		try {
			if (element.isSelected()) {
				element.click();
				logSuccess("Deselected checkbox: "  +getElementLocator( element));
			}
		} catch (Exception e) {
			logFailure( "Exception while deselecting  checkbox: " +e.getMessage()); 
		}
	}

	public boolean isCheckboxSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			logSuccess("Checkbox selected status: " + selected);
			return selected;
		} catch (Exception e) {
			logFailure( "Exception while checking checkbox status:  " +e.getMessage());
			return false;
		}
	}

	// Alert Handling

	public void acceptAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			logSuccess( "Alert accepted" );
		} catch (Exception e) {
			logFailure("Exception while accepting alert: " +e.getMessage());
		}
	}

	public void dismissAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().dismiss();
			logSuccess("Alert dismissed");
		} catch (Exception e) {
			logFailure("Exception while dismissing alert: " +e.getMessage());
		}
	}

	public String getAlertText() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			String text = driver.switchTo().alert().getText();
			logSuccess("Got alert text: " + text);
			return text;
		} catch (Exception e) { 
			logFailure("Exception while getting alert text" +e.getMessage());
			return null;
		}
	}

	public void sendKeysToAlert(String keys) {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().sendKeys(keys);
			logSuccess( "Sent keys to alert: " + keys);
		} catch (Exception e) {
			logFailure("Exception while sending keys to alert" +e.getMessage()); 
		}
	}

	// Frame & Window Handling
	//need to work on the logsuccess and logFaliure
	

	public void switchToFrameByIndex(int index) {
		try {
			driver.switchTo().frame(index);
			logger.log(Level.INFO, "Switched to frame by index: " + index);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while switching to frame by index: " + index, e);
		}
	}

	public void switchToFrameByElement(WebElement element) {
		try {
			driver.switchTo().frame(element);
			logger.log(Level.INFO, "Switched to frame by element: " + element);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while switching to frame by element: " + element, e);
		}
	}

	public void switchToDefaultContent() {
		try {
			driver.switchTo().defaultContent();
			logger.log(Level.INFO, "Switched to default content");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while switching to default content", e);
		}
	}

	public void switchToWindowByIndex(int index) {
		try {
			List<String> windows = new ArrayList<>(driver.getWindowHandles());
			if (index < windows.size()) {
				driver.switchTo().window(windows.get(index));
				logger.log(Level.INFO, "Switched to window index: " + index);
			} else {
				logger.log(Level.WARNING, "Window index out of bounds: " + index);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while switching to window index: " + index, e);
		}
	}

	public void closeCurrentWindow() {
		try {
			driver.close();
			logger.log(Level.INFO, "Closed current window");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while closing current window", e);
		}
	}

	// Page Navigation

	public void navigateTo(String url) {
		try {
			driver.get(url);
			logger.log(Level.INFO, "Navigated to URL: " + url);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while navigating to URL: " + url, e);
		}
	}

	public void refreshPage() {
		try {
			driver.navigate().refresh();
			logger.log(Level.INFO, "Page refreshed");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while refreshing page", e);
		}
	}

	public void goBack() {
		try {
			driver.navigate().back();
			logger.log(Level.INFO, "Navigated back");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while navigating back", e);
		}
	}

	public void goForward() {
		try {
			driver.navigate().forward();
			logger.log(Level.INFO, "Navigated forward");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while navigating forward", e);
		}
	}

	// JavaScript Utilities

	public void clickUsingJS(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			logger.log(Level.INFO, "Clicked element using JavaScript: " + element);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while clicking element using JS: " + element, e);
		}
	}

	public void scrollToElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			logger.log(Level.INFO, "Scrolled to element: " + element);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while scrolling to element: " + element, e);
		}
	}

	public void scrollToBottom() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			logger.log(Level.INFO, "Scrolled to bottom of page");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while scrolling to bottom", e);
		}
	}

	public void highlightElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red'", element);
			logger.log(Level.INFO, "Highlighted element: " + element);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while highlighting element: " + element, e);
		}
	}

	// File Upload

	public void uploadFile(WebElement element, String filePath) {
		try {
			element.sendKeys(filePath);
			logger.log(Level.INFO, "Uploaded file: " + filePath);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Exception while uploading file: " + filePath, e);
		}
	}

	// ----------- Waits ------------

	public void waitForElementToBeVisible(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			logger.log(Level.INFO, "Element visible: " + locator);
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element not visible: " + locator, e);
		}
	}

	public void waitForElementToBeClickable(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			logger.log(Level.INFO, "Element clickable: " + locator);
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element not clickable: " + locator, e);
		}
	}

	public void waitForElementToDisappear(By locator) {
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			logger.log(Level.INFO, "Element disappeared: " + locator);
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element did not disappear: " + locator, e);
		}
	}

	public void waitForTextToBePresent(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
			logger.log(Level.INFO, "Text '" + text + "' is present in element: " + element);
		} catch (Exception e) {
			logger.log(Level.WARNING, "Text '" + text + "' not present in element: " + element, e);
		}
	}

	public void waitForURLToContain(String fraction) {
		try {
			wait.until(ExpectedConditions.urlContains(fraction));
			logger.log(Level.INFO, "URL contains: " + fraction);
		} catch (Exception e) {
			logger.log(Level.WARNING, "URL does not contain: " + fraction, e);
		}
	}

	public void waitForTitleToBe(String title) {
		try {
			wait.until(ExpectedConditions.titleIs(title));
			logger.log(Level.INFO, "Title is: " + title);
		} catch (Exception e) {
			logger.log(Level.WARNING, "Title is not: " + title, e);
		}
	}

	// ----------- Validations ------------

	public boolean isElementDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			logger.log(Level.INFO, "Element displayed: " + displayed);
			return displayed;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element not displayed", e);
			return false;
		}
	}

	public boolean isElementEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			logger.log(Level.INFO, "Element enabled: " + enabled);
			return enabled;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element not enabled", e);
			return false;
		}
	}

	public boolean isElementSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			logger.log(Level.INFO, "Element selected: " + selected);
			return selected;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element not selected", e);
			return false;
		}
	}

	public boolean validateText(WebElement element, String expectedText) {
		try {
			String actualText = getText(element);
			boolean match = expectedText.equals(actualText);
			logger.log(Level.INFO, "Text validation: expected='" + expectedText + "', actual='" + actualText + "', result=" + match);
			return match;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Text validation failed", e);
			return false;
		}
	}

	public boolean validateAttribute(WebElement element, String attribute, String expectedValue) {
		try {
			String actualValue = getAttribute(element, attribute);
			boolean match = expectedValue.equals(actualValue);
			logger.log(Level.INFO, "Attribute validation: " + attribute + ", expected='" + expectedValue + "', actual='" + actualValue + "', result=" + match);
			return match;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Attribute validation failed", e);
			return false;
		}
	}

	public boolean validatePageTitle(String expectedTitle) {
		try {
			String actualTitle = driver.getTitle();
			boolean match = expectedTitle.equals(actualTitle);
			logger.log(Level.INFO, "Page title validation: expected='" + expectedTitle + "', actual='" + actualTitle + "', result=" + match);
			return match;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Page title validation failed", e);
			return false;
		}
	}

	 public boolean validateCurrentURL(String expectedURL) {
	        try {
	            String actualURL = driver.getCurrentUrl();
	            boolean match = expectedURL.equals(actualURL);
	            String message = "URL validation - Expected: '" + expectedURL + "', Actual: '" + actualURL + "', Match: " + match;
	            if (match) {
	                logSuccess(message);
	            } else {
	                logFailure(message);
	            }
	            return match;
	        } catch (Exception e) {
	            logFailure("URL validation failed: " + e.getMessage());
	            return false;
	        }
	    }

	public boolean validateElementCount(By locator, int expectedCount) {
		try {
			int actualCount = driver.findElements(locator).size();
			boolean match = actualCount == expectedCount;
			logger.log(Level.INFO, "Element count validation for " + locator + ": expected=" + expectedCount + ", actual=" + actualCount + ", result=" + match);
			return match;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Element count validation failed", e);
			return false;
		}
	}

	// ----------- Utility ------------

	public List<WebElement> findElements(By locator) {
		try {
			List<WebElement> elements = driver.findElements(locator);
			logger.log(Level.INFO, "Found " + elements.size() + " elements for locator: " + locator);
			return elements;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Exception while finding elements: " + locator, e);
			return new ArrayList<>();
		}
	}

	public WebElement findElement(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			logger.log(Level.INFO, "Found element for locator: " + locator);
			return element;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Exception while finding element: " + locator, e);
			return null;
		}
	}

	public boolean isLinkBroken(String link) {
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(link).openConnection();
			conn.setRequestMethod("HEAD");
			conn.setConnectTimeout(5000);
			conn.connect();
			int status = conn.getResponseCode();
			return status >= 400;
		} catch (IOException e) {
			return true;
		}
	}

	public boolean isImageValid(WebElement imageElement, String imageName) {
		try {
			if (imageElement == null) {
				logger.log(Level.WARNING, imageName + " image element is null.");
				return false;
			}

			String imageUrl = imageElement.getDomAttribute("src");
			logger.log(Level.INFO, imageName + " image URL: " + imageUrl);

			if (imageUrl == null || imageUrl.trim().isEmpty()) {
				logger.log(Level.WARNING, imageName + " image URL is null or empty.");
				return false;
			}

			HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			connection.connect();

			int responseCode = connection.getResponseCode();
			logger.log(Level.INFO, imageName + " image HTTP response code: " + responseCode);

			return responseCode == HttpURLConnection.HTTP_OK;

		} catch (MalformedURLException e) {
			logger.log(Level.SEVERE, "Malformed URL for " + imageName + " image.", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "IO Exception while validating " + imageName + " image.", e);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Unexpected error while validating " + imageName + " image.", e);
		}

		return false;
	}

	//broken Url
	//multiple reports
	//how to share reports
	//github

}
