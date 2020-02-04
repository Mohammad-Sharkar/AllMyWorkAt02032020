package basicJav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty ("webdriver.chrome.driver","C:\\Users\\Basanta Poudel\\Desktop\\New folder\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		// navigate to an url 
		 
		 driver.get ("https://www.facebook.com");
		  
		  driver.findElement(By.name("firstname")).sendKeys("Bob");
		  
		  driver.findElement(By.name("lastname")).sendKeys("Poudel");
		  
		  driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		  
		  driver.findElement(By.name("reg_passwd__")).sendKeys("Anil@abc");
		  
		  
		  
		  
		 
		 
		 
		
		
		
		
		
	}

}
