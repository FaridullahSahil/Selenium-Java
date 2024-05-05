package NewTestNG;

import org.testng.annotations.Test;

public class myNewClass {
	@Test(priority=3)
	public void mycarloanWeblogin() {
		
		System.out.println("Web Loan Login");
		
	}
	@Test(priority=1)
	public void mycarloanMobilelogin() {
		System.out.println("Mobile Loan Login");
		
	}
	@Test(priority=2)
	public void javaclass() {
		System.out.println("Java Class");
	}
}
