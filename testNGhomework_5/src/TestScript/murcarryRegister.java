package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class murcarryRegister {

	
	WebDriver driver;
	private WebElement firstName;
	public void murcarryRegisterr (WebDriver x) {driver = x;}
	
	public void getfirstName () {
	
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	}

	
	
	 //@SuppressWarnings("deprecation")
	public void validateUrl(){
			String url= driver.getCurrentUrl();
			System.out.println(url);
			
			
			Assert.assertEquals("http://newtours.demoaut.com/mercuryregister.php", "http://newtours.demoaut.com/mercuryregister.php");
	
	}
				public void validateTitle() {
					String title= driver.getTitle();
					System.out.println(title);
	
}
}