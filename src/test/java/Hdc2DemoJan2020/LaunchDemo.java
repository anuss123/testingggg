package Hdc2DemoJan2020;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    Dimension d = new Dimension(300,600);
	    driver.manage().window().setSize(d);
	    Thread.sleep(5000);
	    Point p = new Point(300,200);
	    driver.manage().window().setPosition(p);
	    //driver.close();
	    String AT = driver.getTitle();
	    String ET = " Google";
	    if(AT.equals(ET))
	    {
	          System.out.println("Available");
	    }
	    else
	    {
	    
	    	System.out.println("Not Available");
	    }
	    
	    }
	   
	}
	

