
package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.mercuryPage;
import pages.signupPage;

public class mercurydef {

	WebDriver driver;
 
	mercuryPage bp;
@Given("^user is  on mercury register home page$")
public void user_is_on_mercury_register_home_page() throws InterruptedException  {
   
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basanta Poudel\\Desktop\\Selenium_Test\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
 	bp = new mercuryPage(driver);
 
 	driver.manage().window().maximize();
 
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit. SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");

	 Thread.sleep(2000);
}


@When("^user enters  first name$")
public void user_enters_first_name()  {
  bp.getfirstName().sendKeys("Ram");
}

@When("^user enter last name$")
public void user_enter_last_name()  {
 bp.getlastName().sendKeys("Poudel"); 
}

@When("^user enter phone number$")
public void user_enter_phone_number()  {
  bp.getphoneNumber().sendKeys("2239457788");  
}

@When("^user enter email$")
public void user_enter_email()  {
	
bp.getemail().sendKeys("ramsharma@gmail.com");
}

@When("^user enter address(\\d+)$")
public void user_enter_address1(int arg1)  {
   bp.getaddress1().sendKeys("8500 New Hampshire Ave");
}

@When("^user enter address (\\d+)$")
public void user_enter_address(int arg1)  {
	bp.getaddress2().sendKeys("1719 East West highway");
} 

@When("^user enter  city$")
public void user_enter_city()  {
	bp.getcity().sendKeys("Silver Spring");
	
    }

@When("^user enter State$")
public void user_enter_State()  {
    bp.getstate().sendKeys("MD");
    
    
    
}

@When("^user enter postal code$")
public void user_enter_postal_code()  {
    bp.getpostalCode().sendKeys("20093");
}

@When("^user select country$")
public void user_select_country()  {
  bp.getcountry().sendKeys("United States");
}

@When("^user enter user name$")
public void user_enter_user_name() {
	bp.getuserName().sendKeys("ramsharma@gmail.com");
}

@When("^user enter password$")
public void user_enter_password()  {
    bp.getpassword().sendKeys("ram@#1234");
   
}

@When("^user enter conform password$")
public void user_enter_conform_password()  {
    bp.getconfirmpass().sendKeys("ram@#1234");
    
}
    @When("^user click on submit button$")
    public void user_click_on_submit_button() {
      
    	bp.getsubmitButton().sendKeys("click");
    }

@Then("^user is able to navigate to new account$")
public void user_is_able_to_navigate_to_new_account()  {
    
}


	
	
	
	
	
}
