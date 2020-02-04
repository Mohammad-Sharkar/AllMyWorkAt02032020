package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookSignupPage {

	
	
	
// 	Assign web driver as a global variable
	
	
	
	WebDriver driver;
	
	// Creating constructor 
	
	public facebookSignupPage(WebDriver x) {driver =x;
	
	String Url = "https://www.facebook.com/";
}


	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By email = By.name("reg_email_");
	By password = By.name("reg_passwd_");
	By month = By.name("birthday_month");
	By day = By.name("birthday_day");
	By year = By.name("birthday_year");
	By gender = By.name("sex");
	By submit = By.name("websubmit");
	
	
	public WebElement getfirstname() {
		return
		driver.findElement(firstname);
	
	
}

	public WebElement getlastname() {
		return
		driver.findElement(lastname);	
	
	}
	public WebElement getemail() {
		return
		driver.findElement(email);
}
	public WebElement getpassword() {
		return
		driver.findElement(password);	
	
}
	public WebElement getmonth() {
		return
		driver.findElement(month);	
	
}	
	public WebElement getday() {
		return
		driver.findElement(day);	
	
}	
	public WebElement getyear() {
		return
		driver.findElement(year);	
}	
	public WebElement getgender() {
		return
		driver.findElement(gender);
	
}
	public WebElement submit() {
		return
		driver.findElement(submit);
}
	

	
	
	
	
	
	
}