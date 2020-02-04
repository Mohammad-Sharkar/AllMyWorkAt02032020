package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercuryregisterPages {

	// Assigned WebDriver as a global variable
	  
	WebDriver driver;
	
 // Setup constructor 
	
	public mercuryregisterPages(WebDriver y) {driver = y;}
	
	
	 
    
	String Url = "http://newtours.demoaut.com/mercuryregister.php";
	
	// all the  local variable
	
	
	By firstName = By.name("firstName");
	By lastName  = By.name("lastName");
	By phonenumber     = By.name("phone");
	By email  = By.id("userName");
	By address1 = By.name("address1");
    By address2 = By.name("address2"); 
    By city = By.name("city");
    By state = By.name("state");
    By postalCode = By.name("postalCode");
    By country = By.name("country");
    By userName= By.id("email");
    By password = By.name("password");
    By confirmpass = By.name("confirmPassword");
    By submitButton = By.name("register");
    

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
    
    
    public WebElement phoneNumber()   {
    	return
    			
    	driver.findElement(phonenumber);
    	
    }
    
    public WebElement email()   {
    	return
    			
    	driver.findElement(email);
    	
    
    
    
    }

    
    public WebElement address1()   {
    	
	
		return
    			
    	driver.findElement(address1);
    	
    }
    
    

    public WebElement address2()   {
    	
	
		return
    			
    	driver.findElement(address2);
    
}
    
    

    public WebElement city()   {
    	
	
		return
    			
    	driver.findElement(city);
}
   
    
    
    

    public WebElement state()   {
    	
	
		return
    			
    	driver.findElement(state);
}  

    
    public WebElement postalCode()   {
    	
	
		return
    			
    	driver.findElement(postalCode);
    
    
    
}

    public WebElement country()   {
    	
	
		return
    			
    	driver.findElement(country);
    
    
}   
    
    public WebElement userName()   {
    	
    	
		return
    			
    	driver.findElement(userName);
}
    
    
    public WebElement password()   {
    	
    	
		return
    			
    	driver.findElement(password);  

    
    
} 
    public WebElement confirmpass()   {
    	
    	
		return
    			
    	driver.findElement(confirmpass);  
    
}
    public WebElement submitButton()   {
    	
    	
		return
    			
    	driver.findElement(submitButton); 
    
    }
    
}