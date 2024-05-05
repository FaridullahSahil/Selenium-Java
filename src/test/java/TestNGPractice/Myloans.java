package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Myloans {
  @Test(groups= {"demo"})
  public void Testone() {
	  System.out.println("I am from TestNG Class");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Set Environment");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close Browser");
  }

}
