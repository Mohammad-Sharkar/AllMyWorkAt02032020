package homework_4;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework_4_1 {

	
	
	 
		WebDriver driver;
	public homework_4_1(WebDriver y) { driver = y;}
	
	
	public WebElement getFirstName() {
		
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		
		return firstName;
	}
		
		
public WebElement getlastName() {
		
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		
		return lastname;	
		
		
		
			
			
		
			
		}
		
public WebElement getphone() {
	
	
	WebElement phone = driver.findElement(By.name("phone"));
	
	return phone;		
}

	public WebElement getemail() {
	
	WebElement email = driver.findElement(By.name("email"));
	return email;
	
	}
	
	
	public WebElement getaddress1() {
	
	WebElement address1 = driver.findElement(By.name("address1"));
	
	return address1;
	
	
	
}

	public WebElement getcity() {
	
	WebElement city = driver.findElement(By.name("city"));
	
	return city;

}	
	public WebElement  getstate() {
		
		WebElement state = driver.findElement(By.name("state"));
		
		return state;
	
}
public WebElement getpostalcode() {
	
		
		WebElement postalcode = driver.findElement(By.name("postalCode"));
		
		return postalcode;
}	
		
	public Select dropdownCountry()	{
		WebElement country =
		driver.findElement(By.name("country"));
		Select Cname= new Select (country);
		
		return Cname;
		
		
		
		
	}
		
		
		

public WebElement getuserinfo() {
	
	WebElement userinfo = driver.findElement(By.name("email"));
	
	return userinfo;
}	

public WebElement getpassword() {
	
	WebElement password = driver.findElement(By.name("password"));
	
	return password;	
	
}



}
	
	
	
	







