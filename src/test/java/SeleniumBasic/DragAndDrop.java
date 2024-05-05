package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mainClass.UtilityClass;

public class DragAndDrop extends UtilityClass{
public static void main(String[] args) throws InterruptedException {
	driver=setBrowser("chrome");
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	//driver.findElement(By.id("draggable"));//--By ID
	WebElement source = driver.findElement(By.cssSelector("div#draggable"));//By CSS
	
	//WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));//By XPath
	WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act= new Actions(driver);
	//act.dragAndDrop(source, dest).perform();
	act.clickAndHold(source).moveToElement(dest).release().build().perform();
	Thread.sleep(3000);
	driver.quit();
}
}
