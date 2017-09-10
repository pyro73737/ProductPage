package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver driver;
	
	By products = By.xpath(".//*[@class='navbar centered-content']/descendant::*[@href='/products']");
	
	public Home(WebDriver driver){
		this.driver=driver;
	}
	
	public String homeURL(){
		return "https://uptake.com/";
	}
	
	public void clickProducts(){
		driver.findElement(products).click();
	}

}
