package ebay.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.HashMap;


public class Uigesture extends LaunchApp {


    protected WebDriver driver;
    String app_package_name = "com.ebay.mobile-5.16.apk";

    public Uigesture(WebDriver driver) {
        this.driver = driver;
    }
@Test
    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
@Test
    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
@Test
    public void scrollPageUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.50);
        swipeObject.put("startY", 0.95);
        swipeObject.put("endX", 0.50);
        swipeObject.put("endY", 0.01);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }

@Test
    public void swipeLeftToRight() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.01);
        swipeObject.put("startY", 0.5);
        swipeObject.put("endX", 0.9);
        swipeObject.put("endY", 0.6);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
@Test
    public void swipeRightToLeft() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.9);
        swipeObject.put("startY", 0.5);
        swipeObject.put("endX", 0.01);
        swipeObject.put("endY", 0.5);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
@Test
    public void swipeFirstCarouselFromRightToLeft() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.9);
        swipeObject.put("startY", 0.2);
        swipeObject.put("endX", 0.01);
        swipeObject.put("endY", 0.2);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
@Test
    public void performTapAction(WebElement elementToTap) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> tapObject = new HashMap<String, Double>();
        tapObject.put("x", (double) 360); // in pixels from left
        tapObject.put("y", (double) 170); // in pixels from top
        tapObject.put("element", Double.valueOf(((RemoteWebElement) elementToTap).getId()));
        js.executeScript("mobile: tap", tapObject);
   
   }
@Test
    public void screenrotation() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	
    }
    
}





