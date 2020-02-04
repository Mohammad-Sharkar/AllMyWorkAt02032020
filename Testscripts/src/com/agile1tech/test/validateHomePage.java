package com.agile1tech.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateHomePage {

	WebDriver driver;
	
	
	@BeforeTest
	
	
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
		
	 	driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
			
		driver.navigate().to("https://www.phptravels.net/register");
		
		Thread.sleep(2000);
	}
	
	@Test
	
	public void validateTitle(){
		
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
Assert.assertEquals("Test","Test12" );
	
	}
	
	@AfterTest
	
	
	public void QuitTest() {
		
		driver.quit();
	}
	
	
}

	
	



