package Hdc2DemoJan2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchTours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver = MyDriver99.getdriver("CRM");
		driver.get("http://demowebshop.tricentis.com");
	    // WebDriverWait Wait = new WebDriverWait(driver,60);
	    //Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	   /* List<WebElement> T_lnks = driver.findElements(By.tagName("a"));
	    int N_lnks = T_lnks.size();
	    System.out.println("Available links" +N_lnks);
	    for(int i=0; i<=N_lnks;i++)
	    { 
	       String L_text = T_lnks.get(i).getText();
	       System.out.println(i+ "th link is " +L_text);
	    }
	    */
	     String AT = driver.getTitle();
	     String ET = "Demo" ;
	     if (AT.equals(ET))
	     {
	    	 System.out.println("Match");
	    	 
	     }
	
	     else
	     {
	    	 System.out.println("Not Match");
	     }
	     driver.close();
	}
	
              
}
	
	
	


