package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	public Base() {
		
		if(driver==null) {
			String browsername="chrome";
			
			switch(browsername) {
			
			case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			}
			driver.manage().window().maximize();
			driver.get("http://14.142.204.101/admin/login");
		}
		
	}
	
}
