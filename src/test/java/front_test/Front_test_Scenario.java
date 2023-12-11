package front_test;

import java.awt.AWTException;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Front_test_Scenario 
{
	@Test(priority=0)

	public void VerifyRegistrationflowPositiveflow() throws InterruptedException, AWTException	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(6000);
		
//////		driver.get("https://sonline.us/rental-review/");
		driver.get("https://sonline.us/rental-review/front-dev/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		
		String Expected_URL_1 = "https://sonline.us/rental-review/front-dev/#/home";
//////		String Expected_URL_1 = "https://sonline.us/rental-review/#/home";
		
		String Actual_URL_1 = driver.getCurrentUrl();
		System.out.println(Actual_URL_1);
		
		AssertJUnit.assertEquals(Expected_URL_1,Actual_URL_1);
		
		Thread.sleep(3000);
		
////	[Register Flow]
		
		driver.findElement(By.xpath("//*[@id=\"not_login\"]/a[2]/b")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputNameSurname")).sendKeys("AutomationUser");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputMail")).sendKeys("sagarpatel41097@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputPassword")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputPasswordConfirm")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		WebElement register_role = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[5]/select"));
		Select rr = new Select(register_role); 
		Thread.sleep(2000);
		rr.selectByVisibleText("Renter");
			
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputPhone")).sendKeys("4165550121");
		
		Thread.sleep(5000);
		
		WebElement FA = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsFA = (JavascriptExecutor)driver;
		jsFA.executeScript("arguments[0].click();",FA);
		
		Thread.sleep(8000);
		
		driver.quit();
	}
		
	
	
	
	
	
	
	
	
	
	
		
		@Test (priority=1)
////	[Goint to admin approval]
		
		public void VerifyAdminApprovalflowPositiveflow() throws InterruptedException, AWTException	
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			Thread.sleep(6000);
			
		Thread.sleep(3000);
		
		WebDriverManager.chromedriver().setup();
		
		Thread.sleep(6000);
		
//////		driver.get("https://sonline.us/rental-review/admin/");
		driver.get("https://sonline.us/rental-review/admin-dev/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		
		String Admin_Expected_URL_1 = "https://sonline.us/rental-review/admin-dev/#/login";
//////		String Expected_URL_1 = "https://sonline.us/rental-review/admin/#/login";
		
		String Admin_Actual_URL_1 = driver.getCurrentUrl();
		System.out.println(Admin_Actual_URL_1);
		
		AssertJUnit.assertEquals(Admin_Expected_URL_1,Admin_Actual_URL_1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtUserName")).sendKeys("janvi@sonline.us");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("Janvi");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(10000);	
		
////	[User Page]	[Search]
		
		driver.findElement(By.xpath("//*[@id=\"user\"]/a/label")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_2 = "https://sonline.us/rental-review/admin-dev/#/user-list";
//////		String Expected_URL_2 = "https://sonline.us/rental-review/admin/#/user-list";
		
		String Actual_URL_2 = driver.getCurrentUrl();
		System.out.println(Actual_URL_2);
		
		AssertJUnit.assertEquals(Expected_URL_2,Actual_URL_2);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("AutomationUser");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"user_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset[1]/div[5]/div[2]/label/span")).click();
		
		Thread.sleep(3000);
		
		WebElement Authenticity = driver.findElement(By.id("authenticity"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDropBy(Authenticity, 650, 360).perform();
		
		Thread.sleep(3000);
		
		WebElement Admin_B = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsAdmin_B = (JavascriptExecutor)driver;
		
		jsAdmin_B.executeScript("arguments[0].click();",Admin_B);
				
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("AutomationUser");
		
		Thread.sleep(3000);
		
		String Expected_Status = "Yes";
		
		WebElement user_status = driver.findElement(By.xpath("//*[@id=\"user_list_table\"]/tbody/tr/td[5]"));
		String Actual_Status = user_status.getText();
		
		AssertJUnit.assertEquals(Expected_Status,Actual_Status);
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		@Test(priority=2)
		
	public void VerifySigninflowPositiveflow() throws InterruptedException, AWTException	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
			
		Thread.sleep(6000);
			
//////		driver.get("https://sonline.us/rental-review/");
		driver.get("https://sonline.us/rental-review/front-dev/");
		driver.manage().window().maximize();
			
		Thread.sleep(3000);
			
		driver.navigate().refresh();
			
		Thread.sleep(6000);
			
		String Expected_URL_1 = "https://sonline.us/rental-review/front-dev/#/home";
//////		String Expected_URL_1 = "https://sonline.us/rental-review/#/home";
			
		String Actual_URL_1 = driver.getCurrentUrl();
		System.out.println(Actual_URL_1);
			
		AssertJUnit.assertEquals(Expected_URL_1,Actual_URL_1);
			
		Thread.sleep(3000);
			
////	[Sign In]
		
		driver.findElement(By.xpath("//*[@id=\"not_login\"]/a[1]/b")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sagarpatel41097@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		WebElement FB = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsFB = (JavascriptExecutor)driver;
		jsFB.executeScript("arguments[0].click();",FB);
		
		Thread.sleep(6000);
		
		
		
		
		
		
		
		
		
		
		
////	[Submit Review]
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/ul/li[2]/a/span")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Automatic_House");
		
		Thread.sleep(3000);
		
		WebElement Property_type = driver.findElement(By.xpath("//*[@id=\"property-submition\"]/div[3]/div[2]/select"));
		Select pt = new Select(Property_type); 
		Thread.sleep(2000);
		pt.selectByVisibleText(" House ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("270");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Sheldon Ave, Etobicoke");
		
		Thread.sleep(5000);
		
		WebElement State = driver.findElement(By.xpath("//*[@id=\"property-submition\"]/div[7]/div[2]/select"));
		Select st = new Select(State); 
		Thread.sleep(2000);
		st.selectByVisibleText("Canada-Ontario");
		
		Thread.sleep(3000);
		
		WebElement City = driver.findElement(By.xpath("//*[@id=\"property-submition\"]/div[8]/div[2]/select"));
		Select ct = new Select(City); 
		Thread.sleep(2000);
		ct.selectByVisibleText(" Toronto ");
		
		Thread.sleep(3000);
		
		WebElement Area = driver.findElement(By.xpath("//*[@id=\"property-submition\"]/div[9]/div[2]/select"));
		Select area = new Select(Area); 
		Thread.sleep(2000);
		area.selectByVisibleText(" Alderwood ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("zip_code")).sendKeys("M8W 4M1");
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSF = (JavascriptExecutor)driver;
		
		JSF.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[1]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[2]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[3]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[4]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[5]/div[3]/ngb-rating/span[4]")).click();
		
		Thread.sleep(3000);
		
		try
		{
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[6]/div[3]/ngb-rating/span[6]")).click();
			System.out.println("Element exists");
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("Element not Exists");
		}
		
		
//		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[6]/div[3]/ngb-rating/span[6]")).click();
//		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[7]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[8]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[9]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[4]/div/div[10]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("message")).sendKeys("Sheldon Towers offers an excellent balance between price and value. It's priced competitively for its amenities, location, and other key features. Compared to the median price per bedroom in the area, this property is less than nearby rentals, so residents can expect great value without many compromises on their desired standard of living.");
		
		Thread.sleep(3000);
		
//		String A = "C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (1).webp";
//		String B = "C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (2).webp";
//		String C = "C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (3).webp";
//		String D = "C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (4).webp";
//		String E = "C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (5).webp";
//		String F = "C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960.webp";
//		
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(A + B + C + D + E + F);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (3).png");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Submit Review ']")).click();
		
		Thread.sleep(6000);
		
		String Expected_msg = "Your review submitted successfully. Your review has been approved.";
		
		WebElement get_Actual_msg = driver.findElement(By.xpath("(//div[text()='Your review submitted successfully. Your review has been approved.'])[1]"));
		String Actual_msg = get_Actual_msg.getText();
			
		AssertJUnit.assertEquals(Expected_msg,Actual_msg);
			
			
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////	[Home Page]
 
		driver.findElement(By.xpath("//*[@id=\"main-menu1\"]/li[1]/a")).click();
		
		Thread.sleep(3000);
		
		WebElement Select_State = driver.findElement(By.xpath("/html/body/app-root/app-home/html/body/div/div/div/div[1]/section/div/div/div/div[2]/form/div/div[2]/div/select"));
		Select ss = new Select(Select_State); 
		Thread.sleep(2000);
		ss.selectByVisibleText(" Canada-Ontario ");
		
		Thread.sleep(3000);
		
		WebElement Select_city = driver.findElement(By.xpath("/html/body/app-root/app-home/html/body/div/div/div/div[1]/section/div/div/div/div[2]/form/div/div[3]/div/select"));
		Select sc = new Select(Select_city); 
		Thread.sleep(2000);
		sc.selectByVisibleText(" Toronto ");
		
		Thread.sleep(3000);
		
		WebElement Select_area = driver.findElement(By.xpath("/html/body/app-root/app-home/html/body/div/div/div/div[1]/section/div/div/div/div[2]/form/div/div[4]/div/select"));
		Select sa = new Select(Select_area); 
		Thread.sleep(2000);
		sa.selectByVisibleText(" Alderwood ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/html/body/div/div/div/div[1]/section/div/div/div/div[2]/form/div/div[6]/a")).click();
		
		Thread.sleep(3000);
		
		String Expected_Property = "Automatic_House";
		
		WebElement get_Actual_Property = driver.findElement(By.xpath("//h3[text()='Automatic_House']"));
		String Actual_Property = get_Actual_Property.getText();
			
		AssertJUnit.assertEquals(Expected_Property,Actual_Property);
			
		Thread.sleep(3000);
		
		String Expected_Address = "270, Sheldon Ave, Etobicoke, Alderwood, Toronto, Canada-Ontario";
		
		WebElement get_Actual_Address = driver.findElement(By.xpath("//p[text()='270, Sheldon Ave, Etobicoke, Alderwood, Toronto, Canada-Ontario ']"));
		String Actual_Address = get_Actual_Address.getText();
			
		AssertJUnit.assertEquals(Expected_Address,Actual_Address);
			
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text()='Automatic_House']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSProperty_detail = (JavascriptExecutor)driver;
		
		JSProperty_detail.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		String Expected_User = "AutomationUser";
		
		WebElement get_Actual_User = driver.findElement(By.xpath("//h4[text()='AutomationUser']"));
		String Actual_User = get_Actual_User.getText();
			
		AssertJUnit.assertEquals(Expected_User,Actual_User);
		
		Thread.sleep(3000);
		
		String Expected_Written_review = "Sheldon Towers offers an excellent balance between price and value. It's priced competitively for its amenities, location, and other key features. Compared to the median price per bedroom in the area, this property is less than nearby rentals, so residents can expect great value without many compromises on their desired standard of living.";
		
		WebElement get_Actual_writtenreview = driver.findElement(By.xpath("//*[@id=\"listing_carousel_17\"]/div/div[1]/div[2]/p"));
		String Actual_Written_Review = get_Actual_writtenreview.getText();
			
		AssertJUnit.assertEquals(Expected_Written_review,Actual_Written_Review);
			
		Thread.sleep(3000);
		
		boolean isDisplayed = driver.findElement(By.xpath("//button[text()=' Submit Report ']")).isDisplayed();
		
		if (isDisplayed) 
		{
			System.out.println("Submit button is Displayed");	
		}
		else
		{
			System.out.println("Submit button is not Displayed");
		}
		
		boolean ReportisDisplayed = driver.findElement(By.xpath("//button[text()=' Report ']")).isDisplayed();
		
		if (ReportisDisplayed) 
		{
			System.out.println("Report button is Displayed");	
		}
		else
		{
			System.out.println("Report button is not Displayed");
		}
			
		Thread.sleep(3000);
		
		JavascriptExecutor JSForDashboard = (JavascriptExecutor)driver;
		
		JSForDashboard.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
////	[Update Review Page]		
		
		driver.findElement(By.xpath("//*[@id=\"already_login\"]/span/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"already_login\"]/span/div/a[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"user_douments_table\"]/tbody/tr/td[5]/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[1]/div[3]/ngb-rating/span[10]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[2]/div[3]/ngb-rating/span[10]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[3]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[4]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[5]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[6]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[7]/div[3]/ngb-rating/span[4]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[8]/div[3]/ngb-rating/span[4]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[9]/div[3]/ngb-rating/span[6]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_main\"]/div/div/div/div[10]/div[3]/ngb-rating/span[8]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("message")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("message")).sendKeys("_Sheldon Towers offers an excellent balance between price and value. It's priced competitively for its amenities, location, and other key features. Compared to the median price per bedroom in the area, this property is less than nearby rentals, so residents can expect great value without many compromises on their desired standard of living.");
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSForUpdateReview = (JavascriptExecutor)driver;
		
		JSForUpdateReview.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\1280x960 (5) (1).png");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
		String Expected_AfterUpdatemsg = "Your review submitted successfully. Your review has been approved.";
		
		WebElement get_Actual_AfterUpdatemsg = driver.findElement(By.id("alert-success_review"));
		String Actual_AfterUpdatemsg = get_Actual_AfterUpdatemsg.getText();
			
		AssertJUnit.assertEquals(Expected_AfterUpdatemsg,Actual_AfterUpdatemsg);
					
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
////	[Search property in search page]		
		
		driver.findElement(By.xpath("//*[@id=\"main-menu1\"]/li[2]/a")).click();
		
		Thread.sleep(6000);
		
		WebElement Select_State_SearchPG = driver.findElement(By.xpath("//*[@id=\"search-banner\"]/div[1]/div[2]/div/div/select"));
		Select sssp= new Select(Select_State_SearchPG); 
		Thread.sleep(2000);
		sssp.selectByVisibleText(" Canada-Ontario ");
		
		Thread.sleep(3000);
		
		WebElement Select_City_SearchPG = driver.findElement(By.xpath("//*[@id=\"search-banner\"]/div[1]/div[3]/div/div/select"));
		Select scsp = new Select(Select_City_SearchPG); 
		Thread.sleep(2000);
		scsp.selectByVisibleText(" Toronto ");
		
		Thread.sleep(3000);
				
		WebElement Select_PType_SearchPG = driver.findElement(By.xpath("//*[@id=\"search-banner\"]/div[2]/div[1]/div/div/select"));
		Select spsp = new Select(Select_PType_SearchPG); 
		Thread.sleep(2000);
		spsp.selectByVisibleText(" Alderwood ");
		
		Thread.sleep(3000);
		
		WebElement Select_Area_SearchPG = driver.findElement(By.xpath("//*[@id=\"search-banner\"]/div[2]/div[2]/div/div/select"));
		Select sasp = new Select(Select_Area_SearchPG); 
		Thread.sleep(2000);
		sasp.selectByVisibleText(" House ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		Thread.sleep(6000);
		
		String Expected_Property_1 = "Automatic_House";
		
		WebElement get_Actual_Property_1 = driver.findElement(By.xpath("//h3[text()='Automatic_House']"));
		String Actual_Property_1 = get_Actual_Property_1.getText();
			
		AssertJUnit.assertEquals(Expected_Property_1,Actual_Property_1);
			
		Thread.sleep(3000);
		
		String Expected_Address_1 = "270, Sheldon Ave, Etobicoke, Alderwood, Toronto, Canada-Ontario";
		
		WebElement get_Actual_Address_1 = driver.findElement(By.xpath("//p[text()='270, Sheldon Ave, Etobicoke, Alderwood, Toronto, Canada-Ontario ']"));
		String Actual_Address_1 = get_Actual_Address_1.getText();
			
		AssertJUnit.assertEquals(Expected_Address_1,Actual_Address_1);
			
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text()='Automatic_House']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSProperty_detail_1 = (JavascriptExecutor)driver;
		
		JSProperty_detail_1.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		String Expected_User_1 = "AutomationUser";
		
		WebElement get_Actual_User_1 = driver.findElement(By.xpath("//h4[text()='AutomationUser']"));
		String Actual_User_1 = get_Actual_User_1.getText();
			
		AssertJUnit.assertEquals(Expected_User_1,Actual_User_1);
		
		Thread.sleep(3000);
		
		String Expected_Written_review_1 = "_Sheldon Towers offers an excellent balance between price and value. It's priced competitively for its amenities, location, and other key features. Compared to the median price per bedroom in the area, this property is less than nearby rentals, so residents can expect great value without many compromises on their desired standard of living.";
		
		WebElement get_Actual_writtenreview_1 = driver.findElement(By.xpath("//*[@id=\"listing_carousel_17\"]/div/div[1]/div[2]/p"));
		String Actual_Written_Review_1 = get_Actual_writtenreview_1.getText();
			
		AssertJUnit.assertEquals(Expected_Written_review_1,Actual_Written_Review_1);
			
		Thread.sleep(3000);
		
		boolean isDisplayed_1 = driver.findElement(By.xpath("//button[text()=' Submit Report ']")).isDisplayed();
		
		if (isDisplayed_1) 
		{
			System.out.println("Submit button is Displayed");	
		}
		else
		{
			System.out.println("Submit button is not Displayed");
		}
		
		boolean ReportisDisplayed_1 = driver.findElement(By.xpath("//button[text()=' Report ']")).isDisplayed();
		
		if (ReportisDisplayed_1) 
		{
			System.out.println("Report button is Displayed");	
		}
		else
		{
			System.out.println("Report button is not Displayed");
		}
			
		Thread.sleep(3000);
		
		JavascriptExecutor JSForDashboard_1 = (JavascriptExecutor)driver;
		
		JSForDashboard_1.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);		
		
		driver.quit();		
		
	}
		


		
		
		
		
		
		
		
		
		
		
		
		@Test(priority=3)
		
	public void VerifySignin_forgotpswd_registrationflow_blog_contact_footer_withNegativeflow() throws InterruptedException, AWTException	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
			
		Thread.sleep(6000);
			
//////		driver.get("https://sonline.us/rental-review/");
		driver.get("https://sonline.us/rental-review/front-dev/");
		driver.manage().window().maximize();
			
		Thread.sleep(3000);
			
		driver.navigate().refresh();
			
		Thread.sleep(6000);
			
		String Expected_URL_1 = "https://sonline.us/rental-review/front-dev/#/home";
//////		String Expected_URL_1 = "https://sonline.us/rental-review/#/home";
			
		String Actual_URL_1 = driver.getCurrentUrl();
		System.out.println(Actual_URL_1);
			
		AssertJUnit.assertEquals(Expected_URL_1,Actual_URL_1);
			
		Thread.sleep(3000);
			
////	[Sign In]
		
		driver.findElement(By.xpath("//*[@id=\"not_login\"]/a[1]/b")).click();
		
		Thread.sleep(3000);
		
		WebElement ForValidation = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForValidation = (JavascriptExecutor)driver;
		jsForValidation.executeScript("arguments[0].click();",ForValidation);
		
		Thread.sleep(3000);	
		
		boolean isElementDisplayed = driver.findElement(By.xpath("//*[@id=\"popup_form_login\"]/div[2]")).isDisplayed();
		AssertJUnit.assertTrue("The element is not displayed on sign in page", isElementDisplayed);
		
		WebElement get_Actual_Validation = driver.findElement(By.xpath("//*[@id=\"popup_form_login\"]/div[2]"));
		String Actual_Written_Validation = get_Actual_Validation.getText();
		System.out.println(Actual_Written_Validation);			
			
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"not_login\"]/a[1]/b")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Automationuser@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		WebElement WrongCred = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsWrongCred = (JavascriptExecutor)driver;
		jsWrongCred.executeScript("arguments[0].click();",WrongCred);
		
		Thread.sleep(3000);
		
		String Expected_Wrongcred_validation = "Invalid Email or Password.";
		
		WebElement get_Actual_Wrongcred_validation = driver.findElement(By.xpath("//div[text()='Invalid Email or Password.']"));
		String Actual_Wrongcred_validation1 = get_Actual_Wrongcred_validation.getText();
			
		AssertJUnit.assertEquals(Expected_Wrongcred_validation,Actual_Wrongcred_validation1);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
////	[Forgot password]		
		
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		
		Thread.sleep(3000);
			
		WebElement ForValidationFP = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForValidationFP = (JavascriptExecutor)driver;
		jsForValidationFP.executeScript("arguments[0].click();",ForValidationFP);
		
		String Expected_ValidationFP = "Please enter your Email address.";
		
		WebElement get_Actual_ValidationFP = driver.findElement(By.xpath("//div[text()='Please enter your Email address.']"));
		String Actual_ValidationFP = get_Actual_ValidationFP.getText();
			
		AssertJUnit.assertEquals(Expected_ValidationFP,Actual_ValidationFP);
			
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("AutomationTest@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement ForValidationFP1 = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForValidationFP1 = (JavascriptExecutor)driver;
		jsForValidationFP1.executeScript("arguments[0].click();",ForValidationFP1);
		
		Thread.sleep(3000);
		
		String Expected_ValidationFP1 = "User not found";
		
		WebElement get_Actual_ValidationFP1 = driver.findElement(By.xpath("//div[text()='User not found']"));
		String Actual_ValidationFP1 = get_Actual_ValidationFP1.getText();
			
		AssertJUnit.assertEquals(Expected_ValidationFP1,Actual_ValidationFP1);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
////	[Registration process]
		
		driver.findElement(By.xpath("//*[@id=\"not_login\"]/a[2]/b")).click();
		
		Thread.sleep(3000);
		
		WebElement ForValidationRF = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForValidationRF= (JavascriptExecutor)driver;
		jsForValidationRF.executeScript("arguments[0].click();",ForValidationRF);
		
		Thread.sleep(4000);
		
		boolean isElementDisplayedRF = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/div/div/div[2]")).isDisplayed();
		AssertJUnit.assertTrue("The element is not displayed on registration page", isElementDisplayedRF);
		
		WebElement get_Actual_ValidationRF = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/div/div/div[2]"));
		String Actual_Written_ValidationRF = get_Actual_ValidationRF.getText();
		System.out.println(Actual_Written_ValidationRF);			
			
		Thread.sleep(3000);
				
		driver.findElement(By.id("inputNameSurname")).sendKeys("AutomationUser");
		
		Thread.sleep(3000);
		
		WebElement ForValidationRF1 = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForValidationRF1= (JavascriptExecutor)driver;
		jsForValidationRF1.executeScript("arguments[0].click();",ForValidationRF1);
		
		Thread.sleep(4000);
		
		boolean isElementDisplayedRF1 = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/div/div/div[2]")).isDisplayed();
		AssertJUnit.assertTrue("The element is not displayed on registration page", isElementDisplayedRF1);
		
		WebElement get_Actual_ValidationRF1 = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/div/div/div[2]"));
		String Actual_Written_ValidationRF1 = get_Actual_ValidationRF1.getText();
		System.out.println(Actual_Written_ValidationRF1);			
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("inputMail")).sendKeys("sagarpatel41097@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement ForValidationRF2 = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForValidationRF2= (JavascriptExecutor)driver;
		jsForValidationRF2.executeScript("arguments[0].click();",ForValidationRF2);
		
		Thread.sleep(4000);
		
		boolean isElementDisplayedRF2 = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/div/div/div[2]")).isDisplayed();
		AssertJUnit.assertTrue("The element is not displayed on registration page", isElementDisplayedRF2);
		
		WebElement get_Actual_ValidationRF2 = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/div/div/div[2]"));
		String Actual_Written_ValidationRF2 = get_Actual_ValidationRF2.getText();
		System.out.println(Actual_Written_ValidationRF2);			
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
////	[Blog Page]		
		
		driver.findElement(By.xpath("//*[@id=\"main-menu1\"]/li[3]/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()= 'House']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()= 'Aparment']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()= 'Land']")).click();
		
		Thread.sleep(3000);
		
		String Expected_blogPG = "BLOG CATEGORIES";
		
		WebElement get_Actual_blogPG = driver.findElement(By.xpath("//h3[text()='Blog Categories']"));
		String Actual_blogPG = get_Actual_blogPG.getText();
			
		AssertJUnit.assertEquals(Expected_blogPG,Actual_blogPG);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
////	[Contact Page]		
		
		driver.findElement(By.xpath("//*[@id=\"not_login\"]/a[1]/b")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sagarpatel41097@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		WebElement FB = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsFB = (JavascriptExecutor)driver;
		jsFB.executeScript("arguments[0].click();",FB);
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"main-menu1\"]/li[5]/a")).click();
		
		Thread.sleep(3000);
		
		WebElement ForContactPG = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForContactPG= (JavascriptExecutor)driver;
		jsForContactPG.executeScript("arguments[0].click();",ForContactPG);
		
		Thread.sleep(4000);
		
		boolean isElementDisplayedCPG = driver.findElement(By.xpath("/html/body/app-root/app-contact/html/body/div/div[1]/div/div/div/div/div[1]/div[2]")).isDisplayed();
		AssertJUnit.assertTrue("The element is not displayed on contact page", isElementDisplayedCPG);
		
		WebElement get_Actual_ValidationCPG = driver.findElement(By.xpath("/html/body/app-root/app-contact/html/body/div/div[1]/div/div/div/div/div[1]/div[2]"));
		String Actual_Written_ValidationCPG = get_Actual_ValidationCPG.getText();
		System.out.println(Actual_Written_ValidationCPG);			
		
		Thread.sleep(4000);
		
		JavascriptExecutor JScp = (JavascriptExecutor)driver;
		
		JScp.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstname")).sendKeys("Automationuser");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("Aotumationtest@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("phone")).sendKeys("4165550122");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("message")).sendKeys("Hello");
		
		Thread.sleep(3000);
		
		WebElement ForContactPG1 = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jsForContactPG1= (JavascriptExecutor)driver;
		jsForContactPG1.executeScript("arguments[0].click();",ForContactPG1);
		
		Thread.sleep(8000);
		
		String Expected_URL_10 = "https://sonline.us/rental-review/front-dev/#/contact";
//////	String Expected_URL_10 = "https://sonline.us/rental-review/#/contact";
		
		String Actual_URL_10 = driver.getCurrentUrl();
		System.out.println(Actual_URL_10);
		
		AssertJUnit.assertEquals(Expected_URL_10,Actual_URL_10);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
////	[Footer]
		
		driver.findElement(By.xpath("//*[@id=\"main-menu1\"]/li[1]/a")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSF = (JavascriptExecutor)driver;
		
		JSF.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		
		String Expected_footer = "contact@rentalreviews365.com";
		
		WebElement get_Actual_footer = driver.findElement(By.xpath("//a[text()='contact@rentalreviews365.com']"));
		String Actual_footer = get_Actual_footer.getText();
			
		AssertJUnit.assertEquals(Expected_footer,Actual_footer);
		
		Thread.sleep(3000);
		
		String Expected_footer1 = "FAQ";
		
		WebElement get_Actual_footer1 = driver.findElement(By.xpath("//div[text()=' FAQ ']"));
		String Actual_footer1 = get_Actual_footer1.getText();
			
		AssertJUnit.assertEquals(Expected_footer1,Actual_footer1);
		
		Thread.sleep(3000);
		
		String Expected_footer2 = "Privacy policy";
		
		WebElement get_Actual_footer2 = driver.findElement(By.xpath("//div[text()=' Privacy policy ']"));
		String Actual_footer2 = get_Actual_footer2.getText();
			
		AssertJUnit.assertEquals(Expected_footer2,Actual_footer2);
		
		Thread.sleep(3000);
		
		String Expected_footer3 = "Tenant organization";
		
		WebElement get_Actual_footer3 = driver.findElement(By.xpath("//div[text()=' Tenant organization ']"));
		String Actual_footer3 = get_Actual_footer3.getText();
			
		AssertJUnit.assertEquals(Expected_footer3,Actual_footer3);
		
		Thread.sleep(3000); 
		
		String Expected_footer4 = "Community guideline";
		
		WebElement get_Actual_footer4 = driver.findElement(By.xpath("//div[text()=' Community guideline ']"));
		String Actual_footer4 = get_Actual_footer4.getText();
			
		AssertJUnit.assertEquals(Expected_footer4,Actual_footer4);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
////	[FAQ]		
		
		driver.findElement(By.xpath("//div[text()=' FAQ ']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_FAQ = "https://sonline.us/rental-review/front-dev/#/faqs";
//////	String Expected_URL_FAQ = "https://sonline.us/rental-review/#/faqs";
		
		String Actual_URL_FAQ = driver.getCurrentUrl();
		System.out.println(Actual_URL_FAQ);
		
		AssertJUnit.assertEquals(Expected_URL_FAQ,Actual_URL_FAQ);
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSF1 = (JavascriptExecutor)driver;
		
		JSF1.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
////	[Privacy policy]
		
		driver.findElement(By.xpath("//div[text()=' Privacy policy ']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_PrivacyP = "https://sonline.us/rental-review/front-dev/#/privacy-policy";
//////	String Expected_URL_PrivacyP = "https://sonline.us/rental-review/#/privacy-policy";
		
		String Actual_URL_PrivacyP = driver.getCurrentUrl();
		System.out.println(Actual_URL_PrivacyP);
		
		AssertJUnit.assertEquals(Expected_URL_PrivacyP,Actual_URL_PrivacyP);
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSF2 = (JavascriptExecutor)driver;
		
		JSF2.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
////	[Tenant Organization]		
		
		driver.findElement(By.xpath("//div[text()=' Tenant organization ']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_tenantOrg = "https://sonline.us/rental-review/front-dev/#/tenant-organization";
//////	String Expected_URL_tenantOrg = "https://sonline.us/rental-review/#/tenant-organization";
		
		String Actual_URL_tenantOrg = driver.getCurrentUrl();
		System.out.println(Actual_URL_tenantOrg);
		
		AssertJUnit.assertEquals(Expected_URL_tenantOrg,Actual_URL_tenantOrg);
		
		Thread.sleep(3000);
		
		JavascriptExecutor JSF3 = (JavascriptExecutor)driver;
		
		JSF3.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
////	[Community Guidelines]		
		
		driver.findElement(By.xpath("//div[text()=' Community guideline ']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_communityGude = "https://sonline.us/rental-review/front-dev/#/community-guidelines";
//////	String Expected_URL_communityGude = "https://sonline.us/rental-review/#/community-guidelines";
		
		String Actual_URL_communityGude = driver.getCurrentUrl();
		System.out.println(Actual_URL_communityGude);
		
		AssertJUnit.assertEquals(Expected_URL_communityGude,Actual_URL_communityGude);
		
		Thread.sleep(3000);
		
		
		driver.quit();			
				
	}
}
	
