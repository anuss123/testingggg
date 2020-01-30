package Hdc2DemoJan2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver99 {

	public static WebDriver getdriver(String BRW) {
		// TODO Auto-generated method stub

		if(BRW.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		    return new ChromeDriver();
		}
	   
		else if(BRW.equals("IEEE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
		    return new InternetExplorerDriver();
		}
	  
		else if(BRW.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		    return new FirefoxDriver();
		}
	
		else
			return null;
	
	
	}
	
	

}
