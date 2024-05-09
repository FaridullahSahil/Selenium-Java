package safelite;

import org.openqa.selenium.By;

import mainClass.UtilityClass;

public class zipcode extends UtilityClass{

	public static void main(String[] args) throws InterruptedException {
		driver=setBrowser("Chrome");
		driver.get("https://fixmyglass.safelite.com/FixMyGlass/ServiceDetails.aspx");
		String title = driver.getTitle();
		System.out.println(title);
		String actualtitle="Welcome - Safelite AutoGlass®";
		if(title.equalsIgnoreCase(actualtitle)) 
			System.out.println("Title matched");
		
		else 
			System.out.println("Title not matched");

		driver.findElement(By.id("txtZip")).sendKeys("43220");
		driver.findElement(By.id("zipSubmit")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
