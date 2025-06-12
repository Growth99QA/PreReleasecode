package com.growth99.testcases.manual;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.CherryPage;
import com.growth99.pages.GooglePage;
import com.growth99.pages.RumaPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BrokenUrlTestCasesfrom51to100 extends BaseClass {

    WebDriver driver;
    public JsonNode rumaJsonData;
    com.growth99.pages.BrokenLinkPage BrokenLinkPage;

    @BeforeClass
    public void setup() {
        driver = initilazeBrowserWithUrl("googleUrl");
        BrokenLinkPage = new com.growth99.pages.BrokenLinkPage(driver);
    }

//    @Test(priority = 1)
    public void validateRumaUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:ruma.com", "https://ruma.com");
        System.out.println("****************************************************************************");
    }

    @Test(priority = 2)
    public void validateCherryUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:cherrymedispa.com", "https://cherrymedispa.com");
        System.out.println("****************************************************************************");
    }

    @Test(priority = 3)
    public void validateAramedspaUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:aramedspa.com", "https://aramedspa.com");
        System.out.println("****************************************************************************");
    }

    @Test(priority = 4)
    public void validateArabellaknoxspaUrlsFromGoogle() {
    	driver.navigate().to("https://www.google.com/");
    	BrokenLinkPage.validateSiteUrl("site:arabellaknox.com", "https://arabellaknox.com");
        System.out.println("****************************************************************************");
    }
   

 //   @Test(priority = 5)
    public void validate24streetdentalphoenixUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:24streetdentalphoenix.com", "https://24streetdentalphoenix.com");
        System.out.println("****************************************************************************");
    }
   
  //  @Test(priority = 6)
    public void validate406medspaUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:406medspa.com", "https://406medspa.com");
        System.out.println("****************************************************************************");
   
    }
   // @Test(priority = 7)
    public void validateAbilenebeautybusUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:abilenebeautybus.com", "https://abilenebeautybus.com");
        System.out.println("****************************************************************************");
   
    }
  //  @Test(priority = 8)
    public void validateAbmedspaUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:abmedspa.com", "https://abmedspa.com");
        System.out.println("****************************************************************************");
    }
 //   @Test(priority = 9)
    public void validateAbsolutehealthcareofgaUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:absolutehealthcareofga.com", "https://absolutehealthcareofga.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 10)
    public void validateAccessoralsurgeryUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:accessoralsurgery.com", "https://accessoralsurgery.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 11)
    public void validateAcemedspaUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:acemedspa.com", "http://acemedspa.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 12)
    public void validateAdaptidUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:adaptid.com", "http://adaptid.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 13)
    public void validateAestheticaUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aesthetic-artistry.com", "https://aesthetic-artistry.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 14)
    public void validateAestheticcenterofrichmonddermatologyUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aestheticcenterofrichmonddermatology.com", "https://aestheticcenterofrichmonddermatology.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 15)
    public void validateAestheticdistrictUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aesthetic-district.com", "https://aesthetic-district.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 16)
    public void validateAesthetichouseUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aesthetichouse.com", "https://aesthetichouse.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 17)
    public void validateAestheticsatdmcUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aestheticsatdmc.com", "https://aestheticsatdmc.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 18)
    public void validateAestiqueUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aestique.com", "https://aestique.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 19)
    public void validateAestiquemedispaUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:aestiquemedispa.com", "https://aestiquemedispa.com");
        System.out.println("****************************************************************************");
    }
    @Test(priority = 20)
    public void validateAfzalclinicsUrlsFromGoogle() {
    driver.navigate().to("https://www.google.com/");
    BrokenLinkPage.validateSiteUrl("site:afzalclinics.com", "https://afzalclinics.com");
        System.out.println("****************************************************************************");
    }  
 
        @Test(priority = 21)
        public void validateAgelessaestheticsrnUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:agelessaestheticsrn.com", "https://agelessaestheticsrn.com");
            System.out.println("****************************************************************************");
       }
       @Test(priority = 22)
       public void validateAgelessmedical307UrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:agelessmedical307.com", "https://agelessmedical307.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 23)
       public void validateAlaskacheekyUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:alaskacheeky.com", "https://alaskacheeky.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 24)
       public void validateAlchemywestUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:alchemywest.com", "https://alchemywest.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 25)
       public void validateAlchemyclinicUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:alchemyclinic.com", "https://alchemyclinic.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 26)
       public void validateAlclerUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:alcler-medspa.com", "https://alcler-medspa.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 27)
       public void validateAllibUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:allib.co", "https://allib.co");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 28)
       public void validateAllureUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:allure-derm.com", "https://allure-derm.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 29)
       public void validateAltapainphysiciansUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:altapainphysicians.com", "https://altapainphysicians.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 30)
       public void validateAmericanprepUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:americanprep.org", "http://americanprep.org");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 31)
       public void validateAneumedspaUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:aneumedspa.com", "http://aneumedspa.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 32)
       public void validateAngelfaceinjectionsUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:angelfaceinjections.com", "http://angelfaceinjections.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 33)
       public void validateAnuuaestheticsUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:anuuaesthetics.com", "http://anuuaesthetics.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 34)
       public void validateApexintegrativemedUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:apexintegrativemed.com", "http://apexintegrativemed.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 35)
       public void validateApresbeautyandwellnessUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:apresbeautyandwellness.com", "http://apresbeautyandwellness.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 36)
       public void validateArabellaboutiquemedspaUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:arabellaboutiquemedspa.com", "http://arabellaboutiquemedspa.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 37)
       public void validateArcanumaestheticsUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:arcanumaesthetics.com", "http://arcanumaesthetics.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 38)
       public void validateAribamedicalspaUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:aribamedicalspa.com", "http://aribamedicalspa.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 39)
       public void validatearmewellnessUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:armewellness.com", "http://armewellness.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 40)
       public void validateAspenprimemedspaUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:aspenprimemedspa.com", "http://aspenprimemedspa.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 41)
       public void validateAspirabodyUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:aspirabody.com", "http://aspirabody.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 42)
       public void validateAspireUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:aspire-cc.com", "http://aspire-cc.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 43)
       public void validateAstriaaestheticsUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:astriaaesthetics.com", "http://astriaaesthetics.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 44)
       public void validateAtmahealthUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:atmahealth.com", "http://atmahealth.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 45)
       public void validateAuriaestheticsUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:auriaesthetics.com", "http://auriaesthetics.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 46)
       public void validateAwakenUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:awaken-nj.com", "http://awaken-nj.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 47)
       public void validateBarenbeautifulUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:barenbeautiful.com.com", "http://barenbeautiful.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 48)
       public void validateBbeautifulmedspaUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:bbeautifulmedspa.com", "http://bbeautifulmedspa.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 49)
       public void validateBeautyatfirstsightUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:beautyatfirstsight.com", "http://beautyatfirstsight.com");
           System.out.println("****************************************************************************");
       }
       @Test(priority = 50)
       public void validateBeautylablaserUrlsFromGoogle() {
        driver.navigate().to("https://www.google.com/");
        BrokenLinkPage.validateSiteUrl("site:beautylablaser.com", "http://beautylablaser.com");
           System.out.println("****************************************************************************");
       }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
