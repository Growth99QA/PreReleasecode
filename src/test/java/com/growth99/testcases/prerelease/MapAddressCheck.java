package com.growth99.testcases.prerelease;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.growth99.utils.Utilities;

public class MapAddressCheck {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Replace with actual site
        driver.get("https://ada1.gogroth.com/contact");
        driver.manage().window().maximize();
        driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT));

        // Step 1: Locate address on site (map or contact section)
        WebElement addressElement = driver.findElement(By.xpath("//div[@class='address']"));
        

        String websiteAddress = addressElement.getText().trim();
        System.out.println("Website Address: " + websiteAddress);

        // Step 2: Expected GMB address (from test data)
        String expectedGMBAddress = "1850 W Ashton Blvd Ste 100, Lehi, UT 84043, United States";

        // Step 3: Compare
        if (websiteAddress.equalsIgnoreCase(expectedGMBAddress)) {
            System.out.println("PASS: Website address matches GMB address.");
        } else {
            System.out.println("FAIL: Website address does not match GMB address.");
        }

        driver.quit();
    }
}



