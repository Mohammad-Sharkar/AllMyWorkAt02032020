package TestScript;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectRepository.mercuryregisterPages;
import pageObjectRepository.phptravelsPages;

public class phptravelsScript {

	
	
		
		

		WebDriver driver;
	
		phptravelsPages pt;
		
		

		@BeforeTest
		
		public void setupTest() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
			
			
			
		 	 
		 	driver = new ChromeDriver();
		 	pt = new  phptravelsPages(driver);
		 
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.navigate().to("https://www.phptravels.net/register");
			
			Thread.sleep(2000); 

		}
		@Test (priority = 1)
		public void validateUrl(){
			String url= driver.getCurrentUrl();
			System.out.println(url);
			
			
			
			Assert.assertEquals("https://www.phptravels.net/register","https://www.phptravels.net/register");
			
		
		}
		
			@Test( priority = 2)
			
			public void validateTitle() {
				String title= driver.getTitle();
				System.out.println(title);	
	Assert.assertEquals("phptravels.net/register","phptravels.net/register");
			
			}
			

	@Test (priority = 3)
	
	public void fillTheForm() {
	
		pt.firstname().sendKeys("Mike");
		
	    pt.lastname().sendKeys("Poudel");
	    
	    pt.phoneNumber().sendKeys("2246437764");
	   
	    pt.email().sendKeys("mikesharma@gmail.com");
	    
	    pt.password1().sendKeys("vasanta@#1");
	    
	    pt.confirmpassword().sendKeys("vasanta@#1");
	    
	    pt.signUpbutton().sendKeys("clicksignUpbutton");
	    
	    
	  
	
		
	
		}
	
	  @AfterTest
		
			public void afterTest1() throws InterruptedException {

	driver.quit();
	Thread.sleep(2000l);   
			   
	  }
}
