package lint.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Gud {
	
    
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Geckodriver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://facebook.com");
		System.out.println("Advanced Level");
		driver.quit();
		System.out.println("Project 1");

		
	 
		

	}

}
