package Hdc2DemoJan2020;

import org.testng.annotations.Test;

public class TestNG2 {

	@Test(priority=1)
	public void launch()
	{
	  System.out.println("1");
	}
	@Test(priority=2)
	public void register()
	{
	  System.out.println("2");
	}
	
}
