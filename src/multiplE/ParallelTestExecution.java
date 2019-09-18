package multiplE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestExecution {

	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void tc_01(String browser ) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
			
			 driver = new FirefoxDriver();
			
		}
	}
	
	@Test(priority = 2)
	public void Testing() {
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");

	}
	@Test(priority = 1)
	public void Testing143() {
		
		driver.get("http://www.facebook.com");
		
		
	}
	
	
	@AfterClass
	public void clos() {
		
		
		driver.quit();
	}
}
