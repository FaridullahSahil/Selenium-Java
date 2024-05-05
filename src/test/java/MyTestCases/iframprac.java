package MyTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class iframprac extends UtilityClass{

	public static void main(String[] args) throws InterruptedException {
	driver=setBrowser("chrome");
	driver.get("https://www.rediff.com/");
	driver.switchTo().frame(0);
	WebElement bse = driver.findElement(By.xpath("//div[@id='last_traded_time']//following-sibling::div//div[1]//a//span[1]"));
	System.out.println(bse.getText());
	WebElement nse = driver.findElement(By.xpath("//div[@class='celltwo']//a//span[1]"));
	System.out.println(nse.getText());
	//Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='NEWS']")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
	
	driver.switchTo().frame(0);
	String text = driver.findElement(By.xpath("/div[@class='celltwo']//a//span[1]")).getText();
	System.out.println(text);
	driver.quit();
	
}

}
