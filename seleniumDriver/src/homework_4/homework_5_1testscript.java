package homework_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework_5_1testscript {

	
		

	public static void main (String[]args)throws InterruptedException {
	
	// setup browser
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
		
	driver.navigate().to("https://www.phptravels.net/register");
	
	
	homework_5_1 db = new homework_5_1(driver);
	
	db.getfirstName().sendKeys("Abishek");
	
	Thread.sleep(2000);
	
	
	db.getlastName().sendKeys("Poudel");
		
		
	
	db.getphone().sendKeys("8963402244");
	
	
	db.getemail().sendKeys("basantapoudel@123.com");
	
	db.getpassword().sendKeys("basanta@#1");
	
	db.getvalidpassword().sendKeys("basantapoudel1@123.com");
	
	
			
	
	
	
	
	
	
	}
	
	


}