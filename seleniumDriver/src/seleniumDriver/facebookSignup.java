package seleniumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HOMEWORK 1 Basanta
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
				
		
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
	driver.findElement(By.name("firstName")).sendKeys("Bob");
	driver.findElement(By.name("lastName")).sendKeys("Sharma");
	driver.findElement(By.name("phone")).sendKeys("1234567890");
	driver.findElement(By.name("userName")).sendKeys("Bobsharma@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("1917 Silver Spring");
	driver.findElement(By.name("address2")).sendKeys("8500 Silver Spring");
	driver.findElement(By.name("city")).sendKeys("Silver Spring");
	driver.findElement(By.name("state")).sendKeys("Maryland");
	driver.findElement(By.name("postalCode")).sendKeys("20910");
	driver.findElement(By.name("email")).sendKeys("bobsharma@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Bob@123");
	driver.findElement(By.name("confirmPassword")).sendKeys("Bob@123");
	
	
	
	//HOMEWORK 2
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromdriver.exe");
	
	
	driver.get("https://www.phptravels.net/register");
	
	driver.findElement(By.name("firstname")).sendKeys("Harry");
	driver.findElement(By.name("lastname")).sendKeys("Sharma");
	
	
	
	
	
	
	
	}
		
		
	}

