package TestPages;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class murcarryRegister {


	WebDriver driver;
	private char[] title;
	murcarryRegister ts; 
	@ BeforeTest
	
	
		
		public void setupTest() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
			
			
		 	 
		 	driver = new ChromeDriver();
		 	ts = new murcarryRegister();
		 
		 	driver.manage().window().maximize();
		 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
			
			Thread.sleep(2000);

	}
	
	
	private murcarryRegister murcarryRegister() {
		// TODO Auto-generated method stub
		return null;
	}


	@Test
	
	public void validateUrl(){
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		
			Assert.assertEquals("http://newtours.demoaut.com/mercuryregister.php", "http://newtours.demoaut.com/mercuryregister.php");
	}
		@Test
		
		public void validateTitle() {
			String title= driver.getTitle();
			System.out.println(title);
			
			
			
			Assert.assertEquals("Register: Mercury Tours","Register: Mercury Tours");
		}
			
			@Test 
			
			public void validatecontactInformation()  {
				WebElement  name= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
			boolean 	namepresent=name.isDisplayed();
				Assert.assertTrue(namepresent);
				
			}
		
     @Test
     
     public void validatelastName() {
	WebElement name= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
    	boolean namepresent= name.isDisplayed(); 
    	Assert.assertTrue(namepresent); 
	
    	
    	     }
	private void isDisplayed() {
				// TODO Auto-generated method stub
				
			}


	private void getfirstName() {
				// TODO Auto-generated method stub
				
			}


	private void getFirstname() {
				// TODO Auto-generated method stub
				
			}


	@AfterTest
	
	
	public void quitTest() {
		
	
	}
	
}


