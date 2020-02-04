package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
		
		
		
		
		
		
		
		
	}

}
