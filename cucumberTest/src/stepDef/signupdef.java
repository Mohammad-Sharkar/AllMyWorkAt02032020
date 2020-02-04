package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.signupPage;





 


public class signupdef {
	
	WebDriver driver;
	signupPage bd;
	
	@Given("^user is on the  facebook signup page$")
	public void user_is_on_the_facebook_signup_page() throws InterruptedException  {
	   
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
			
		
		driver = new ChromeDriver();
	 	bd = new signupPage(driver);
	 
	 	driver.manage().window().maximize();
	 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.navigate().to("https://www.facebook.com/");
	
		 Thread.sleep(2000);
	}
		   	

		 @When("^user enters first name for facebook$")
		 
		 public void user_enters_first_name_for_facebook()  {
			 bd.getfirstname().sendKeys("Anil");	 
			 
		 }

		 @When("^user enters  last name  for  facebook$")
		 public void user_enters_last_name_for_facebook()  {
			 bd.getlastname().sendKeys("");	 
			 
		 }

		 @When("^user enters  mobile number or email id for facebook$")
		 public void user_enters_mobile_number_or_email_id_for_facebook()  {
			bd.getemail().sendKeys("");
		 
		 }
		// @When("^user reenter mobile number or email id  for facebook$")
		 public void user_reenter_mobile_number_or_email_id_for_facebook()  {
			 bd.getemail().sendKeys("");
			 
		 }
		 @When("^user enters new password for facebook$")
		 public void user_enters_new_password_for_facebook()  {
			bd.getpassword().sendKeys("basanta@123@@");
		 }
		 @When("^user select birthday month$")
		 public void user_select_birthday_month()  {
			 bd.getmonth().sendKeys("feb");  
		 }

		 @When("^user select  date$")
		 public void user_select_date() throws Throwable {
		 }

		 @When("^user select year$")
		 public void user_select_year()  {
		 }

		 @When("^user click on signup button$")
		 public void user_click_on_signup_button()  {
		     		 }

		 @Then("^user is able navigate to new facebook account$")
		 public void user_is_able_navigate_to_new_facebook_account() {
		    
		 }

	 
		 
		 
		 
		 
	}

	