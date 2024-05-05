package DropdownHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mainClass.UtilityClass;

public class MultipleSelectDropdown extends UtilityClass{
public static void main(String[] args) {
	driver=setBrowser("Chrome");
	driver.get("https://demoqa.com/select-menu");
	WebElement carsDd = driver.findElement(By.id("cars"));
	
	//First method
//	Select cars= new Select(carsDd);
//	System.out.println(cars.isMultiple());
//	cars.selectByIndex(0);
//	cars.selectByValue("audi");
//	cars.selectByVisibleText("Saab");
//	List<WebElement> carsSelectOp = cars.getAllSelectedOptions();
//	for(int i=0; i<carsSelectOp.size();i++) {
//		String text = carsSelectOp.get(i).getText();
//		System.out.println(text);
	
	//2nd method
	Select cars=new Select(carsDd);
	boolean multiple=cars.isMultiple();
	System.out.println(multiple);
	if(multiple==true) {
		cars.selectByIndex(0);
		cars.selectByValue("audi");
		cars.selectByVisibleText("Saab");
	
	
	//getAllSelectedOptions
	
	List<WebElement> carsSelectOp = cars.getAllSelectedOptions();
	for(int i=0; i<carsSelectOp.size();i++) {
		String text = carsSelectOp.get(i).getText();
		System.out.println(text);
	}
}
	System.out.println("----DeSelectedOption------");
	cars.deselectByIndex(0);
	cars.deselectByValue("audi");
	List<WebElement> carsSelectOp1 = cars.getAllSelectedOptions();
	for(WebElement str:carsSelectOp1) {
	System.out.println(str.getText());
	driver.quit();
}
}

}