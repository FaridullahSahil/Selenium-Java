package SeleniumBasic;

import java.awt.Menu;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import mainClass.UtilityClass;

public class act2 extends UtilityClass {
public static void main(String[] args) throws InterruptedException {
	driver=setBrowser("chrome");
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(driver);
	act.doubleClick(dclick).perform();
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	WebElement rclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions act1=new Actions(driver);
	act.contextClick(rclick).perform();
	Thread.sleep(2000);

	List<WebElement> dropmenu = driver.findElements(By.cssSelector("ul[class='context-menu-list context-menu-root'] li span"));
	System.out.println(dropmenu.size());
	for(int i=0;i<dropmenu.size();i++) {
		String text = dropmenu.get(i).getText();
		System.out.println(text);
		}
		

	Thread.sleep(2000);
	driver.quit();
}
}
