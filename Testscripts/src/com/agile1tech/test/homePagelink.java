package com.agile1tech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class homePagelink {

	
	
	
WebDriver driver;
	
	
	@BeforeTest
	
	
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium Test\\chromedriver.exe");
		
		
	 	driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
			
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	@Test
	
	public void validateURL() {
		
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	
		Assert.assertEquals("http://newtours.demoaut.com/mercuryregister.php", "http://newtours.demoaut.com/mercuryregister.php");
	
	
	
	}
	
@AfterTest
  
public void quitTest() {

	
}










}
