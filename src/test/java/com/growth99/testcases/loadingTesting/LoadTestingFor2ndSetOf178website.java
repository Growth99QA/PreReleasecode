
package com.growth99.testcases.loadingTesting;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.growth99.base.BaseClass;
import com.growth99.pages.GooglePage;

public class LoadTestingFor2ndSetOf178website extends BaseClass{

	WebDriver driver;
	public JsonNode rumaJsonData;
	//RumaPage rumaPage;
	GooglePage googlPage;


	LoadTestingFor2ndSetOf178website (){
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
				"https://eyecareonthesquare.com",
				"https://eyefaceandbody.com",
				"https://eyelidsurgery.milfordmd.com",
				"https://facebaram.com",
				"https://faceiqaesthetics.com",
				"https://faceitlive.org",
				"https://facenecklift.milfordmd.com",
				"https://facerejuvenationwithfat.com",
				"https://faycedaestheticsnyc.com",
				"https://femmemoderneaesthetics.com",
				"https://fierceaestheticsmedspa.com",
				"https://fillers.milfordmd.com",
				"https://flawlessmedicine.com",
				"https://flawlessskinmedspa.com",
				"https://fluidhydrationandwellness.com",
				"https://foreverweightlossstl.com",
				"https://fraesthetics.com",
				"https://freedomwellnessandaesthetics.com",
				"https://frostaestheticsmtv.com",
				"https://fsdpa.org",
				"https://fyreaesthetics.com",
				"https://galaxyhospitallatur.com",
				"https://gentlegiantcarellc.com",
				"https://germaindermatology.com",
				"https://getglow.org",
				"https://gfacemd.com",
				"https://gigharboraesthetics.com",
				"https://gladiatorhealthmd.com",
				"https://glamournailsandspa.com",
				"https://glo-byglen.com",
				"https://global-obesityandwellness.com",
				"https://globaldsagency.com",
				"https://globarmedspa.com",
				"https://gloderma.com",
				"https://gloesthetics.com",
				"https://glowbeautybaratl.com",
				"https://glowlaserbeauty.com",
				"https://glowtoxnyc.com",
				"https://glowwellnesscare.com",
				"https://goldenmedaesthetics.com",
				"https://gospringsolarnow.com",
				"https://grandbeautyaesthetics.com",
				"https://grossmancapraroplasticsurgery.com",
				"https://growth99.com",
				"https://halinaspa.com",
				"https://harrisdental.com",
				"https://hausofconfidence.com",
				"https://hausofwell.com",
				"https://healthandwellnessmedicalservices.com",
				"https://healthyglowbeauty.com",
				"https://heartlandluxeaesthetic.com",
				"https://helloeuna.com",
				"https://heraskinandwellness.com",
				"https://highlifeintegrativemed.com",
				"https://hollrahwellness.com",
				"https://homarejuvenation.com",
				"https://honeyglowhealth.com",
				"https://htownaesthetics.com",
				"https://cleanskinaesthetics.beauty",
				"https://hudson-pt.com"

				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}


	@Test(priority=2)
	public void validateListofLoading2() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				
				"https://hydription.com",
				"https://iconciergemedspa.com",
				"https://illdrinktothat.net",
				"https://imaginemedspa.com",
				"https://infusedmedspa.com",
				"https://inglomedspa.com",
				"https://injectionsbyeliza.com",
				"https://insparationmedspa.com",
				"https://inspired-healthandwellness.com",
				"https://instinctbozeman.com",
				"https://integracaremedaesthetics.com",
				"https://integratedconcierge.com",
				"https://integrityfootandankle.com",
				"https://inveinspa.com",
				"https://isyaderm.com",
				"https://jsjaesthetics.com",
				"https://jumpstartmedical.care",
				"https://justglamaesthetics.com",
				"https://kauaimedspa.com",
				"https://kaydermatology.com",
				"https://kellysmiledesign.com",
				"https://kendallesthetics.com",
				"https://kimbellmedspa.com",
				"https://kocoaesthetics.com",
				"https://kor-medspa.com",
				"https://ksdaesthetics.com",
				"https://laageless.com",
				"https://labellaaesthetics.net",
				"https://lakesideskin.com",
				"https://lasercenteronline.com",
				"https://laserhairma.com",
				"https://lavidaai.com",
				"https://lcvbeautyaesthetics.com",
				"https://lexaesthetics.com",
				"https://lhdentalcare.com",
				"https://liannehahn.com",
				"https://liftml.com",
				"https://liivmedical.com",
				"https://lilymedspa.com",
				"https://linasatx.com",
				"https://liposuction.milfordmd.com",
				"https://lipsanddripsllc.com",
				"https://livevibrantmed.com",
				"https://lookfeelelevated.com",
				"https://lotusaesthetics.org",
				"https://louloumedspa.com",
				"https://loureaesthetics.com",
				"https://loveyourskinwithlinds.com",
				"https://lumamedicalaesthetics.co",
				"https://lumifymedspa.com",
				"https://lunaaestheticsgroup.com",
				"https://lunar-beauty-and-wellness.com",
				"https://luzmedispa.com",
				"https://madskinaesthetics.com",
				"https://magnifiquemedicalspa.com",
				"https://magnoliabodysculpting.com",
				"https://maisondezenbk.com",
				"https://mandalynacademy.com",
				"https://mariposaweightloss.com",
				"https://masonaestheticsandwellness.com"

				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	@Test(priority=3)
	public void validateListofLoading3() {
		//driver.get("https://www.google.com/");
		List<String> websites = List.of(
				"https://masonaestheticsandwellness.com",
				"https://mavenaestheticsstudio.com",
				"https://mcleansheperdmd.com",
				"https://mdbeautyspa.com",
				"https://mdcosmeticsd.com",
				"https://mearsmedical.com",
				"https://medbeautiq.com",
				"https://medernaofficial.com",
				"https://medicalspa30a.com",
				"https://medicalweightlossutah.com",
				"https://medimorph.com",
				"https://medspaastoria.com",
				"https://medspabroomfield.com",
				"https://medspaca.com",
				"https://melindasdayspa.com",
				"https://memorialmedspa.com",
				"https://menst2r.com",
				"https://merakiaestheticsandco.com",
				"https://meridianmedicalspa.com",
				"https://mesamedclinic.com",
				"https://milfordmd.com",
				"https://mintdentalnc.com",
				"https://miramaestudio.com",
				"https://mmspatucson.com",
				"https://modamedspa.com",
				"https://modernlooksmedspa.com",
				"https://modernslc.com",
				"https://morasalon.com",
				"https://movelmedspa.com",
				"https://moxie-medspa.com",
				"https://movelmedspa.com",
				"https://myaestheticinstitute.com",
				"https://myaestheticstudio.com",
				"https://mybellepiel.com",
				"https://mybffaesthetics.com",
				"https://mybrighthaus.com",
				"https://myfacelady.com",
				"https://mygentlewellness.com",
				"https://myskinsommelier.com",
				"https://mysourceofhealth.com",
				"https://navaaesthetics.com",
				"https://ncbodybar.com",
				"https://neosaestheticacademy.com",
				"https://newimagespa.com",
				"https://nicolecaroline.com",
				"https://norwoodparkeyecenter.com",
				"https://nouvelleaw.com",
				"https://novavitacare.com",
				"https://nuvoaestheticsclinic.com",
				"https://nuyumedspanm.com",
				"https://nwbeautyandwellness.com",
				"https://nwmeaesthetics.com",
				"https://oceanaluxemedspa.com",
				"https://oceanstatelaserandaesthetics.com",
				"https://odomimedspa.com",
				"https://ofsinteriors.com",
				"https://onealkalinelife.com",
				"https://oneelevenrx.com",
				"https://onyxmedicalaestheticsspa.com",
				"https://opulentauraaesthetics.com",
				"https://oriaesthetics.com"

				);
		googlPage.validateAllLinks(websites);
		driver.close();

	}
	
}

