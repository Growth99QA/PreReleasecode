
package com.growth99.testcases.loadingTesting;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.GooglePage;

public class LoadTestingFor4thSetof178Website extends BaseClass{

	WebDriver driver;
	public JsonNode rumaJsonData;
	//RumaPage rumaPage;
	GooglePage googlPage;


	LoadTestingFor4thSetof178Website (){
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
				"https://walnutcreekaesthetics.com",
				"https://wavemedicalaesthetics.com",
				"https://we-revive.com",
				"https://wellnesslifezone.com",
				"https://whanwa.com",
				"https://willowboutiquemedspa.com",
				"https://wilsonaestheticsaz.com",
				"https://winonwallstreet.com",
				"https://wondermedicalspa.com",
				"https://wywcenter.com",
				"https://yastheticsnyc.com",
				"https://yumawellnessaesthetics.com",
				"https://trumemedical.com",
				"https://lakewashingtonskin.com",
				"https://fgaestheticsandmedicine.com",
				"https://serenityhillwf.com",
				"https://hydraprimeivandwellness.com",
				"https://minniestreetaesthetics.com",
				"https://healthcarpenter.com",
				"https://periosd.com",
				"https://youthologymedical.com",
				"https://essentialaestheticsfl.com",
				"https://invigue.com",
				"https://lacremeco.com",
				"https://bogerdental.com",
				"https://collagenaesthetics.net",
				"https://inspirewellnessaesthetics.com",
				"https://bellavaaesthetics.com",
				"https://selfishlyaesthetics.com",
				"https://lbvhealthandaesthetics.com",
				"https://pivhydration.com",
				"https://michaeldiazmd.com",
				"https://facefirstaesthetics.com",
				"https://dreamhoustonmedspa.com",
				"https://aerolaserandskin.com",
				"https://optimed360.com",
				"https://transformations.vip",
				"https://360medspas.com",
				"https://canvasskinclinic.com",
				"https://permianbasinmedspa.com",
				"https://youthfullypure.com",
				"https://windermeremedicalspa.com",
				"https://wise-aesthetics.com",
				"https://lunamedspawi.com",
				"https://uniqueweightlosssolutions.com",
				"https://beautynursedani.com",
				"https://bluesparkhealth.com",
				"https://facialstudiomagdalena.com",
				"https://babyfacebeautywellness.com",
				"https://amaraskinandwellness.com",
				"https://roaaesthetics.com",
				"https://chameleonspatn.com",
				"https://nonamedspa.com",
				"https://poshofnova.com",
				"https://gloesthetics.net",
				"https://medamorphous.com",
				"https://evolvecedarvalley.com",
				"https://daneshfaraesthetics.com",
				"https://eurolookmedspa.com",
				"https://saskinsolutions.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}


	@Test(priority=2)
	public void validateListofLoading2() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				
				"https://astriaaesthetics.com",
				"https://penplasticsurgery.com",
				"https://laredowellness.com",
				"https://rootsrecoverytampa.com",
				"https://drernestlayton.com",
				"https://kemperhealthwellness.com",
				"https://sculptidaho.com",
				"https://abetteryouhealthandwellness.com",
				"https://ophiraesthetics.com",
				"https://wildaesthetics.org",
				"https://meadowssurgicalarts.com",
				"https://mandalynacademy.com",
				"https://abetteryouhealthandwellness.com",
				"https://ritualrenonv.com",
				"https://fitandfabspa.com",
				"https://thefacialrefinery.com",
				"https://physiquepgh.com",
				"https://ar-aesthetics.com",
				"https://thesecretplump.com",
				"https://emilyfrostaesthetics.com",
				"https://aestheticinfluence.co",
				"https://dermaglowmed.com",
				"https://academyofaestheticart.com",
				"https://enhancedwellnessderby.com",
				"https://firmlabwarren.com",
				"https://sprucemedicalaesthetics.com",
				"https://pacific-obgyn.com",
				"https://calcoastdental.com",
				"https://avabellaaesthetics.com",
				"https://firstbodywellnesscenter.com",
				"https://advanceddermalhealth.com",
				"https://uptownmedicalaesthetics.com",
				"https://crawfordcosmetics.com",
				"https://albanyas.com",
				"https://theskinhealthspatoledo.com",
				"https://1aesthetic.com",
				"https://medspasanangelo.com",
				"https://iwhmedspa.com",
				"https://thepainlessmammogram.com",
				"https://edgeaestheticsandwellness.com",
				"https://citywidejanitors.com",
				"https://lushatgraced.com",
				"https://vivacaresolutions.com",
				"https://warriorwellnessmd.com",
				"https://mymojoclinic.com",
				"https://pristineetherealaesthetics.com",
				"https://soleiclinic.com",
				"https://poshaestheticssc.com",
				"https://skinbossmedspa.com",
				"https://believeaesthetics.com",
				"https://aestheticlabinc.com",
				"https://freshfaceboise.com",
				"https://skinmedhealth.com",
				"https://maudemedical.com",
				"https://micariaesthetics.com",
				"https://fusemedspa.com",
				"https://beachmedicalaesthetics.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	@Test(priority=3)
	public void validateListofLoading3() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				  "https://smiledesigndentalfl.com",
				  "https://injectsavannah.com",
				  "https://gizelatl.com",
				  "https://loungeofbeautymedicalspa.com",
				  "https://ehdenaesthetics.com",
				  "https://dajenel.com",
				  "https://crownmedicalaesthetics.com",
				  "https://themethodstl.com",
				  "https://starrejuvenation.com",
				  "https://renewaltattooremoval.com",
				  "https://juvenessence.net",
				  "https://cameofacialaesthetics.com",
				  "https://omegahealthclinics.com",
				  "https://northernwyomingwellnessaesthetics.com",
				  "https://totallypsychedspa.com",
				  "https://premierdermcenter.com",
				  "https://beautyrefined.co",
				  "https://thehoneydippedinjector.com",
				  "https://lushmedspatuscaloosa.com",
				  "https://growth99.com",
				  "https://coremasterysummit.com",
				  "https://poshmedicalspa.com",
				  "https://pinkopalaesthetics.com",
				  "https://ladybellemedspa.com",
				  "https://alegriamedspa.com",
				  "https://chemchronos.com",
				  "https://elixirmedspa.com",
				  "https://thedermcollectivenorthshore.com",
				  "https://drippynursejess.com",
				  "https://raeaestheticsandwellness.com",
				  "https://geminiglowut.com",
				  "https://belleburlesonmedspa.com",
				  "https://texasveinandvascular.com",
				  "https://lushluxeaesthetics.com",
				  "https://prismamedicalspa.com",
				  "https://tsamedicalspa.com",
				  "https://myenve.com",
				  "https://vivamedspa.life",
				  "https://culturemedspa.com",
				  "https://finetuninghealth.com",
				  "https://neweraaestheticsandwellnesscenter.com",
				  "https://thehormoneguru.com",
				  "https://advcaremedspa.net",
				  "https://thelabelsalon.com",
				  "https://ofsproducts.com",
				  "https://hydr801infusions.com",
				  "https://inspired-healthandwellness.com",
				  "https://bellanycaesthetics.com",
				  "https://cultivatedtrainingco.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	
}

