package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mainClass.UtilityClass;

public class ActionsClass extends UtilityClass {

	public static void main(String[] args) throws InterruptedException {
		driver=setBrowser("chrome");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement target = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement element = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act1=new Actions(driver);
			
		act1.contextClick(element).perform();
		Thread.sleep(2000);
		
		List<WebElement> menu = driver.findElements(By.cssSelector("ul[class='context-menu-list context-menu-root'] li span"));
		System.out.println(menu.size());
		System.out.println("Single Index "+menu.get(2).getText());
		
		for(int i=0;i<menu.size();i++) {
			String text = menu.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
