package ebay.appium;

import org.testng.annotations.AfterMethod;

import uicomponents.PurchaseProduct;

public class Purchaseproduct extends LoginValidation{
	
public void addtocart()
{
    
    	// to click search field
    	 driver.findElement(PurchaseProduct.Searchicon).click();
        //to enter item in search field
    	 driver.findElement(PurchaseProduct.Searchfield).click();
        // to purchase product
    	 driver.findElement(PurchaseProduct.product).sendKeys("earphone");
        //to click buyitnow
    	 driver.findElement(PurchaseProduct.Buyitnow).click();
        
        
    }
@AfterMethod

public void tearDown() throws Exception {
 
driver.quit();
 
}
}
