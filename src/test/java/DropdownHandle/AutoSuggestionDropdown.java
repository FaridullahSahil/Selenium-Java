package DropdownHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class AutoSuggestionDropdown extends UtilityClass{

	public static void main(String[] args) throws InterruptedException {
		driver=setBrowser("chrome");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Time in ");
		//Thread.sleep(2000);
		
		List<WebElement> listOfElements = driver.findElements(By.cssSelector("ul[jsname='bw4e9b'] li"));
		System.out.println(listOfElements.size());
		
		for(int i=0;i<listOfElements.size();i++) {
			String text = listOfElements.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("tIME In aUSTRALIA")) {
				listOfElements.get(i).click();
				break;
			}
		}
		String text = driver.findElement(By.cssSelector("div.gsrt.vk_bk.FzvWSb.YwPhnf")).getText();
		System.out.println("Time in Australia  "+text);
		Thread.sleep(2000);
		//driver.quit();
		
	}

}
