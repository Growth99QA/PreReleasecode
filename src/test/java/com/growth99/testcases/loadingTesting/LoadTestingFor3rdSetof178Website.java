
package com.growth99.testcases.loadingTesting;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.GooglePage;

public class LoadTestingFor3rdSetof178Website extends BaseClass{

	WebDriver driver;
	public JsonNode rumaJsonData;
	//RumaPage rumaPage;
	GooglePage googlPage;


	LoadTestingFor3rdSetof178Website (){
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
				"https://ourfamilyderm.com",
				"https://outerbanksdermatology.com",
				"https://parlouratthevillage.com",
				"https://pathwaywellness.com",
				"https://pbkmedspa.com",
				"https://pelledolcea.com",
				"https://performancepwave.com",
				"https://phillymedclub.com",
				"https://pinkbowaesthetics.com",
				"https://plasticsurgeryarts.com",
				"https://policies.americanprep.org",
				"https://poshaestheticsandwellness.com",
				"https://poshskinrva.com",
				"https://pphysiquespa.com",
				"https://praesthetics.com",
				"https://premierdermcenter.com",
				"https://premiermedspatx.com",
				"https://prevaaesthetics.com",
				"https://prickdmedspa.com",
				"https://priorityhw.com",
				"https://prolohealing.com",
				"https://purebeautyaesthetics.net",
				"https://pureluxmedspa.com",
				"https://pureskinstillwater.com",
				"https://qualitycaredoc.com",
				"https://rachelbrownnp.com",
				"https://rachelolsenaesthetics.com",
				"https://radianceskinlaser.com",
				"https://refinekcaesthetics.com",
				"https://refinemedicalc.com",
				"https://reflectionsmedspalex.com",
				"https://refreshaestheticsutah.com",
				"https://refreshhealthspa.com",
				"https://refreshut.com",
				"https://rejuven8medical.com",
				"https://rejuvenateolympia.com",
				"https://rejuvenationcenter.info",
				"https://rejuvenationmdaesthetics.com",
				"https://rejuvlv.com",
				"https://reluxmedspa.com",
				"https://remedytupelo.com",
				"https://renovomd.com",
				"https://renuaesthetic.com",
				"https://revimedical.com",
				"https://revision-aesthetics.com",
				"https://rejuvlv.com",
				"https://reluxmedspa.com",
				"https://remedytupelo.com",
				"https://renuaesthetic.com",
				"https://revimedical.com",
				"https://royaltywellnessspa.com",
				"https://royalwellnessclinic.com",
				"https://rraestheticmedicine.com",
				"https://rumaacademy.com",
				"https://rumaaesthetics.com",
				"https://saflawless.com",
				"https://salontabuaz.com",
				"https://saltaestheticsbar.com",
				"https://samaramedspa.com",
				"https://samedspa.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}


	@Test(priority=2)
	public void validateListofLoading2() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				
				"https://sancarlosivbar.com",
				"https://sandpointmedspa.com",
				"https://savvybeautyandwellness.com",
				"https://savvychicmedspa.com",
				"https://savvyderm.com",
				"https://scottsdalesalonstudiosaz.com",
				"https://seamistmedspa.com",
				"https://seamlessaesthetics.com",
				"https://seattleaesthetics.com",
				"https://secretsaesthetics.com",
				"https://segolilyspa.com",
				"https://seitubellaaesthetics.com",
				"https://self-aesthetics.com",
				"https://signatureaestheticstx.com",
				"https://skinandivy.com",
				"https://skinandtonic.pro",
				"https://skincredible.com",
				"https://skinenvyny.com",
				"https://skinhavenclinic.co",
				"https://skinlogicottawa.com",
				"https://skinritualaz.com",
				"https://skinsavvymedspa.com",
				"https://skinsplendid.com",
				"https://skintuitionmedicalaesthetics.com",
				"https://skylersoares.com",
				"https://skynnmd.com",
				"https://skyrosercs.org",
				"https://smilebarorland.com",
				"https://smiledesignsecrets.com",
				"https://smilesofchandler.com",
				"https://smilevirtual.com",
				"https://smoochaesthetics.com",
				"https://snatchedaestheticsutah.com",
				"https://snatchedbysloan.com",
				"https://soleilmedicalspapdx.com",
				"https://solomondental.com",
				"https://solomondentistry.com",
				"https://solomonkids.com",
				"https://sorelleaesthetics.com",
				"https://soulandbeautymedx.com",
				"https://southernazlaw.com",
				"https://spagoerie.com",
				"https://spavela.com",
				"https://sswamn.com",
				"https://stallestudios.com",
				"https://stay-sculpted.com",
				"https://studiomedicalaesthetics.com",
				"https://sudsnsoda.com",
				"https://sumneraesthetics.com",
				"https://suteraspa.com",
				"https://sylmarmedspa.com",
				"https://synergywellnessmedispa.com",
				"https://tayleredaesthetics.com",
				"https://taylored2uaesthetics.com",
				"https://teoaesthetics.com",
				"https://theaestheticcenter.net",
				"https://theaesthetichausnorthshore.com",
				"https://theaestheticloungemedspa.com",
				"https://theaestheticretreat.com",
				"https://thebborganics.com"

				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	@Test(priority=3)
	public void validateListofLoading3() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				"https://thebeautypa.com",
				"https://thebetterbodyshopllc.com",
				"https://blindguy30a.com",
				"https://theclearexperience.com",
				"https://thecosmeticclinic.org",
				"https://thedanielleproject.org",
				"https://thedentalspa.com",
				"https://thedermspa.co",
				"https://thedriplounge.com",
				"https://theellaeffect.com",
				"https://theglowtogirl.com",
				"https://thegraiviercenter.com",
				"https://thenaturalaesthetic.com",
				"https://thenobleclinic.com",
				"https://theparkmedspa.com",
				"https://theplumproommiami.com",
				"https://thepointaesthetic.com",
				"https://theradiancemedicalspa.com",
				"https://thereclinic.com",
				"https://thesculptry.com",
				"https://theshinespa.com",
				"https://theskinacademy.net",
				"https://theskinclinichtx.com",
				"https://theskinscholar.com",
				"https://thespa.aestique.com",
				"https://thesteelevault.com",
				"https://thewellmedspa.com",
				"https://thewinnerschool.com",
				"https://thrivewellspa.com",
				"https://timelessaestheticswellness.com",
				"https://timelessmedspa.com",
				"https://tmamedspa.com",
				"https://touchdmedicalspa.com",
				"https://toxandpout.com",
				"https://transformationswellnessspa.com",
				"https://transumbilicalbreastaugmentation.com",
				"https://trubeautybytrevor.com",
				"https://truebeautyforever.com",
				"https://truthmedspa.biz",
				"https://tu-beautymedspa.com",
				"https://tymedayspa.com",
				"https://ubeuwellness.com",
				"https://ultimateimageskincare.com",
				"https://unfilteredmedicalspa.com",
				"https://unveiledboutiqueaesthetics.com",
				"https://uptownaestheticsandwellness.com",
				"https://urbanradiancemedspa.com",
				"https://utahtitle.com",
				"https://vafordoctors.com",
				"https://veneerconsult.com",
				"https://viafusenj.com",
				"https://vibeaestheticsmedspa.com",
				"https://vidabellamedspa.com",
				"https://visitwellness.co",
				"https://vita-aestheticsfl.com",
				"https://vitalitymedspamd.com",
				"https://vivanamd.com",
				"https://vivantmedspa.com",
				"https://vivifyaestheticsmedspa.com",
				"https://waestheticsatx.com"
				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	
}

