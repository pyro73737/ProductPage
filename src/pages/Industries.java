package pages;

import org.openqa.selenium.WebDriver;

public class Industries {
	
	WebDriver driver;
	
	public Industries(WebDriver driver){
		this.driver=driver;
	}

	public String industriesURL(){
		return "https://uptake.com/industries";
	}	
}