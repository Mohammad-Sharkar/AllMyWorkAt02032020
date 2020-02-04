package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjectRepository.mercuryregisterPages;
import pageObjectRepository.yahooLoginPages;

public class yahooLoginScript {

	

	WebDriver driver;
	
	yahooLoginPages ds;
	
	@BeforeTest
	

		public void setupTest() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
		
			
		 	 
		 	driver = new ChromeDriver();
		 	ds= new yahooLoginPages (driver);
		 
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.navigate().to("https://login.yahoo.com/account/create?specId=yidReg");
			
			Thread.sleep(2000); 

	}
	
	@Test 
	public void validateUrl(){
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		Assert.assertEquals("https://login.yahoo.com/account/create?specId=yidReg", "https://login.yahoo.com/account/create?specId=yidReg");
		
	
	
	}
	
	@Test (priority= 1)
	
	public void fillTheForm()  {
		
		ds.firstName().sendKeys("Anil");	
		ds.lastName().sendKeys("Sharma");
		ds.email().sendKeys("anilsharma@gmail.com");
	    ds.password().sendKeys("raja@!#$");
	    ds.phone().sendKeys("2246234567");
	 ds.month().sendKeys("March");
	 ds.day().sendKeys("25");
	 ds.year().sendKeys("1998");
	 ds.gender().sendKeys("male");
	 
	}
	
	
}
	

