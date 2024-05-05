package mainClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityClass {
	public static WebDriver driver;
	
	public static WebDriver setBrowser(String browsername) {
		
	if(browsername.equalsIgnoreCase("chrome"))	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("starts-maximized");
		driver=new ChromeDriver(option);
	}
	else if(browsername.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else if(browsername.equalsIgnoreCase("fr")) {
		driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("headless")) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("headless");
		driver= new ChromeDriver(option);
	}
	else {
		System.out.println("Invalid Browser !!");
	}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	return driver;
}
	public static void takescreenShot(WebDriver driver, String fileName) throws IOException{
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:\\Users\\Sahil\\Desktop\\images\\"+fileName+".png"));
	}
}