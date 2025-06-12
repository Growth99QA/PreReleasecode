
package com.growth99.testcases.loadingTesting;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.GooglePage;

public class LoadTestingFor1stSetof178Website extends BaseClass{

	WebDriver driver;
	public JsonNode rumaJsonData;
	//RumaPage rumaPage;
	GooglePage googlPage;


	LoadTestingFor1stSetof178Website (){
		super();
		rumaJsonData = getJsonData("RumaTestData.json");
	}

	@BeforeMethod
	public void setup() {
		driver=initilazeBrowserWithUrl("googleUrl");
		//rumaPage = new RumaPage(driver);
		googlPage = new GooglePage(driver);
	}

	@Test(priority=1)
	public void validateListofLoading1() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				"https://24streetdentalphoenix.com",
				"https://24streetdentalphoenix.com",
				"https://406medspa.com",
				"https://88aestheticandwellness.com",
				"https://aamedspas.com",
				"https://abilenebeautybus.com",
				"https://abmedspa.com",
				"https://absolutehealthcareofga.com",
				"https://accessoralsurgery.com",
				"https://acemedspa.com",
				"https://adaptid.com",
				"https://adoraaestheticsmd.com",
				"https://aereaesthetics.com",
				"https://aesthetic-artistry.com",
				"https://aesthetic-district.com",
				"https://aesthetic-intel.com",
				"https://aestheticcenterofrichmonddermatology.com",
				"https://aestheticcollectives.com",
				"https://aestheticemergency.com",
				"https://aesthetichouse.com",
				"https://aestheticloungeli.com",
				"https://aestheticouture.com",
				"https://aestheticsdmc.com",
				"https://aestique.com",
				"https://aestiquemedispa.com",
				"https://aestiquesurgerycenter.com",
				"https://afterglowaestheticscomo.com",
				"https://afzalclinics.com",
				"https://agelessaestheticsrn.com",
				"https://agelessmedical307.com",
				"https://alaskacheeky.com",
				"https://alchemyclinic.com",
				"https://alchemywest.com",
				"https://alcler-medspa.com",
				"https://allib.co",
				"https://allure-derm.com",
				"https://altapainphysicians.com",
				"https://alumawellness.com",
				"https://amaniaesthetics.com",
				"https://amararejuve.com",
				"https://ambassadors.americanprep.org",
				"https://americanaestheticinstitute.com",
				"https://americanprep.org",
				"https://amymartinmd.com",
				"https://aneumedspa.com",
				"https://angelfaceinjections.com",
				"https://angelicajackson.com",
				"https://anuuaesthetics.com",
				"https://apexfit.com",
				"https://apexintegrativemed.com",
				"https://apresbeautyandwellness.com",
				"https://arabellaboutiquemedspa.com",
				"https://arabellaknox.com",
				"https://aramedspa.com",
				"https://arcanumaesthetics.com",
				"https://aribamedicalspa.com",
				"https://armewellness.com",
				"https://aspenprimemedspa.com",
				"https://aspirabody.com",
				"https://aspire-cc.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}


	@Test(priority=2)
	public void validateListofLoading2() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				
				"https://astriaaesthetics.com",
				"https://athenacryostudios.com",
				"https://atmahealth.com",
				"https://auriaesthetics.com",
				"https://awaken-nj.com",
				"https://balancedbodyhealthcare.com",
				"https://bareface-beauty.com",
				"https://baremedicalaestheticsco.com",
				"https://barenbeautiful.com",
				"https://bbeautifulmedspa.com",
				"https://beautyandmedicinemedspa.com",
				"https://beautyandrejuvenation.com",
				"https://beautyatfirstsight.com",
				"https://beautybaraestheticsmedspa.com",
				"https://beautylablaser.com",
				"https://belev.co",
				"https://belevwomenshealth.com",
				"https://bellajademedspa.com",
				"https://bellamedspa.com",
				"https://bellaroseaesthetics.com",
				"https://bellavaaesthetics.com",
				"https://belleburlesonmedspa.com",
				"https://bellemedaesthetics.com",
				"https://bellusmedicalaesthetics.com",
				"https://bestinjector.com",
				"https://beyondwellnessar.com",
				"https://blankmedspa.com",
				"https://blog.rockymountainsnowmobile.com",
				"https://bloommedspamn.com",
				"https://bmedspa.com",
				"https://bodyrevolutionwellness.com",
				"https://bonnevilleacademy.org",
				"https://booktrubody.com",
				"https://boostologyco.com",
				"https://boostologymedspa.com",
				"https://botoxie.co",
				"https://bowedlegcorrection.com",
				"https://bradentonaesthetics.com",
				"https://brazilianbuttfill.com",
				"https://breamedspa.com",
				"https://breastaugmentationwithfat.com",
				"https://btyco.com",
				"https://buttfill.com",
				"https://cabotmedspa.com",
				"https://cachevalleyent.com",
				"https://calabloom.com",
				"https://calfaugmentationwithfat.com",
				"https://canvasmedicalspa.com",
				"https://capitolcontours.com",
				"https://carefirstwellnessmedspa.com",
				"https://centerforcbtva.com",
				"https://centraloregonaesthetics.com",
				"https://centurioninjects.com",
				"https://centurymedicalservices.com",
				"https://cherrymedispa.com",
				"https://citidrips.com",
				"https://cloud9medspaaz.com",
				"https://colleenmaherartistry.com",
				"https://comoaesthetics.com",
				"https://contorstudio.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	@Test(priority=3)
	public void validateListofLoading3() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				"https://coolsculptingcharleston.com",
				"https://coreaestheticstraining.com",
				"https://corlettexpress.com",
				"https://cosmedicsmedspa.com",
				"https://cosmeticdental.com",
				"https://couturedentist.com",
				"https://crystalngozibeauty.com",
				"https://cultivateaesthetics.com",
				"https://cultivatedbeauty.com",
				"https://cvfacialplastics.com",
				"https://cvillehealthspa.com",
				"https://cwlinmd.com",
				"https://dahliabywha.com",
				"https://deeplyvitalmedical.com",
				"https://deeplyvitalmedical.com",
				"https://dentalmedicalspa.com",
				"https://dermablissmedspa.com",
				"https://dermalignmedspa.com",
				"https://dermartisan.com",
				"https://diamondadvancedaesthetics.com",
				"https://divinelaser.com",
				"https://dolcevidamedspa.com",
				"https://drbrianharris.com",
				"https://drcolleendonnelly.com",
				"https://drgrossman.com",
				"https://drhillaryt.com",
				"https://drjosephfield.com",
				"https://drjuliamilman.com",
				"https://drnylamalikmd.com",
				"https://drpravinsuryawanshi.com",
				"https://earthremediesspa.com",
				"https://eastsideaestheticsbylena.com",
				"https://ecmedicalgroup.com",
				"https://egaestheticsohio.com",
				"https://elite-medspa.com",
				"https://elkoreplenishmedspa.com",
				"https://ellamedaesthetics.com",
				"https://elleaestheticsutah.com",
				"https://elleskinandbeautyco.com",
				"https://elysianwellnessbeauty.com",
				"https://emilyfrostaesthetics.com",
				"https://emmemedspa.com",
				"https://emmeskinclinic.com",
				"https://empoweraesthetics.com",
				"https://empoweredmedspa.com",
				"https://enchantedmedicalaesthetics.com",
				"https://encoremdspa.com",
				"https://endosd.com",
				"https://enrichedaesthetics.com",
				"https://enviaesthetics.com",
				"https://essencemedspa.net",
				"https://etherealskinmedspa.com",
				"https://eunoiaholistic.com",
				"https://eurolookmedspa.com",
				"https://evaraaesthetics.com",
				"https://evolutionaesthetics-mi.com",
				"https://evolutionwellnessclinic.com",
				"https://evolvecedarvalley.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	
}

