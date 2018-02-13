package ebay.appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test (priority=0)

public class LoginValidation extends LaunchApp{
	TestData data = null;
	

	public void loginaction() {
	
	driver.findElement(By.id("com.ebay.mobile:id/home")).click();
	
	driver.findElement(By.id("com.ebay.mobile:id/textview_sign_out_status")).click();
	
	driver.findElement(By.id("com.ebay.mobile:id/edit_text_username")).sendKeys(("vinodhakanan@gmail.com"));
	
	driver.findElement(By.id("com.ebay.mobile:id/edit_text_password")).sendKeys(("vino170$"));
	
	driver.findElement(By.id("com.ebay.mobile:id/button_sign_in")).click();
	   
	   

	}    
	   
}



