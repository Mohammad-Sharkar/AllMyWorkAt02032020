package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPage {

		
	// 	Assign web driver as a global variable
		
		
		
		WebDriver driver;
		
		// Creating constructor 
		
		public signupPage(WebDriver y) {driver = y;} 
		
		String Url = "https://www.facebook.com/";
	
	
	
		By firstname = By.name("firstname");
		By lastname = By.name("lastname");
		By email = By.xpath("//*[@id=\"u_0_k\"]");
		By reemail = By.xpath("//*[@id=\"u_0_n\"]");
		By newpassword= By.xpath("//*[@id=\"u_0_p\"]");
		By month = By.xpath("//*[@id=\"month\"]");
		By day = By.name("birthday_day");
		By year = By.name("birthday_year");
		By gender = By.name("sex");
		By signup = By.xpath("//*[@id=\"u_0_w\"]");
		
		
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
			
		public WebElement getreemail() {
		
		return 
				driver.findElement(reemail);
		}
	
		public WebElement getpassword() {
			return
			driver.findElement(newpassword);	
		
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
		public WebElement getsignup() {
			return
			driver.findElement(signup);
	}

		
		
		
	
		
		
		
		
		
		
	

}
