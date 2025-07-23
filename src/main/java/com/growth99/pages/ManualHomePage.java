package com.growth99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.growth99.utils.WebUtils;

public class ManualHomePage {

	WebDriver driver;
	WebUtils webUtils;

	public ManualHomePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		webUtils =  new WebUtils(driver);
	}
String emilyurl="https://emilyfrostaesthetics.com/";

/*
 * String elleskinUrl = "https://elleskinandbeautyco.com/"; String elysianUrl =
 * "https://elysianwellnessbeauty.com/"; String emilyUrl =
 * "https://emilyfrostaesthetics.com/"; String emmeUrl =
 * "https://emmemedspa.com/"; String emmeSkinClinicUrl =
 * "https://emmeskinclinic.com/"; String empowerAestheticsUrl =
 * "https://empoweraesthetics.com/"; String empoweredMedspaUrl =
 * "https://empoweredmedspa.com/"; String enchantedUrl =
 * "https://enchantedmedicalaesthetics.com/"; String encoreUrl =
 * "https://encoremdspa.com/"; String endoUrl = "https://endosd.com/"; String
 * enrichedUrl = "https://enrichedaesthetics.com/";
 */
String grandBeautyUrl = "https://grandbeautyaesthetics.com/";
String grossmanCapraroUrl = "https://grossmancapraroplasticsurgery.com/";
String growth99Url = "https://growth99.com/";
String halinaSpaUrl = "https://halinaspa.com/";
String harrisDentalUrl = "https://harrisdental.com/";
String hausOfConfidenceUrl = "https://hausofconfidence.com/";
String hausOfWellUrl = "https://hausofwell.com/";
String healthAndWellnessUrl = "https://healthandwellnessmedicalservices.com/";
String healthyGlowUrl = "https://healthyglowbeauty.com/";
String heartlandLuxeUrl = "https://heartlandluxeaesthetic.com/";
String helloEunaUrl = "https://helloeuna.com/";
String heraSkinWellnessUrl = "https://heraskinandwellness.com/";


	
/*
 * public void validateElleskinHomePage() { webUtils.validateLinks(driver,
 * elleskinUrl); System.out.println(
 * "************************************************************"); }
 * 
 * public void validateElysianHomePage() { webUtils.validateLinks(driver,
 * elysianUrl); System.out.println(
 * "******************************************************************\"****************"
 * ); }
 * 
 * public void validateEmilyHomePage() { webUtils.validateLinks(driver,
 * emilyUrl); System.out.println(
 * "*************************************************************\"*"); }
 * 
 * public void validateEmmeHomePage() { webUtils.validateLinks(driver, emmeUrl);
 * }
 * 
 * public void validateEmmeSkinClinicHomePage() { webUtils.validateLinks(driver,
 * emmeSkinClinicUrl); System.out.println(
 * "*************************************************************\"*"); }
 * 
 * public void validateEmpowerAestheticsHomePage() {
 * webUtils.validateLinks(driver, empowerAestheticsUrl); System.out.println(
 * "**************************************************************\"***"); }
 * 
 * public void validateEmpoweredMedspaHomePage() {
 * webUtils.validateLinks(driver, empoweredMedspaUrl); System.out.println(
 * "*************************************************************\"*"); }
 * 
 * public void validateEnchantedHomePage() { webUtils.validateLinks(driver,
 * enchantedUrl); System.out.println(
 * "*************************************************************\"*"); }
 * 
 * public void validateEncoreHomePage() { webUtils.validateLinks(driver,
 * encoreUrl); System.out.println(
 * "*************************************************************\"*"); }
 * 
 * public void validateEndoHomePage() { webUtils.validateLinks(driver, endoUrl);
 * System.out.println(
 * "***************************************************************\""); }
 * 
 * public void validateEnrichedHomePage() { webUtils.validateLinks(driver,
 * enrichedUrl); System.out.println(
 * "**************************************************************\"*"); }
 */
public void validateGrandBeautyHomePage() {
    webUtils.validateLinks(driver, grandBeautyUrl);
    System.out.println("***************************************************************");
}

public void validateGrossmanCapraroHomePage() {
    webUtils.validateLinks(driver, grossmanCapraroUrl);
    System.out.println("***************************************************************");
}

public void validateGrowth99HomePage() {
    webUtils.validateLinks(driver, growth99Url);
    System.out.println("***************************************************************");
}

public void validateHalinaSpaHomePage() {
    webUtils.validateLinks(driver, halinaSpaUrl);
    System.out.println("***************************************************************");
}

public void validateHarrisDentalHomePage() {
    webUtils.validateLinks(driver, harrisDentalUrl);
    System.out.println("***************************************************************");
}

public void validateHausOfConfidenceHomePage() {
    webUtils.validateLinks(driver, hausOfConfidenceUrl);
    System.out.println("***************************************************************");
}

public void validateHausOfWellHomePage() {
    webUtils.validateLinks(driver, hausOfWellUrl);
    System.out.println("***************************************************************");
}

public void validateHealthAndWellnessHomePage() {
    webUtils.validateLinks(driver, healthAndWellnessUrl);
    System.out.println("***************************************************************");
}

public void validateHealthyGlowHomePage() {
    webUtils.validateLinks(driver, healthyGlowUrl);
    System.out.println("***************************************************************");
}

public void validateHeartlandLuxeHomePage() {
    webUtils.validateLinks(driver, heartlandLuxeUrl);
    System.out.println("***************************************************************");
}

public void validateHelloEunaHomePage() {
    webUtils.validateLinks(driver, helloEunaUrl);
    System.out.println("***************************************************************");
}

public void validateHeraSkinWellnessHomePage() {
    webUtils.validateLinks(driver, heraSkinWellnessUrl);
    System.out.println("***************************************************************");
}

	
}
