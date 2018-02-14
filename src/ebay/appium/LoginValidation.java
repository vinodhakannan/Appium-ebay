package ebay.appium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import uicomponents.LoginScreen;

@Test (priority=0)

public class LoginValidation extends LaunchApp{
	TestData data = null;
	

	public void loginaction() {
	// to check valid login
		
		driver.findElement(LoginScreen.hamburgerMenu).click();
		driver.findElement(LoginScreen.signoutstatus).click();
		driver.findElement(LoginScreen.username).click();
		driver.findElement(LoginScreen.username).sendKeys("vinodhakanan@gmail.com");
		driver.findElement(LoginScreen.password).click();
		driver.findElement(LoginScreen.password).sendKeys("vino170");
		driver.findElement(LoginScreen.SignIn).click();
	   

	}   
	@Test 
	 
	public void invalid_BlankPassword() throws Exception {
	   //to check invalid login
		
		driver.findElement(LoginScreen.hamburgerMenu).click();
		driver.findElement(LoginScreen.signoutstatus).click();
		driver.findElement(LoginScreen.username).click();
		driver.findElement(LoginScreen.username).sendKeys("sjhb@gma.com");
		driver.findElement(LoginScreen.password).click();
		driver.findElement(LoginScreen.password).sendKeys("empty");
		driver.findElement(LoginScreen.SignIn).click();
	 
	}
	
}
	   




