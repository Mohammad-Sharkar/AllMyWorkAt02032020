package seleniumBasicCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setting up the browser 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Basanta Poudel\\Desktop\\New folder\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new  ChromeDriver();
		
	
		driver.get ("http://www.facebook.com");
		driver1.get ("http://www.google.com");
		
		
		
	
	
	
		
		

		
		
		
		
		
		
	}

}
