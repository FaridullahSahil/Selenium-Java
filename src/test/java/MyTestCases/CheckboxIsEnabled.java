package MyTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class CheckboxIsEnabled extends UtilityClass{
	
		public static void main(String[] args) {
			
			driver=setBrowser("Chrome");
			driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
			driver.manage().window().maximize(); 
//			WebElement java=driver.findElement(By.xpath("//input[@value='JAVA']"));
//			System.out.println(java.isDisplayed());	
			WebElement visibleText=driver.findElement(By.xpath("//*[text()='Tuesday, August 9, 2016']"));
			boolean displayed= visibleText.isDisplayed();
			System.out.println("Date is Visible  "+displayed);
			WebElement sing=driver.findElement(By.id("sing"));
			boolean enabled=sing.isEnabled();
			System.out.println(enabled);
			boolean selected=sing.isSelected();
			System.out.println(selected);
			if(selected==false) {
				sing.click();
				System.out.println("After click   "+sing.isSelected());
			}
		}
		}
