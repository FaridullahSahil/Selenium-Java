package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mainClass.UtilityClass;

public class copypaste2 extends UtilityClass{

	public static void main(String[] args) throws InterruptedException {
		driver=setBrowser("Chrome");
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Faridullah Sahil");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("faridullah_sahil@yahoo.com");
		WebElement cadress = driver.findElement(By.id("currentAddress"));
		cadress.sendKeys("5087 dalmeny ct");
		cadress.sendKeys(Keys.CONTROL+"A"+Keys.CONTROL);
		cadress.sendKeys(Keys.CONTROL+"C"+Keys.CONTROL);
		cadress.sendKeys(Keys.TAB);
		WebElement padress = driver.findElement(By.id("permanentAddress"));
		padress.sendKeys(Keys.CONTROL+"V"+Keys.CONTROL);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
