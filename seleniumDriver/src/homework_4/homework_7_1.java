package homework_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework_7_1 {
	// pageObject model
		WebDriver driver;
		
		
	public homework_7_1(WebDriver x )  {driver = x;}
		
		
	 public WebElement getfirstlink() {
		 
		 WebElement firstlink = driver.findElement(By.linkText("Specials"));
			
			return firstlink;
	
	 }
	 
public WebElement secondlink() {
		 
		 WebElement secondlink = driver.findElement(By.linkText("Bestsellers"));
			
			return secondlink;
			
			
	 
}

public WebElement thirdlink() {
	
	WebElement thirdlink = driver.findElement(By.linkText("ourstores"));
	
	return thirdlink;
}
	
	WebElement fourthlink1() {
		WebElement fourthlink1 = driver.findElement(By.linkText("contactus"));
		
		return fourthlink1;
			
	
}
	
	
}
	
	
	
	
	
	
	
	
	
	

