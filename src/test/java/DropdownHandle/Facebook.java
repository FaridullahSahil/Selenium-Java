package DropdownHandle;

import mainClass.UtilityClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Facebook extends UtilityClass{
public static void main(String[] args) {
	

			
			driver=setBrowser("chrome");

			driver.get("https://www.facebook.com");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sahil");

			driver.findElement(By.name("lastname")).sendKeys("Farid");

			driver.findElement(By.name("reg_email__")).sendKeys("1234567890");

			driver.findElement(By.xpath("//div[@id='password_field']/div//following-sibling::input")).sendKeys("khan123");
		
			String text1=driver.findElements(By.className("_58mt")).get(2).getText();
			System.out.println(text1);
			List<WebElement> gender=driver.findElements(By.className("_58mt"));

			System.out.println(gender.size());

			for(int i=0; i<gender.size(); i++) {
			String text=gender.get(i).getText();
			System.out.println(text);

			if(text.equalsIgnoreCase("Male")) {
				gender.get(i).click();
			break;

			}
			}
			WebElement month = driver.findElement(By.cssSelector("#month"));
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			WebElement year = driver.findElement(By.id("year"));
			
			Select month1= new Select(month);
			month1.selectByVisibleText("Sep");
			
			Select day1= new Select(day);
			day1.selectByIndex(25);
			
			Select year1= new Select(year);
			year1.selectByValue("1988");
			
			
			}
	}
