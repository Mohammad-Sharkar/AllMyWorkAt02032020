package work.HomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class validateURL {

WebDriver driver;
	
@BeforeTest
public void setupTest() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
	
	
 	driver = new ChromeDriver();
 	Thread.sleep(2000);
	
	
	driver.manage().window().maximize();
		
	driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	

	
	

	
	
	
	
	
}	


	@AfterTest
	
	public void afterTest() throws InterruptedException {
	
		Thread.sleep(2000);
		driver.quit();
	}
	
	
@Test

public void validatefURl() {
	WebElement auto = 
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	boolean 
	
	
	
	
	
	
	
	
	
	
}	
	


}