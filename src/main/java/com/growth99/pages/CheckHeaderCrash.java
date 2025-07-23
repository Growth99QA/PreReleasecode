package com.growth99.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class CheckHeaderCrash {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(375, 812)); // Mobile view (iPhone X)

        driver.get("https://artmedicamedspa.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Wait for header to load
            WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("header")));

            // ✅ Check header is displayed
            if (!header.isDisplayed()) {
                System.out.println("❌ Header is not visible.");
                return;
            }

            // ✅ Check header height
            Long headerHeight = (Long) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].getBoundingClientRect().height;", header);
            System.out.println("Header Height: " + headerHeight + "px");

            if (headerHeight > 400) {
                System.out.println("⚠️ Header height is too large. Possible UI crash.");
            }

            // ✅ Check overlapping of header and content
            WebElement mainContent = driver.findElement(By.cssSelector("main, .page-content, .content"));

            Long headerBottom = (Long) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].getBoundingClientRect().bottom;", header);
            Long contentTop = (Long) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].getBoundingClientRect().top;", mainContent);

            if (headerBottom > contentTop) {
                System.out.println("❌ Header is overlapping the main content. Layout is broken.");
            } else {
                System.out.println("✅ Header is not overlapping the content.");
            }

            // ✅ Check header items visibility (like social icons, links)
            List<WebElement> headerLinks = header.findElements(By.cssSelector("a, button, svg, img"));
            for (WebElement link : headerLinks) {
                if (!link.isDisplayed()) {
                    System.out.println("⚠️ Element in header not visible: " + link.getAttribute("outerHTML"));
                }
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
        
    }
}
