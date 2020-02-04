package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercuryPage {

//Assigning driver 
	
 WebDriver driver; 
	
	// creating constructor 
 
 public mercuryPage (WebDriver b) { driver = b;}

 
 String Url = "http://newtours.demoaut.com/mercuryregister.php";
 
 
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
By click = By.name("register");

//Create method to run each of the element


public String Url() {
	return Url;
	
}
	
public WebElement getfirstName() {
	return
	driver.findElement(firstName);
	}



public WebElement getlastName()   {
	return
	driver.findElement(lastName);
	
}


public WebElement getphoneNumber()   {
	return
			
	driver.findElement(phonenumber);
	
}

public WebElement getemail()   {
	return
			
	driver.findElement(email);
	



}


public WebElement getaddress1( )   {
	

	return
			
	driver.findElement(address1);
	
}



public WebElement getaddress2()   {
	

	return
			
	driver.findElement(address2);

}



public WebElement getcity()   {
	

	return
			
	driver.findElement(city);
}





public WebElement getstate()   {
	

	return
			
	driver.findElement(state);
}  


public WebElement getpostalCode()   {
	

	return
			
	driver.findElement(postalCode);



}

public WebElement getcountry()   {
	

	return
			
	driver.findElement(country);


}   

public WebElement getuserName()   {
	
	
	return
			
	driver.findElement(userName);
}


public WebElement getpassword()   {
	
	
	return
			
	driver.findElement(password);  



} 
public WebElement getconfirmpass()   {
	
	
	return
			
	driver.findElement(confirmpass);  

}
public WebElement getsubmitButton()   {
	
	
	return
			
	driver.findElement(click); 

}
}
