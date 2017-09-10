package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Products {
	
	WebDriver driver;
	
	By heroTitle = By.xpath(".//*[@class='hero__title']");
	By video = By.xpath(".//*[@id='video']");
	By applicationsTitle = By.xpath(".//*[@class='applications__title']");
	By equipmentMonitoring = By.xpath(".//*[@href='/products/equipment-monitoring']");
	By diagnosticTroubleshooting = By.xpath(".//*[@href='/products/diagnostic-troubleshooting']");
	By cyberSecurity = By.xpath(".//*[@href='/products/cybersecurity']");
	By kpiDashboards = By.xpath(".//*[@href='/products/kpi-dashboards']");
	By actionRecommendation = By.xpath(".//*[@href='/products/action-recommendation']");
	By eventConditionPrediction = By.xpath(".//*[@href='/products/event-&-condition-prediction']");
	By rulesAlerts = By.xpath(".//*[@href='/products/rules-&-alerts']");
	By closeModal = By.xpath(".//*[@class='closeModal']");
	By nextPageIndustries = By.xpath(".//*[@class='nextPage__content__link']");
	
	public Products(WebDriver driver){
		this.driver=driver;
	}
	
	public String productsURL(){
		return "https://uptake.com/products";
	}
	
	public String productsURL2(){
		return productsURL()+"#2";
	}
	
	public String productsURL3(){
		return productsURL()+"#3";
	}
	
	public String getHeroTitleText(){
		String heroTitleText = driver.findElement(heroTitle).getText();		
		return heroTitleText;
	}
	
	public String expectedHeroTitleText(){
		return "Transforming Data into Value";
	}
	
	public void clickVideo(){
		driver.findElement(video).click();
	}
	
	public void waitForApplications(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(applicationsTitle)));
	}
	
	public void clickBack(){
		driver.findElement(closeModal).click();
	}
	
	public void waitForNextPage(){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nextPageIndustries)));
	}
	
	public void clickNextPage(){
		driver.findElement(nextPageIndustries).click();
	}

	//Click Products
	public void clickEquipmentMonitoring(){
		driver.findElement(equipmentMonitoring).click();
	}
	
	public void clickDiagnosticTroubleshooting(){
		driver.findElement(diagnosticTroubleshooting).click();
	}
	
	public void clickCyberSecurity(){
		driver.findElement(cyberSecurity).click();
	}
	
	public void clickKpiDashboards(){
		driver.findElement(kpiDashboards).click();
	}
	
	public void clickActionRecommendation(){
		driver.findElement(actionRecommendation).click();
	}
	
	public void clickEventConditionPrediction(){
		driver.findElement(eventConditionPrediction).click();
	}
	
	public void clickRulesAlerts(){
		driver.findElement(rulesAlerts).click();
	}
	
	//Product URLs
	public String equipmentMonitoringURL(){
		return "https://uptake.com/products/equipment-monitoring";
	}
	
	public String diagnosticTroubleshootingURL(){
		return "https://uptake.com/products/diagnostic-troubleshooting";
	}
	
	public String cyberSecurityURL(){
		return "https://uptake.com/products/cybersecurity";
	}
	
	public String kpiDashboardsURL(){
		return "https://uptake.com/products/kpi-dashboards";
	}
	
	public String actionRecommendationURL(){
		return "https://uptake.com/products/action-recommendation";
	}
	
	public String eventConditionPredictionURL(){
		return "https://uptake.com/products/event-&-condition-prediction";
	}
	
	public String rulesAlertsURL(){
		return "https://uptake.com/products/rules-&-alerts";
	}
}