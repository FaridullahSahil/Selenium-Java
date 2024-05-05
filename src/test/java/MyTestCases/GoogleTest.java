package MyTestCases;

import java.io.IOException;

import org.openqa.selenium.By;

import mainClass.UtilityClass;

public class GoogleTest extends UtilityClass {
	public static void main(String[] args) throws IOException {
		
		driver= setBrowser("chrome"); 
		driver.get("https://www.google.com");
		String text1=driver.findElements(By.tagName("a")).get(8).getText();
		System.out.println(text1);
		driver.findElements(By.tagName("a")).get(0).click();
		
		takescreenShot(driver, "googleimage");
		driver.close();
	}
}
