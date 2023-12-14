package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot 
{
	public static String capturePageScreenshot(WebDriver driver) throws IOException
	{
		//"C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\
		
		String path = System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshots"+File.separator+"Rental-Review"+System.currentTimeMillis()+".png";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileHandler.copy(source, dest);
		return path;
	}
}
