package Hdc2DemoJan2020;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = MyDriver99.getdriver("CRM");
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//label[text() ='Male']
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("TestFN");
		//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("TestFN");
		driver.findElement(By.id("LastName")).sendKeys("TestLN");
		driver.findElement(By.id("Password")).sendKeys("test123");
		driver.findElement(By.id("Email")).sendKeys("test00@test.com");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
		driver.findElement(By.id("register-button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.close();
	}

}
