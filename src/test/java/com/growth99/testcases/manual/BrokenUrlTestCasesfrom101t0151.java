package com.growth99.testcases.manual;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.CherryPage;
import com.growth99.pages.GooglePage;
import com.growth99.pages.RumaPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BrokenUrlTestCasesfrom101t0151 extends BaseClass {

    WebDriver driver;
    public JsonNode rumaJsonData;
    com.growth99.pages.BrokenLinkPage BrokenLinkPage;

    @BeforeClass
    public void setup() {
        driver = initilazeBrowserWithUrl("googleUrl");
        BrokenLinkPage = new com.growth99.pages.BrokenLinkPage(driver);
    }

//  @Test(priority = 5)

   public void validatelushmedspaUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:lushmedspatuscaloosa.com", "https://lushmedspatuscaloosa.com/");

       System.out.println("****************************************************************************");

   }

   //@Test(priority = 6)

   public void validateGrowth99UrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:growth99.com", "https://growth99.com/");

       System.out.println("****************************************************************************");

   }

//   @Test(priority = 7)

   public void validatePostMedspaUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:poshmedicalspa.com", "https://poshmedicalspa.com/");

       System.out.println("****************************************************************************");

   }

//   @Test(priority = 8)

   public void validatePinkopalUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:pinkopalaesthetics.com", "https://pinkopalaesthetics.com/");

       System.out.println("****************************************************************************");

   }

//   @Test(priority = 9)

   public void validateLadyBellMedspaUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:ladybellemedspa.com", "https://ladybellemedspa.com/");

       System.out.println("****************************************************************************");

   }

//   @Test(priority = 10)

   public void validateAlegriaMedspaUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:alegriamedspa.com", "https://alegriamedspa.com/");

       System.out.println("****************************************************************************");

   }

 //  @Test(priority = 11)

   public void validateDermcollectiveUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:thedermcollectivenorthshore.com", "https://thedermcollectivenorthshore.com/");

       System.out.println("****************************************************************************");

   }

//   @Test(priority = 12)

   public void validateDrippynurseUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:https:drippynursejess.com", "https://drippynursejess.com/");

       System.out.println("****************************************************************************");

   }

  // @Test(priority = 13)

   public void validateBelleburlesonUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:belleburlesonmedspa.com", "https://belleburlesonmedspa.com/");

       System.out.println("****************************************************************************");

   }

  // @Test(priority = 14)

   public void validateTexasveinUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:texasveinandvascular.com", "https://texasveinandvascular.com/");

       System.out.println("****************************************************************************");

   }

 //  @Test(priority = 15)

   public void validateTsamedicalUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:tsamedicalspa.com", "https://tsamedicalspa.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 16)

   public void validateMyenveUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:myenve.com", "https://myenve.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 17)

   public void validateVivaUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:vivamedspa.life", "https://vivamedspa.life/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 18)

   public void validateCultureUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:culturemedspa.com", "https://culturemedspa.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 19)

   public void validateFinetuningUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:finetuninghealth.com", "https://finetuninghealth.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 20)

   public void validateHydr801UrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:hydr801infusions.com", "https://hydr801infusions.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 21)

   public void validateNeweraUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:neweraaestheticsandwellnesscenter.com", "https://neweraaestheticsandwellnesscenter.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 22)

   public void validateAdvcareMedspaUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:advcaremedspa.net", "https://advcaremedspa.net/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 23)

   public void validateTaheLabelsonUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:thelabelsalon.com", "https://thelabelsalon.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 24)

   public void validateInsipredUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:inspired-healthandwellness.com", "https://inspired-healthandwellness.com/");

       System.out.println("****************************************************************************");

   }

   @Test(priority = 25)

   public void validatebellanyUrlsFromGoogle() {

   	driver.navigate().to("https://www.google.com/");

   	BrokenLinkPage.validateSiteUrl("site:bellanycaesthetics.com", "https://bellanycaesthetics.com/");

       System.out.println("****************************************************************************");

   }


    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
