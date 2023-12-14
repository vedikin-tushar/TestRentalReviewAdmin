package front_test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import testUtility.Screenshot;
import testUtility.StaticBrowser;


public class Base_Class 
{	
	static WebDriver driver;
	public static ExtentReports report;
	public static ExtentHtmlReporter extent;
	public static ExtentTest logger;
	@BeforeTest
	public void beforeTest()
	{
		report = new ExtentReports();
		extent = new ExtentHtmlReporter("test-output"+File.separator+"Report"+File.separator+"Rental-Review"+System.currentTimeMillis()+".html");
		report.attachReporter(extent);
	}
//	@Parameters({"browser"})
//	@BeforeTest
//	public void beforeTest(String browser) throws InterruptedException
//	{
//		WebDriver driver = StaticBrowser.openBrowser(browser, "https://sonline.us/rental-review/");
//		this.driver = driver;
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//	}
	
	
	@AfterMethod
	public void takeScreenshotTest(ITestResult result) throws IOException, InterruptedException
	{		
		Thread.sleep(2000);
		
		if (result.getStatus()==ITestResult.FAILURE)
		{
			String path = Screenshot.capturePageScreenshot(driver); 
			
			logger.fail("Test case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		}
		
		report.flush();
	}
}
