package uicomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LoginScreen {
	

	 public static final By hamburgerMenu = By.id("com.ebay.mobile:id/home");
	
	public static final By signoutstatus = By.id("com.ebay.mobile:id/textview_sign_out_status");
 
	public static final By username = By.id("com.ebay.mobile:id/edit_text_username");
 
	public static final By password = By.id("com.ebay.mobile:id/edit_text_password");
 
	public static final By SignIn = By.id("com.ebay.mobile:id/button_sign_in");
 
	}
