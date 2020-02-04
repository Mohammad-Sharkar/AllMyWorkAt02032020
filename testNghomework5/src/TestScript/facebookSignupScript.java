package TestScript;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjectRepository.automationPracticePages;
import pageObjectRepository.facebookSignupPage;
import pageObjectRepository.phptravelsPages;

public class facebookSignupScript {

	WebDriver driver;
	facebookSignupPage bs;

	@BeforeTest
	

		public void setupTest() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
			
			
		 	 
		 	driver = new ChromeDriver();
		 	bs = new facebookSignupPage (driver);
		 
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.navigate().to("http:/www.facebook.com");
			 		
			
			Thread.sleep(2000); 	
	 
	}
	
	
	@Test (priority = 1)
	public void validateUrl() throws InterruptedException   {
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
	
		Assert.assertEquals("http:/www.facebook.com/", "http:/www.facebook.com/");

		Thread.sleep(2000);
	}
	@Test (priority = 2)
	public void pageTitle(){
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
	
	Assert.assertEquals("Facebook- Login or Sign Up", "Facebook- Login or Sign Up");
	}
	
@Test (priority =3)
public void FillTheForm () {
	
	bs.getfirstname().sendKeys("Basanta");
}




	  @AfterTest
		
			public void afterTest1() throws InterruptedException {

	driver.quit();
	Thread.sleep(2000);   
	  }
	
}




