package com.growth99.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.growth99.utils.Utilities;

public class BaseClass {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public Properties configProp;
	public Properties urlProp;
	
		
	public BaseClass() {
		configProp = loadPropertiesFile("config.properties");
		urlProp = loadPropertiesFile("url.properties");		
	}

	public WebDriver initilazeBrowserWithUrl(String urlName) {
		String browserName= configProp.getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver.set(new ChromeDriver());
		} else if(browserName.equalsIgnoreCase("firefox")) {
			driver.set(new FirefoxDriver());
		}else if(browserName.equalsIgnoreCase("safari")) {
			driver.set(new SafariDriver());
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver.set(new EdgeDriver());
		}

		WebDriver localDriver = driver.get();
	    
	    localDriver.get(urlProp.getProperty(urlName));
	    localDriver.manage().window().maximize();
	    localDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT));
	    localDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));

	    return localDriver;
	}
	
	public static WebDriver getDriver() {
        return driver.get();
    }
	
	public Properties loadPropertiesFile(String filePath) {
		Properties prop = new Properties();
		File propFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\growth99\\configs\\"+filePath);
		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
		
	
	public JsonNode getJsonData(String filePath) {
		JsonNode jsonNode=null;
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\growth99\\testdata\\"+filePath);
		try {
			ObjectMapper objMap = new ObjectMapper();
			jsonNode = objMap.readTree(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonNode;
	}
}
