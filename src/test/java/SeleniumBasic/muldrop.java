package SeleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mainClass.UtilityClass;

public class muldrop extends UtilityClass {

	public static void main(String[] args) throws InterruptedException {
		driver=setBrowser("Chrome");
		driver.get("https://demoqa.com/select-menu");
		WebElement carsdd = driver.findElement(By.id("cars"));
//		Thread.sleep(3000);
		Select cars= new Select(carsdd);
		System.out.println(cars.isMultiple());
//		//cars.selectByIndex(0);
//		//cars.selectByValue("audi");
//		//cars.selectByVisibleText("Saab");
//		
		List<WebElement> carsel = cars.getAllSelectedOptions();
		for(int i=0;i<carsel.size();i++) {
		String text = carsel.get(i).getText();
		System.out.println(text);
		
		boolean multip=cars.isMultiple();
		System.out.println(multip);
		if(multip==true) {
			cars.selectByIndex(0);
			cars.selectByVisibleText("Audi");
		}}}}
