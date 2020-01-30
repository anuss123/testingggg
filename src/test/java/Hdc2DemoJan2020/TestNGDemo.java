package Hdc2DemoJan2020;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo {
  @Test
  @Parameters({"P1", "P2"})
  public void f1(String P1 , String P2) {
  System.out.println("f1");
  System.out.println("first " +P1);
  System.out.println("second " +P2);
  
  }

  @Test
  @Parameters({"P1", "P2"})
  public void f3(String P1 , String P2) {
  System.out.println("f3");
  System.out.println("first " +P1);
  System.out.println("second " +P2);
  
  }

  @Test
  public void f2() {
  System.out.println("f2");
  }

}

