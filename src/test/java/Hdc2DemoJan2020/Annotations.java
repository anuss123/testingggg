package Hdc2DemoJan2020;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
  @Test(dataProvider = "credentials")
  public void f(String un , String ps) {
      System.out.println(un);
      System.out.println(ps);
  }

@DataProvider
public Object[][] credentials() {
	return new Object[][] {
		new Object[] {"Demo" , "T1"},
		new Object[] {"Demo2" , "T2"}
	};
	
}

}