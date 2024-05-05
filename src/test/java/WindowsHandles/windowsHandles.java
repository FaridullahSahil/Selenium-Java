package WindowsHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import mainClass.UtilityClass;

public class windowsHandles extends UtilityClass{

	public static void main(String[] args) throws InterruptedException {
		
	driver=setBrowser("Chrome");
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.cssSelector(".blinkingText")).click();
	//we will user windowHandle and windows iterator to control current window
	
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> windowsiterator = windows.iterator();
	String parentwin = windowsiterator.next();
	
	System.out.println("parent windows title "+parentwin);
	System.out.println("parent windows id "+parentwin);
	
	String child = windowsiterator.next();
	driver.switchTo().window(child);
	System.out.println("child windows title "+child);
	System.out.println("child window id "+child);
	
	String emailtext = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split("with")[0];
//	System.out.println(emailtext);
//	String[] em = emailtext.split("at");
//	String string=em[1];
//	String []index1=string.split("with");
//	String email=(index1[0].trim());
	
	driver.close();
	
	driver.switchTo().window(parentwin);
	driver.findElement(By.id("username")).sendKeys(emailtext);
	
	driver.quit();
	//Thread.sleep(2000);
	
	}

}
