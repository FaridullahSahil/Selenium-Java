package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class RangeSlide extends UtilityClass {

	public static void main(String[] args) {
		driver=setBrowser("chrome");
		driver.get("https://rangeslider.js.org/");
		WebElement source = driver.findElement(By.xpath("//div[@class='rangeslider rangeslider--horizontal']"));
		
		
	}

}
