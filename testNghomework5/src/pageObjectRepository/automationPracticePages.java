package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationPracticePages {

	
	// Assigned WebDriver as a global variable
	  
	

		WebDriver driver;
		
	 // Setup constructor 
		
		public automationPracticePages (WebDriver y) {driver = y;}
		
		
		 
	    
		String Url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		// all the  local variable
		
		String pageTitle =("log in my-store");
		
	
		By email1= By.xpath("//*[@id=\"email_create\"]");
		
		
		By name1 = By.name("id_gender");
	    By name2 = By.name("id_gender");
	    By firstName= By.name("customer_firstname");
	    By lastName = By.name("customer_lastname");
	    By email2 = By.name  ("email");
	    By password = By.name("passwd");
	    By Date = By.name("days");
	    By Month = By.name("months");
	    By year = By.name("years");
	    By signUp = By.name("newsletter");
	    By offer = By.name("optin");
	    By addressfirstName = By.name("firstname");
	    By addresslastName = By.name("lastname");
	    By addressCompany   = By.name("company");
	    By Address = By.name("address1");
	    By adressLine2 = By.name("address2");
	    By City  = By.name("city");
	    By State = By.name("id_state");
	    By postcode = By.name("postcode");
	    By country = By.name("id_country");
	    By homePhone = By.name("phone");
	    By mobile = By.name("phonemobile");
	    By adressAlias = By.name("alias");
	    By submitButton = By.xpath("//*[@id=\"submitAccount\"]/span");
	    

	    
	    
	    
	  public String Url() {
		  return Url;
	  }

public String pageTitle () {
	return pageTitle;
	
}
	
	public WebElement email1() {
		return
		driver.findElement(email1);
}

	
public WebElement name1() {
	return
	driver.findElement(name1);
	
	
	
}
public WebElement name2() {
	return
	driver.findElement(name2);
}

public WebElement firstName() {
	return
	driver.findElement(firstName);
}


public WebElement lastName() {
	return
	driver.findElement(lastName);
}


public WebElement email() {
	return
	driver.findElement(email2);

}
public WebElement password() {
	return
	driver.findElement(password);
}
public WebElement Date() {
	return
	driver.findElement(Date);


}
public WebElement month() {
	return
	driver.findElement(Month);
}
public WebElement year() {
	return
	driver.findElement(year);

}
public WebElement signUp() {
	return
	driver.findElement(signUp);
}

public WebElement offer() {
	return
	driver.findElement(offer);
}
public WebElement addressFirstName() {
	return
	driver.findElement(addressfirstName);
}

public WebElement addresslastName() {
	return
	driver.findElement(addresslastName);
}
public WebElement addressCompany() {
	return
	driver.findElement(addressCompany);
}

public WebElement address1() {
	return
	driver.findElement(Address);
}
public WebElement adressline2() {
	return
	driver.findElement(adressLine2);


}
public WebElement city() {
	return
	driver.findElement(City);
}
public WebElement state() {
	return
	driver.findElement(State);


}
public WebElement postcode() {
	return
	driver.findElement(postcode);
}
public WebElement country() {
	return
	driver.findElement(country);

}
public WebElement homePhone() {
	return
	driver.findElement(homePhone);

}


public WebElement mobile() {
	return
	driver.findElement(mobile);








}
public WebElement adressAlias() {
	return
	driver.findElement(adressAlias);

}



}