package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Home;
import pages.Industries;
import pages.Products;

public class ProductPageTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void testSetup(){
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(description="Navigate to and test the Uptake Products page", groups = {"regression"})
	public void productPageTest() throws InterruptedException{		
		Home homePage = new Home(driver);
		Products productsPage = new Products(driver);
		Industries industriesPage = new Industries(driver);
		
		//Navigate to Uptake Home page
		driver.get(homePage.homeURL());
		verifyPageURL(homePage.homeURL());
		
		//Navigate to Products page
		homePage.clickProducts();
		verifyPageURL(productsPage.productsURL());
		
		//Check Hero Title
		Assert.assertEquals(productsPage.getHeroTitleText(), productsPage.expectedHeroTitleText());
		
		//Navigate to Product Suite Grid
		productsPage.clickVideo();		
		productsPage.waitForApplications();
		
		//Verify Equipment Monitoring link
		productsPage.clickEquipmentMonitoring();
		verifyProductLinkAndBack(productsPage.equipmentMonitoringURL());
		
		//Verify Diagnostic Troubleshooting link
		productsPage.clickDiagnosticTroubleshooting();
		verifyProductLinkAndBack(productsPage.diagnosticTroubleshootingURL());
		
		//Verify Cyber Security link
		productsPage.clickCyberSecurity();
		verifyProductLinkAndBack(productsPage.cyberSecurityURL());
		
		//Verify KPI Dashboard link
		productsPage.clickKpiDashboards();
		verifyProductLinkAndBack(productsPage.kpiDashboardsURL());
		
		//Verify Action Recommendation link
		productsPage.clickActionRecommendation();
		verifyProductLinkAndBack(productsPage.actionRecommendationURL());
		
		//Verify Event Prediction link
		productsPage.clickEventConditionPrediction();
		verifyProductLinkAndBack(productsPage.eventConditionPredictionURL());
		
		//Verify Rules & Alerts link
		productsPage.clickRulesAlerts();
		verifyProductLinkAndBack(productsPage.rulesAlertsURL());
		
		//Verify Next Page link
		driver.get(productsPage.productsURL3());
		productsPage.waitForNextPage();
		productsPage.clickNextPage();
		verifyPageURL(industriesPage.industriesURL());
		
		driver.quit();
	}
	
	//Waits for page to load then verifies expected URL
	public void verifyPageURL(String expectedPageURL){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.urlContains(expectedPageURL));
		String actualPageURL = driver.getCurrentUrl();
		Assert.assertEquals(actualPageURL, expectedPageURL);
	}
	
	//Verifies product link and returns to products page
	public void verifyProductLinkAndBack(String url){
		Products productsPage = new Products(driver);
		verifyPageURL(url);
		productsPage.clickBack();
		productsPage.waitForApplications();
	}
	
	@AfterClass
	public void testCleanUp(){
		driver.quit();
	}
}