package TestNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNGClass {
  @Test(groups= {"demo"})
  public void myfirstTest() {
	  System.out.println("I am test first");
  }
  @Test
  public void my2ndtest() {
	  System.out.println("I am test 2nd");
  }
  @AfterTest
  public void aftertest() {
	  System.out.println("Close Browser");
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("Set environment");
	  
  }
}
