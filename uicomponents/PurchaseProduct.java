package uicomponents;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

import org.openqa.selenium.support.PageFactory;


public class PurchaseProduct {
	
	 public static final By Searchicon = By.id("com.ebay.mobile:id/search_box");
	 
	 public static final By Searchfield = By.id("com.ebay.mobile:id/search_box");
 
	 public static final By product = By.id("/html/body/div[5]/div/div/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td/div[2]/ul/li/a/b[2]");
	 		
	 public static final By Buyitnow = By.id("//android.widget.Button[@content-desc=\\\"Buy It Now\\\"");
	 
	 
}
