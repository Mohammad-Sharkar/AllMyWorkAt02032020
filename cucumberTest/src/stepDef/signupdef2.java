package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.signupPage;

public class signupdef2 {

	WebDriver driver;
	
	signupPage ls;
	
	
	
	@Given("^user is on the  facebook signup page for facebook$")
	public void user_is_on_the_facebook_signup_page_for_facebook() throws Throwable {
	  
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
 	ls = new signupPage (driver);
 
 	driver.manage().window().maximize();
 
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.navigate().to("https://www.facebook.com/");
	
	 Thread.sleep(2000);
	 
	}
	@When("^user enters first name for facebook \"([^\"]*)\"$")
	public void user_enters_first_name_for_facebook(String arg1)  {
		 ls.getfirstname().sendKeys("Anil");	 
		 
		
		
	}

	@When("^user enters  last name  for  facebook \"([^\"]*)\"$")
	public void user_enters_last_name_for_facebook(String arg1)  {
	   ls.getlastname().sendKeys("Poudel");
	}

	@When("^user enters  mobile number or email id for facebook \"([^\"]*)\"$")
	public void user_enters_mobile_number_or_email_id_for_facebook(String arg1)  {
		ls.getemail().sendKeys("anilsharma@gmail.com");
	}
	@When("^user re enters email id$")
	public void user_re_enters_email_id()  {
	    
		ls.getreemail().sendKeys("anilsharma@gmail.com");
	}




	@When("^user enters new password for facebook \"([^\"]*)\"$")
	public void user_enters_new_password_for_facebook(String arg1)  {
		ls.getpassword().sendKeys("@basanta@");	
		
	   	}

	@When("^user select birthday month \"([^\"]*)\"$")
	public void user_select_birthday_month(String arg1)  {
	ls.getmonth().sendKeys("feb");	
		
	    	}

	@When("^user select  date \"([^\"]*)\"$")
	public void user_select_date(String arg1)  {
		
		ls.getday().sendKeys("17");
	   	}

	@When("^user select year\"([^\"]*)\"$")
	public void user_select_year(String arg1)  {
	   
		ls.getyear().sendKeys("1987");
	}
	@When("^user select gender$")
	public void user_select_gender() {
	  
		ls.getgender().sendKeys("Male");
	}
	
	
	@When("^user click on signup button \"([^\"]*)\"$")
	public void user_click_on_signup_button(String arg1) {
	   ls.getsignup().sendKeys("clicksignup");

	}

	@Then("^user is able navigate to new facebook account for sign up$")
	public void user_is_able_navigate_to_new_facebook_account_for_sign_up()  {
	    
	}


}
