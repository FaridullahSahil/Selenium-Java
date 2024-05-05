package MyTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.UtilityClass;

public class IframePractice extends UtilityClass{
public static void main(String[] args) throws InterruptedException {
		
		driver= setBrowser("chrome");
		driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
//		int size= driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
		driver.switchTo().frame(0);
		//driver.switchTo().frame("moneyiframe");
//		WebElement frame=driver.findElement(By.id("moneyiframe"));
//		driver.switchTo().frame(frame);
		WebElement BSEText=driver.findElement(By.xpath("//div[@id='last_traded_time']//following-sibling::div//div[1]//a//span[1]"));
		System.out.println(BSEText.getText());
					
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='NEWS']")).click();
	//	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='HOME']")).click();
		driver.switchTo().frame(0);
		
		String text = driver.findElement(By.xpath("//div[@id='last_traded_time']//parent::div//div[2]//div[2]//a//span[1]")).getText();
		System.out.println(text);
		
		System.out.println("Program Ended ");
		driver.quit();
		
		
	}

}
