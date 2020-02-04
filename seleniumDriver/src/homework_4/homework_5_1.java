package homework_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homework_5_1 {

	
	// pageObject model
	WebDriver driver;
	
	
public homework_5_1(WebDriver x )  {driver = x;}
	
	
 public WebElement getfirstName() {
	 
	 WebElement firstName = driver.findElement(By.name("firstname"));
		
		return firstName;
 
		
 
}
 public WebElement getlastName() {
 WebElement lastName = driver.findElement(By.name("lastname"));
	
	return lastName;
 
}
 
 public WebElement getphone () {
	 WebElement phone = driver.findElement(By.name("phone"));
		
		return phone;
 
}
 
 public WebElement getemail() {
	 WebElement email = driver.findElement(By.name("email"));
		
		return email;
}
 
 public WebElement getpassword() {
	 WebElement password = driver.findElement(By.name("password"));
		
		return password;
		
		
 
}
 
 
 
 public WebElement getvalidpassword() {
	 WebElement validpassword = driver.findElement(By.name("confirmpassword"));
		
		return validpassword;
		
		
		
		
		
}
 public WebElement findsignupButton() {
	 WebElement signupButton = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button"));
		
		return signupButton;
}
 
}
 
 
 
 
 
 
 
 
 
 
 
 