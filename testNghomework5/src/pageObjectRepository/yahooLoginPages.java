package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahooLoginPages {

	
	


	

	// Assigned WebDriver as a global variable
	  
	WebDriver driver;
	
 // Setup constructor 
	
	public yahooLoginPages(WebDriver x) {driver = x;}
	
	
	 
    
	String Url = "https://login.yahoo.com/account/create?specId=yidReg";
	
	// all the  local variable
	
	
	By firstName = By.name("firstName");
	By lastName  = By.name("lastName");
	
	By email  = By.name("yid");
	By password  = By.name("password");
    By phone = By.name("phone"); 
    By month = By.name("mm");
    By day = By.name("dd");
    By year = By.name("yyyy");
    By Gender = By.name("freeformGender");
    
    
    
	

 // Create method to run each of the element
     
     
     public String Url() {
     	return Url;
     	
     }
     	
     public WebElement firstName() {
     	return
     	driver.findElement(firstName);
     	}
     
     
     
     public WebElement lastName()   {
     	return
     	driver.findElement(lastName);
     	
     }
     
     
     
    
     			
     	
     	
     
     
     public WebElement email()   {
     	
		
		return
     			
     	driver.findElement(email);
     	
     
     
     
     }

     
     public WebElement password()   {
return
	
	
	driver.findElement(password);
	
     }

     
     public WebElement phone()   {
return	
	
	driver.findElement(phone);
     }
     
     
     
     public WebElement month() {
    	
		return
    			driver.findElement(month);
    	 
     }
     
     
     
     
     public WebElement day() {
     	
		return
     			driver.findElement(day); 
     
     
}



     public WebElement year() {
      	return
      			driver.findElement(year); 
      


}
     
     public WebElement gender() {
       	
		return
       			driver.findElement(Gender); 
     }
}