package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mainClass.UtilityClass;

public class ddown extends UtilityClass{

	public static void main(String[] args) {
	driver=setBrowser("chrome");
	driver.get("https://www.facebook.com/signup");
	driver.findElement(By.name("firstname")).sendKeys("Faridullah");
	driver.findElement(By.name("lastname")).sendKeys("Sahil");
	driver.findElement(By.name("reg_email__")).sendKeys("faridullah_sahil@yahoo.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("sahil123");
	WebElement month = driver.findElement(By.id("month"));
	WebElement day = driver.findElement(By.id("day"));
	WebElement year = driver.findElement(By.id("year"));
	Select month1=new Select(month);
	month1.selectByValue("2");
	Select day1=new Select(day);
	day1.selectByValue("16");
	Select year1= new Select(year);
	year1.selectByValue("1988");
	
		
	}

}
