package com.growth99.testcases.prerelease;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blog {
    public static void main(String[] args) {
        // Set path to chromedriver if required
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Open the given URL
        driver.get("https://ada1.gogroth.com/eboo-and-ozone-therapy-an-innovative-approach-to-wellness/");
        
        // Get all anchor tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            // Skip non-HTTP links
            if (!url.startsWith("http")) {
                System.out.println("Skipping non-http URL: " + url);
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("Broken link: " + url + " | Status Code: " + responseCode);
                } else {
                    System.out.println("Valid link: " + url + " | Status Code: " + responseCode);
                }
            } catch (Exception e) {
                System.out.println("Exception while checking link: " + url + " | Message: " + e.getMessage());
            }
        }

        driver.quit();
    }
}

