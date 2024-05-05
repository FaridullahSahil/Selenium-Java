package MyTestCases;

import mainClass.UtilityClass;

public class Facebook extends UtilityClass{
	public static void main(String[] args) throws InterruptedException {
		driver=setBrowser("chrome");
		String url=("https://www.google.com");
		String url1=("https://www.bbcpashto.com");
		driver.get(url);
		String title=driver.getTitle();
		String actualtitle=("Google");
		if(title.equals(actualtitle))
		System.out.println("title matched");
		else
		System.out.println("title not matched");
		if(url.equals("https://www.google.com"))
		System.out.println("URL Matched");
		else
		System.out.println("URL not Matched");
		driver.navigate().to(url1);
		Thread.sleep(4000);
		driver.navigate().to(url);
		driver.navigate().back(); 

	}

}
