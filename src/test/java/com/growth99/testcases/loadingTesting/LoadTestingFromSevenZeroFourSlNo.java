package com.growth99.testcases.loadingTesting;

import java.util.List;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



import com.fasterxml.jackson.databind.JsonNode;

import com.growth99.base.BaseClass;

import com.growth99.pages.GooglePage;

import com.growth99.pages.RumaPage;



public class LoadTestingFromSevenZeroFourSlNo extends BaseClass  {
	WebDriver driver;
	public JsonNode rumaJsonData;
	RumaPage rumaPage;
	GooglePage googlPage;

	LoadTestingFromSevenZeroFourSlNo(){
		super();
		rumaJsonData = getJsonData("RumaTestData.json");
	}

	@BeforeMethod
	public void setup() {
		driver=initilazeBrowserWithUrl("rumaUrl");
		rumaPage = new RumaPage(driver);
		googlPage = new GooglePage(driver);
	}

	@Test(priority=0)

	public void loadTestFromSevenZeroFour() {
		List<String> websites = List.of(
				"https://refined-glow.com",
				"https://sweetcheeksbeautybar.com",
				"https://aroramdspa.com",
				"https://lushaestheticswellness.com",
				"https://mrswebbaesthetic.com",
				"https://havenskinwellness.com",
				"https://myglow365.com",
				"https://younger-aesthetics.com",
				"https://epicestheticsnc.com",
				"https://leighashtonaesthetics.com",
				"https://oasisaestheticswellness.com",
				"https://nakedskn.com",
				"https://syringescience.com",
				"https://rrskin.com",
				"https://savvychiclaserandaestheticspa.com",
				"https://accesshealthservices.org",
				"https://morningdewaesthetics.com",
				"https://spamassaggio.com",
				"https://mattslocalpharmacy.com",
				"https://dripmiamihealth.com",
				"https://avantimedicalcenter.com",
				"https://boostwellnessclinic.com",
				"https://glowaestheticsbarllc.com",
				"https://thehubivbar.com",
				"https://unaaesthetics.com",
				"https://glo.clinic",
				"https://sundayskinaesthetics.com",
				"https://silktouchmedspa.com",
				"https://elanmedaesthetics.com",
				"https://maryvsmiles.com",
				"https://inspomedspa.com",
				"https://dermatiquelaserandskin.com",
				"https://rayneaesthetics.com",
				"https://skynndeep.com",
				"https://tvaai.com",
				"https://fgaestheticsandmedicine.com",
				"https://grandvalleylaseraesthetics.com",
				"https://rejuvemedspa.com",
				"https://mhmedicalcenter.com",
				"https://skinandbodymedspa.com",
				"https://nuovo-te.com",
				"https://symmetrynorman.com",
				"https://mcalpinegroupllc.com",
				"https://waestheticsandwellness.com",
				"https://omegaaestheticsandwellness.com",
				"https://naturalbeautygoldsboro.com",
				"https://contoursco.com",
				"https://venusrisingmedspa.com",
				"https://theinjectionroom.com",
				"https://seleneskinmedspa.com",
				"https://theplumproommiami.com",
				"https://revengemd.com",

				"https://penaclinic.net",

				"https://ritualbyth.com",

				"https://mdmedspabelred.com",

				"https://senzubean.ca",

				"https://meridianmedicalspa.com",

				"https://rowanbacktime.com",

				"https://urwellness.co",

				"https://ourlittlesecretaesthetics.com",

				"https://gentledentalonline.com",

				"https://blyskaesthetics.com",

				"https://chooseyourkur.com",

				"https://crosscaretransport.com",

				"https://kivamedspa.com",

				"https://thriveut.com",

				"https://wilsonaestheticsaz.com",

				"https://refineandrefreshmedspa.com",

				"https://glomedspaaustin.com",

				"https://drmatthewguffey.com",

				"https://kiyanimedspa.com",

				"https://c2medspa.com",

				"https://allergeniq.com",

				"https://suite101medicalspa.com",

				"https://trubalancedaesthetics.com",

				"https://dewskinaz.com",

				"https://contouraestheticsnyc.com",

				"https://philipgordondds.com",

				"https://aestheticjourneywellesley.com",

				"https://twnps.org",

				"https://serenitywellnessfamilypractice.com",

				"https://bellevieok.com",

				"https://revivalrn.com",

				"https://embracewellnessnd.com",

				"https://qualitycaredoc.com",

				"https://infinitebeautyloungema.com",

				"https://citiwellnessde.com",

				"https://artspahouse.com",

				"https://unitedmedicalandaesthetics.com",

				"https://botanicabeautystudio.com",

				"https://grossmanwellness.com",

				"https://fondandfayemedspa.com",

				"https://kanvasmedicalaesthetics.com",

				"https://pearlmedspachs.com",

				"https://julesbeautybar.com",

				"https://embodiedrelationshipstraining.com",

				"https://blissfulbeautybars.com",

				"https://toxandpout.com",

				"https://lasereyeandaesthetics.com",

				"https://elev8wellnesscenter.com",

				"https://envaesthetics.com"

				);





		googlPage.validateAllLinks(websites);



	}



	@Test(priority=1)

	public void loadTestFromEightZeroFive() {

		List<String> websites = List.of(



				"https://coastalglo.net",

				"https://apexperformancemedspa.com",

				"https://whitecoataesthetics.com",

				"https://youthologymedspa.com/home/",

				"https://skinbeautymedical.com",

				"https://tautaestheticsroom.com",

				"https://skinmeghandinneen.com",

				"https://carnelianmedspa.com",

				"https://healthyglowaestheticss.com",

				"https://magneticaesthetics.com",

				"https://magictouchmd.com",

				"https://drnealycosmeticsurgery.com",

				"https://dioo-ma.com",

				"https://confidentlymedspa.com",

				"https://equilibrium-handtherapy.com",

				"https://seitubellaaesthetics.com",

				"https://havenpmu.com",

				"https://aalinstitute.com",

				"https://bareskinmarin.com",

				"https://nomimedicalstudios.com",

				"https://sevenhillsesthetics.com",

				"https://esteticama.com",

				"https://timelessyouthmd.com",

				"https://shapeaesthetics.com",

				"https://maviemedspa.com",

				"https://verveaesthetics.co",

				"https://apmumedspa.com",

				"https://406aesthetica.com",

				"https://tailoredmedspa.com",

				"https://facialhaus.com",

				"https://7thdimensionaesthetics.com",

				"https://gordondentalimplantsandcosmetics.com",

				"https://beautymarksaesthetics.com",

				"https://parkplazadermatology.com",

				"https://valleybloomwellness.com",

				"https://savyhealth.com",

				"https://ravissantehealth.com",

				"https://salathedental.com",

				"https://healthyglowbeauty.com",

				"https://renuaesthetic.com",

				"https://infinitymedspaandwellness.com",

				"https://dermacurevalencia.com",

				"https://zenovamedspa.com",

				"https://infinitywellnessqc.com",

				"https://radskinoc.com",

				"https://agingbackwardsmed.com",

				"https://clairdelunemedspa.com",

				"https://skindalemedspa.com",

				"https://newbeautymedicalaesthetics.com",

				"https://draddisonaesthetics.com",

				"https://monarchbeautychatt.com",

				"https://whitefishplasticsurgery.com",

				"https://realresultsmedical.com",

				"https://auramedspa.org",

				"https://durmnv.com",

				"https://advancedmedicalspas.com",

				"https://tvaai.com",

				"https://grossmanwellness-stkitts.com",

				"https://accesshealthservices.org",

				"https://skinfitmedicalspa.com",

				"https://parkavecosmetic.com",

				"https://empowermedcolorado.com",

				"https://sottoaesthetics.com",

				"https://selahaesthetics.com.au",

				"https://k2medspa.com",

				"https://timelyssmedspa.com",

				"https://theellaeffect.com",

				"https://smaestheticsny.com",

				"https://apfmedicalspa.com",

				"https://aestheticbrokers.com",

				"https://glamifymedspa.com",

				"https://theconfidencecollectivesf.com",

				"https://belladermlh.com",

				"https://beyondaestheticslbk.com",
				"https://thekissedpeach.com",
				"https://themanabouttown.com",
				"https://lipsboutiquebyjka.com"
				);
		googlPage.validateAllLinks(websites);

	}

}