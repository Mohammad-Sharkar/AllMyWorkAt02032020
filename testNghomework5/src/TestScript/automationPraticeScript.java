
package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjectRepository.automationPracticePages;
import pageObjectRepository.mercuryregisterPages;

public class automationPraticeScript {


	WebDriver driver;
	
	automationPracticePages  bp;
	
	
	@BeforeTest
	

		public void setupTest() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
		
			
			
		 	 
		 	driver = new ChromeDriver();
		 	bp = new  automationPracticePages(driver);
		 
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			
			 		
			
			Thread.sleep(2000); 	
	}
	
	

	@Test (priority = 1)
	public void validateUrl(){
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
	
	}
	
	
	@Test (priority = 2)
	public void pageTitle(){
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
	
	Assert.assertEquals("Login-My Store", "Login-My Store");
	}

	@Test (priority = 3)
	
	public void Form() throws InterruptedException {
         bp.email().sendKeys("amirshah@gmail.com");
		bp.name1().sendKeys("Male");
	     
		bp.name2().sendKeys("Female");
		
		bp.firstName().sendKeys("Amir");
		
		bp.lastName().sendKeys("Sharma");
		
		bp.email().sendKeys("amirsharma@gmail.com");
		bp.password().sendKeys("1234@#");
		bp.Date().sendKeys("01");
		bp.month().sendKeys("12");
		bp.year().sendKeys("20017");
		bp.signUp().sendKeys("signUp");
		bp.offer().sendKeys("click");		
		bp.addressFirstName().sendKeys("Harry");
		bp.addresslastName().sendKeys("Sharma");
		bp.addressCompany().sendKeys("HarrySharmapvt");
		bp.address1().sendKeys("8600");
		bp.adressline2().sendKeys("Piney branch");
		bp.city().sendKeys("Silver Spring");
		bp.state().sendKeys("MD");
		bp.postcode().sendKeys("20345");
		bp.country().sendKeys("America");
		bp.homePhone().sendKeys("2347892254");
		bp.mobile().sendKeys("7036549988");
		bp.adressAlias().sendKeys("adressAlias");
		
		
		
}
	

@Test(priority=3)

public void clickRegisterButton() {
	
	
	
	
}








































  
@AfterTest

	public void afterTest() throws InterruptedException {

driver.quit();
Thread.sleep(2000);  


}

}
