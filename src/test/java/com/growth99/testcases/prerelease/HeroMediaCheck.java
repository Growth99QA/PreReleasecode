package com.growth99.testcases.prerelease;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HeroMediaCheck {

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://ada1.gogroth.com/");  // Replace with your actual URL

	        boolean videoLoaded = false;
	        boolean fallbackImageLoaded = false;

	        try {
	            // Try to find the hero video
	            WebElement video = driver.findElement(By.xpath("//div[@id='main-slideshow']"));
	            if (video.isDisplayed()) {
	                System.out.println("PASS: Hero section video is present and visible.");
	                videoLoaded = true;
	            }
	        } catch (Exception e) {
	            System.out.println("Hero video not found.");
	        }

	        if (!videoLoaded) {
	            try {
	                // Check for fallback image
	                WebElement fallbackImage = driver.findElement(By.cssSelector(".hero img"));
	                if (fallbackImage.isDisplayed()) {
	                    System.out.println("PASS: Fallback image is displayed.");
	                    fallbackImageLoaded = true;
	                }
	            } catch (Exception e) {
	                System.out.println("Fallback image not found.");
	            }
	        }

	        if (!videoLoaded && !fallbackImageLoaded) {
	            System.out.println("FAIL: Neither video nor fallback image loaded.");
	        }

	        driver.quit();
	    }
	}

