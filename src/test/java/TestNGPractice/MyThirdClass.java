package TestNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyThirdClass {
	 @Test(groups={"demo"})
	  public void myfirstTest() {
		  System.out.println("I am test first");
	  }
	 @Test
	 public void secondtest() {
		 System.out.println("I am 2nd test");
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
