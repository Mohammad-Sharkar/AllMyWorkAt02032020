package homework_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework_6_1testscript {

	
	

		

	public static void main (String[]args)throws InterruptedException {
	
	// setup browser
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
		
	driver.navigate().to("https://login.yahoo.com/account/create?specId=yidReg");
	
	
	homework_6_1 db = new homework_6_1(driver);
	
	db.getfirstName().sendKeys("David");
		
	db.getlastName().sendKeys("Sharama");	
	
	db.getemail().sendKeys("davidsharma@gmail.com");
	
	db.gepassword().sendKeys("David@#$");
	
	db.getphone().sendKeys("1237658892");
	
	
	
	db.getmonth().sendKeys("1");
	
	db.getyear().sendKeys("1996");

	db.getday().sendKeys("06");

	db.getgender().sendKeys("male");
	}
}




