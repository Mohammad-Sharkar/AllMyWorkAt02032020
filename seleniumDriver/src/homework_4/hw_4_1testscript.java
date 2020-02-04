package homework_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_4_1testscript {

	
	
		public static void main (String[]args)throws InterruptedException {
		
		// setup browser
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		
		
		
		
		homework_4_1 ht = new homework_4_1(driver);
		
		
		// first name 
		
		ht.getFirstName().sendKeys("John");
		
		//last name
		
		ht.getlastName().sendKeys("Sharma");
		// phone number
		
		ht.getphone().sendKeys("1234256787");
		
		//email
		ht.getemail().sendKeys("johnsharma@yahoo.com");
		
		// address
		ht.getaddress1().sendKeys("8500 New Hampshire Ave");
		
		Thread.sleep(2000);
		
		//city
		
	ht.getcity().sendKeys("Silver Spring");
	
	// state
	
  ht.getstate().sendKeys("MD");
	
	
	
  // postal code
  
  ht.getpostalcode().sendKeys("20009");
  
  
  ht.dropdownCountry().selectByValue("251");
  
  
//  password
  
  
  ht.getpassword().sendKeys("hpphg@h12");
  
  
  
  
  // conform password
  
  
  ht.getpassword().sendKeys("hppg@h12");
  
  //submit button
  
  
  
	}
		
		
		
		

}
