package com.growth99.testcases.prerelease;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LeardMore {





    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ada1.gogroth.com/"); // Replace with target site

        // Search for any element containing "Read More" or "Learn More" (case-insensitive)
        List<WebElement> moreButtons = driver.findElements(
            By.xpath("//*[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'read more') or contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'learn more')or contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'), 'view more')]")
        );

        if (moreButtons.isEmpty()) {
            System.out.println("PASS: No 'Read More' or 'Learn More' buttons found.");
        } else {
            System.out.println("FAIL: Found " + moreButtons.size() + " button(s) with 'Read More' or 'Learn More'.");
            for (WebElement button : moreButtons) {
                System.out.println("Found: " + button.getText());
            }
        }

        driver.quit();
    }
}