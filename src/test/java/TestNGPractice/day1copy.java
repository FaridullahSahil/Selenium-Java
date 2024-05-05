package TestNGPractice;

import org.testng.annotations.Test;

public class day1copy {
@Test(priority=1)
public void openbrowser() {
	System.out.println("Hi I AM Open browser method");
}

@Test(priority=2)
public void actionitems() {
	System.out.println("I am action items method");
}
@Test(priority=3)
public void checkingvalues() {
	System.out.println("I am checking values");
}
@Test(priority=4)
public void closebrowser() {
	System.out.println("I am closebrowser method");
}

}
