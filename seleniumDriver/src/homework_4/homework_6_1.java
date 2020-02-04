package homework_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework_6_1 {

	

	
	

	// pageObject model
	WebDriver driver;
	
	
public homework_6_1(WebDriver x )  {driver = x;}
	
	
 public WebElement getfirstName() {
	 
	 WebElement firstName = driver.findElement(By.name("firstName"));
		
		return firstName;
}
 

	

	
	

	
	
public WebElement getlastName() {
	 
	 WebElement lastName = driver.findElement(By.name("lastName"));
		
	 return lastName;
	 
} 
	 
public WebElement getemail() {
	 
	 WebElement email = driver.findElement(By.name("yid"));
		
	 return email; 
}		

public WebElement gepassword() {
	 
	 WebElement password = driver.findElement(By.name("password"));
		
	 return password; 	

}

public WebElement getphone() {
	 
	 WebElement phone= driver.findElement(By.name("phone"));
		
	 return phone; 	
		
}
public WebElement getmonth() {
	 
	 WebElement month= driver.findElement(By.id("usernamereg-month"));
		
	 return month; 	
		
	 

}
public WebElement getday() {
	 
	 WebElement day= driver.findElement(By.id("usernamereg-day"));
		 
	 return day; 	

}

public WebElement getyear() {
	 
	 WebElement year= driver.findElement(By.id("usernamereg-year"));
		
	 return year; 	
	 
	 
}
public WebElement  getgender() {
	 
	 WebElement gender= driver.findElement(By.name("freeformGender"));
		
	 return gender; 	


}

}








