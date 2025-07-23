package com.growth99.testcases.prerelease;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headerbutton {


	static WebDriver driver;

	public static void main(String[] args) {
		// Set the path to your local ChromeDriver executable if needed
		// System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

		driver = new ChromeDriver();

		try {
			driver.manage().window().maximize();
			driver.get("https://cherrymedispa.com/");
			Thread.sleep(3000); // Wait for site to load

			validateHeaderIsSticky();

		} catch (Exception e) {
			System.out.println("Test failed: " + e.getMessage());
		} finally {
			driver.quit();
		}
	}

	public static void validateHeaderIsSticky() {
		try {
			WebElement header = driver.findElement(By.tagName("header"));

			Long initialTop = (Long) ((JavascriptExecutor) driver)
					.executeScript("return arguments[0].getBoundingClientRect().top;", header);

			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");
			Thread.sleep(1000);

			Long afterScrollTop = (Long) ((JavascriptExecutor) driver)
					.executeScript("return arguments[0].getBoundingClientRect().top;", header);

			if (initialTop.equals(afterScrollTop)) {
				System.out.println("✅ Header is sticky");
			} else {
				System.out.println("❌ Header is not sticky");
			}
		} catch (Exception e) {
			System.out.println("Header not found or error checking sticky behavior: " + e.getMessage());
		}
	}
}


