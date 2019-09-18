package multiplE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GridConcept {
	
	static WebDriver driver;
	DesiredCapabilities cap;
	static String url = "http://orangehrm.qedgetech.com";
	
	@Parameters({"browser"})
	@BeforeTest
	public static void main(String brw) {
		
		if (brw.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
		
		else if(brw.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			
		}
		
		else {
			
			System.out.println("Browser value not matching");
		}

	}
	@Parameters({"uid","pwd"})
	@Test
	public void login(String uid,String pwd)
	{
		driver.findElement(By.name("txtUsername")).sendKeys(uid);
		
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		
		driver.findElement(By.name("Submit")).click();
	}
	
	@AfterTest
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
