package DropdownHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class DateTimePicker extends UtilityClass{

	public static void main(String[] args) {
		driver=setBrowser("chrome");
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#datepicker")).click();
		
		while(!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("January 2025")){
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		List<WebElement> dlist = driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td"));
		System.out.println(dlist.size());
		
		for(int i=0;i<dlist.size();i++) {
			String text = dlist.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("29")){
				dlist.get(i).click();
				break; 
				
			}
		}

	}

}
