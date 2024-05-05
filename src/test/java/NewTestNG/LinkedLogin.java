package NewTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mainClass.UtilityClass;

public class LinkedLogin extends UtilityClass {

	
	@Test(priority=1,dataProvider="MyTestData")
	@Parameters({"Email","Pass"})
	public void UsernameAndPassword(String email, String pass) throws InterruptedException {
		driver=setBrowser("chrome");
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.id("session_key")).sendKeys(email);
		driver.findElement(By.id("session_password")).sendKeys(pass);
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@DataProvider(name="MyTestData")
	public Object[][] data(){
		Object[][] logincred=new Object[2][2];
		logincred[0][0]="Khan@gmail.com";
		logincred[0][1]="khan123";
		logincred[1][0]="Omed@gmail.com";
		logincred[1][1]="cat123";
		return logincred;
	}
	
	
}
