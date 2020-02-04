package seleniumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phptravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/register");
		
		driver.findElement(By.name("firstname")).sendKeys("Harry");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("email")).sendKeys("harrysharma@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sharma123@");
		driver.findElement(By.name("confirmpassword")).sendKeys("Sharma123@");
		driver.findElement(By.name("HotelsLoad")).sendKeys("signup");
		
		
		
	}

}
