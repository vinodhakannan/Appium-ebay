package ebay.appium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test (priority=0)

public class LoginValidation extends LaunchApp{
	TestData data = null;
	

	public void loginaction() {
	// to check valid login
	driver.findElement(By.id("com.ebay.mobile:id/home")).click();
	
	driver.findElement(By.id("com.ebay.mobile:id/edit_text_username")).sendKeys(("vinodhakanan@gmail.com"));
	
	driver.findElement(By.id("com.ebay.mobile:id/edit_text_password")).sendKeys(("vino170$"));
	
	driver.findElement(By.id("com.ebay.mobile:id/button_sign_in")).click();
	   
	   

	}   
	@Test
	 
	public void invalid_BlankPassword() throws Exception {
	   //to check invalid login
		driver.findElement(By.id("com.ebay.mobile:id/home")).click();
		
		driver.findElement(By.id("com.ebay.mobile:id/edit_text_username")).sendKeys(("vinodhakanan@gmail.com"));
		
		driver.findElement(By.id("com.ebay.mobile:id/edit_text_password")).sendKeys((""));
		
		driver.findElement(By.id("com.ebay.mobile:id/button_sign_in")).click();
	 
	}
	
	@AfterMethod
	 
	public void tearDown() throws Exception {
	 
	driver.quit();
	 
	}
	 
	}
	   




