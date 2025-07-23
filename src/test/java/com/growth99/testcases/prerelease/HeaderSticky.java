package com.growth99.testcases.prerelease;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HeaderSticky {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		driver.get("americanprep");
		driver.manage().window().maximize();
		Thread.sleep(2000);



	
		// ✅ Verify Social Media Icons
		try {
			List<WebElement> socialIcons = driver.findElements(By.xpath(
					"//div[@class='right-widgets mini-widgets']//a[@title='Facebook page opens in new window']//span[@class='soc-font-icon'] | " +
							"//div[@class='right-widgets mini-widgets']//a[@title='Instagram page opens in new window']//span[@class='soc-font-icon'] | " +
							"//div[@class='right-widgets mini-widgets']//a[@title='Tiktok page opens in new window']//span[@class='fab fa-tiktok']"
					));

			if (socialIcons.size() > 0) {
				System.out.println("✅ Social Media Icons found: " + socialIcons.size());

				for (WebElement icon : socialIcons) {
					try {
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", icon);
						icon.click();
						Thread.sleep(2000); // Let the new page load
						String originalWindow = driver.getWindowHandle();
						for (String windowHandle : driver.getWindowHandles()) {
							if (!windowHandle.equals(originalWindow)) {
								driver.switchTo().window(windowHandle);
								System.out.println("Switched to new tab: " + driver.getTitle());
								driver.close(); // Close the new tab
								driver.switchTo().window(originalWindow);
							}
						}
					} catch (Exception clickEx) {
						System.out.println("Failed to click icon: " + clickEx.getMessage());
					}
				}
			} else {
				System.out.println("Social Media Icons not found");
			}
		} catch (Exception e) {
			System.out.println("❌ Error while checking Social Media Icons: " + e.getMessage());
		}


		// ✅ Resize to mobile view
		driver.manage().window().setSize(new Dimension(375, 812));
		Thread.sleep(2000);

		// ✅ Verify Hamburger Menu is visible
		try {
			WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@class='mobile-header-bar']"));
			if (hamburgerMenu.isDisplayed()) {
				System.out.println("✅ Hamburger Menu is visible in mobile view");

				// ✅ Check if Hamburger Menu is sticky or fixed
				String position = (String)((JavascriptExecutor) driver)
						.executeScript("return window.getComputedStyle(arguments[0]).position;", hamburgerMenu);
				if (position.equals("sticky") || position.equals("fixed")) {
					System.out.println("✅ Hamburger Menu is sticky: " + position);
				} else {
					System.out.println("❌ Hamburger Menu is not sticky: " + position);
				}
			}
		} catch (Exception e) {
			System.out.println("❌ Hamburger Menu not found in mobile view");
		}

		// ✅ Check if Header is Sticky


		driver.quit();

		//span[contains(text(), 'Facebook page opens in new window')]
	}
}
