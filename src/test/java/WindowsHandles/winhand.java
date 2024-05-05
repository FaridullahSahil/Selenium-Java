package WindowsHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import mainClass.UtilityClass;

public class winhand extends UtilityClass{

	public static void main(String[] args) {
		driver=setBrowser("chrome");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
	    //driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> winiterator=windows.iterator();
		String parentwin=winiterator.next();
		System.out.println("parent window title "+parentwin);
		System.out.println();
		
		String child=winiterator.next();
		driver.switchTo().window(child);
		
		
		String emailtext = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		System.out.println(emailtext);
		String [] em=emailtext.split("at");
		String string=em[1];
		String[]index1=string.split("with");
		String email=index1[0].trim();
		System.out.println(email);
		driver.switchTo().window(parentwin);
		
		driver.findElement(By.id("username")).sendKeys("Faridullah");
}
}