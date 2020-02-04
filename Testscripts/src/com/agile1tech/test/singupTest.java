package com.agile1tech.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class singupTest {

	
	@BeforeMethod
	
	public void setupTest() {
		
	System.out.println("This is in beforemethod");	
		
	}
	

@AfterMethod
	
	public void afterTest() {
	
		System.out.println("This is AfterMethod");
		
}	
	
@BeforeTest

public  void beforeTest() {
	
	
	
	System.out.println("This is before Test");
}




	@Test
	
	public void validateTitle() {
		System.out.println("This is a test");
		
	
}
	
	@AfterTest
	
	public void quitTest() {
	
		System.out.println("This is after test");
		
		
	}

	}

