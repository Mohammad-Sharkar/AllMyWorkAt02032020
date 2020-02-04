package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phptravelsPages {

	//creating the global variable
	
	WebDriver driver; {

	}
	
	
	
	// creating the constructor 
	
	public phptravelsPages (WebDriver y) { driver = y;}
	
	
	String Url  = "https://www.phptravels.net/register";
			
			// all the local variable 
	
	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By phone = By.name("phone");
	By email = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmpassword");
    By signupbutton  = By.xpath("//*[@id=\"headersignupform\"]/div[9]/button");
	
    
    
    public String Url() {
    	return Url;
    	
    }
    	
    public WebElement firstname() {
    	
		return
    	driver.findElement(firstname);
    	}
    
    
    
    public WebElement lastname()   {
    	return
    	driver.findElement(lastname);
    	
    }
    
    
    public WebElement phoneNumber()   {
    	return
    			
    	driver.findElement(phone);
    	
    }
    
    public WebElement email()   {
    	return
    			
    	driver.findElement(email);
    	
    
    
    
    }

    
    public WebElement password1()   {
    	
	
		return
    			
    	driver.findElement (password);
    	
    }
    
    

    public WebElement  confirmpassword()   {
    	
	
		return
    			
    	driver.findElement(confirmpassword);
    
}
    
    

    public WebElement signUpbutton()   {
    	
	
		return
    			
    	driver.findElement(signupbutton);
}
   
}  
    
    

