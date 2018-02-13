package ebay.appium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//Llibrary for Appium drivers
import io.appium.java_client.android.AndroidDriver;
//Libraries for configuring Desired Capabilities
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import ebay.appium.LaunchApp.TestData;
import org.openqa.selenium.By;
//Library to create the path to APK
import java.io.File;
//Library used to verify if URL is malformed
import java.net.MalformedURLException;
//Library used to create URL for the Appium server
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class LaunchApp {
	public interface TestData {

	}

TestData data = null;
AppiumDriver<MobileElement> driver;
String Path;
@BeforeSuite
public void SetUp()

{
	  
	  Path = System.getProperty("user.dir");
	  File appDir = new File("C:\\Users\\vinodhakannan\\DebelopmentAvecto\\ebay apk");
      File app = new File(appDir, "com.ebay.mobile-5.16.apk");
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("device","Android");
    //mandatory capabilities
      capabilities.setCapability("deviceName","Preview-Google Pixel");
      capabilities.setCapability("platformName","Android");
      capabilities.setCapability("geny motion", "192.168.243.101:5555");
      capabilities.setCapability("appPackage", "com.ebay.mobile");
      capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
      capabilities.setCapability("app", app.getAbsolutePath());
	

try
{
	driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
}
catch (MalformedURLException e) {
		e.printStackTrace();
	}
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}



public static void main(String[] args) throws MalformedURLException {
		 LaunchApp obj = new LaunchApp();
		 obj.SetUp();
		 
		 
		 }

}

	



