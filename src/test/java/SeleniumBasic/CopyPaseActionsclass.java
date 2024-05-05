package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mainClass.UtilityClass;

public class CopyPaseActionsclass extends UtilityClass{

	public static void main(String[] args) {
		
		driver=setBrowser("Chrome");
		driver.get("https://demoqa.com/text-box");
		
		WebElement currentaddress = driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("5087 Dalmeny ct, Columbus, Ohio");
		currentaddress.sendKeys(Keys.CONTROL+"A"+Keys.CONTROL);
		currentaddress.sendKeys(Keys.CONTROL+"C"+Keys.CONTROL);
		currentaddress.sendKeys(Keys.TAB);
		
		
	//	act.sendKeys("5087 dalmeny ct").
		//Actions act=new Actions(driver);
		
	WebElement permanentaddress = driver.findElement(By.id("permanentAddress"));
	permanentaddress.sendKeys(Keys.CONTROL+"V"+Keys.CONTROL);
		//permanentaddress.sendKeys("5087 Dalmeny ct, Columbus, Ohio");
		
		//act.
	}

}
