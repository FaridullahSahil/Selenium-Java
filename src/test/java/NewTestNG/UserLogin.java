package NewTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserLogin {

	@Test(priority=1)
		public void UsernameAndPassword() {
		//System.out.println(10/0);
		System.out.println("User Name and Password");
	}
	 
	@Test(priority=2,dependsOnMethods="UsernameAndPassword")
	public void UserOnDashBoard() {
		System.out.println("User On Dashboard");
	}
	
	@Test(priority=3,dependsOnMethods="UserOnDashBoard")
	public void UserselectItems() {
		System.out.println("User added itmes to cart");
	}
	
	@Test(priority=4,dependsOnMethods="UserselectItems")
	public void UserLogout() {
		System.out.println("User clicked Logout");
	}
}
