package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser 
{
	static WebDriver driver;
	public static WebDriver openBrowser(String browserName, String URL)
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
}
