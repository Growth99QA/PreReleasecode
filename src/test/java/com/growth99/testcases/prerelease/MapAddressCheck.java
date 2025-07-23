package com.growth99.testcases.prerelease;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.growth99.utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MapAddressCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 1. Open client website and extract address
		driver.get("https://ada1.gogroth.com/contact/"); // Replace with actual URL
		WebElement websiteAddressElement = driver.findElement(By.xpath("//div[contains(text(), '1850 W Ashton Blvd Ste 100, Lehi, UT 84043, United States')]")); // Update with actual locator
		String websiteAddress = websiteAddressElement.getText().trim();
		System.out.println("Website Address: " + websiteAddress);

		// 2. Open Google and search business
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ruma"); // Replace with actual business name
		searchBox.submit();

		// 3. Click on Google Maps link
		Thread.sleep(3000); // Wait for results to load
		WebElement mapsLink = driver.findElement(By.partialLinkText("Maps"));
		mapsLink.click();

		// 4. Extract address from Google Map
		Thread.sleep(5000); // Wait for Maps to load
		WebElement gmbAddressElement = driver.findElement(By.xpath("//div[contains(@aria-label,'Address') or contains(text(),'Address')]/following-sibling::div"));
		String gmbAddress = gmbAddressElement.getText().trim();
		System.out.println("Google Maps Address: " + gmbAddress);

		// 5. Compare both addresses
		if (websiteAddress.equalsIgnoreCase(gmbAddress)) {
			System.out.println("✅ PASS: Website and GMB addresses match.");
		} else {
			System.out.println("❌ FAIL: Website and GMB addresses do NOT match.");
		}

		driver.quit();
	}
}




