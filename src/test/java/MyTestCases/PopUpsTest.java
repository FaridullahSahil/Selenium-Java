package MyTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class PopUpsTest extends UtilityClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver=setBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement sAlert=driver.findElement(By.xpath("//input[@name='alert']"));
		sAlert.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); 
		Thread.sleep(2000);
		
		WebElement conf=driver.findElement(By.name("confirmation"));
		conf.click();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		Thread.sleep(2000);
		
		takescreenShot(driver,"popupimage");
		
		driver.quit();
}
}
