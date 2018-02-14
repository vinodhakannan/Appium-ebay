package ebay.appium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//Llibrary for Appium drivers
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
//Library to create the path to APK
import java.io.File;
//Library used to verify if URL is malformed
import java.net.MalformedURLException;
//Library used to create URL for the Appium server
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class LaunchApp {
	
AppiumDriver<MobileElement> driver;
String Path;
@BeforeSuite
public void SetUp()

{
	  
	  Path = System.getProperty("user.dir");
	  File appDir = new File("D:\\Development_Avecto\\ebayapk");
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
	// to start Appium server
	driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
}
catch (MalformedURLException e) {
		e.printStackTrace();
	}
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}


}

	



