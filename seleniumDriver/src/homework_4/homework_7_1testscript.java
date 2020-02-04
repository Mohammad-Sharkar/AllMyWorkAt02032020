package homework_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework_7_1testscript {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub


		
		
		// setup browser
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
			
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
		homework_7_1 rd = new homework_7_1(driver);
	
		
		rd.getfirstlink().click();
		
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		

		
		
	 }
}