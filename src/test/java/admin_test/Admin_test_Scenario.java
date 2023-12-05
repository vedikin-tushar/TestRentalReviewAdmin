 package admin_test;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_test_Scenario 
{
	@Test

	public void VerifyadminPositiveflow() throws InterruptedException, AWTException	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(6000);
		
		driver.get("https://sonline.us/rental-review/admin/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(6000);
		
		String Expected_URL_1 = "https://sonline.us/rental-review/admin/#/login";
		
		String Actual_URL_1 = driver.getCurrentUrl();
		System.out.println(Actual_URL_1);
		
		AssertJUnit.assertEquals(Expected_URL_1,Actual_URL_1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtUserName")).sendKeys("janvi@sonline.us");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("Janvi");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(10000);
		
		
		
		
		
		
//		[User Page]	[Add]
		
		driver.findElement(By.xpath("//*[@id=\"user\"]/a/label")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_2 = "https://sonline.us/rental-review/admin/#/user-list";
		
		String Actual_URL_2 = driver.getCurrentUrl();
		System.out.println(Actual_URL_2);
		
		AssertJUnit.assertEquals(Expected_URL_2,Actual_URL_2);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h4/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("full_name")).sendKeys("Automation User");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("Automation.test@gmail.com");
		
		Thread.sleep(3000);
	
		WebElement user_role = driver.findElement(By.id("user_role_id"));
		Select ur = new Select(user_role); 
		Thread.sleep(2000);
		ur.selectByVisibleText(" Renter ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("mask-phone")).sendKeys("416-555-0141");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password-field")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		WebElement A = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",A);
		
		Thread.sleep(6000);
		
//		[User Page]	[Edit]

		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automation User");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"user_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("full_name")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("full_name")).sendKeys("Automation Users");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("Automation1.test@gmail.com");
		
		Thread.sleep(3000);
	
		WebElement country = driver.findElement(By.id("review_type"));
		Select coun = new Select(country); 
		Thread.sleep(2000);
		coun.selectByVisibleText(" Canada ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("mask-phone")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("mask-phone")).sendKeys("416-555-0140");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password-field")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password-field")).sendKeys("asd@231");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset[1]/div[5]/div[2]/label/span")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String Expected_Status = "No";
		
		WebElement user_status = driver.findElement(By.xpath("//*[@id=\"user_list_table\"]/tbody/tr[1]/td[5]"));
		String Actual_Status = user_status.getText();
		
		AssertJUnit.assertEquals(Expected_Status,Actual_Status);
		
		Thread.sleep(3000);
		
		
		

		
		
		
		
		
		
		
		
		
//		[Review Page]
		
		driver.findElement(By.xpath("//label[text()='Review']")).click();
		
		Thread.sleep(6000);
		
		String Expected_URL_3 = "https://sonline.us/rental-review/admin/#/review-list";
		
		String Actual_URL_3 = driver.getCurrentUrl();
		System.out.println(Actual_URL_3);
		
		AssertJUnit.assertEquals(Expected_URL_3,Actual_URL_3);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_list_table\"]/tbody/tr[1]")).click();
		
		Thread.sleep(4000);

		String Expected_URL = "https://sonline.us/rental-review/admin/#/review-edit";
		
		String Actual_URL = driver.getCurrentUrl();
		System.out.println(Actual_URL);
		
		AssertJUnit.assertEquals(Expected_URL,Actual_URL);
		
		Thread.sleep(3000);
		
		String Expected_heading = "Edit Review";
		
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		String Actual_heading = heading.getText();
		
		AssertJUnit.assertEquals(Expected_heading,Actual_heading);
		
		Thread.sleep(2000);
		
		String Expected_username = "User Name";
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[2]/label"));
		String Actual_username = username.getText();
		
		AssertJUnit.assertEquals(Expected_username,Actual_username);
		
		Thread.sleep(2000);
		
		String Expected_propertyname = "Property Name*";
		
		WebElement propertyname = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[3]/label"));
		String Actual_propertyname = propertyname.getText();
		
		AssertJUnit.assertEquals(Expected_propertyname,Actual_propertyname);
		
		Thread.sleep(2000);
		
		String Expected_IP_address = "IP address";
		
		WebElement IP_address = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[4]/label"));
		String Actual_IP_address = IP_address.getText();
		
		AssertJUnit.assertEquals(Expected_IP_address,Actual_IP_address);
		
		Thread.sleep(2000);
		
		String Expected_address = "Address";
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[5]/label"));
		String Actual_address = address.getText();
		
		AssertJUnit.assertEquals(Expected_address,Actual_address);
		
		Thread.sleep(2000);
		
		String Expected_message = "Message";
		
		WebElement message = driver.findElement(By.xpath("//*[@id=\"message\"]/label"));
		String Actual_message = message.getText();
		
		AssertJUnit.assertEquals(Expected_message,Actual_message);
		
		Thread.sleep(2000);
		
		String Expected_approved = "Approved";
		
		WebElement Approved = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[7]/label"));
		String Actual_approved = Approved.getText();
		
		AssertJUnit.assertEquals(Expected_approved,Actual_approved);
		
		Thread.sleep(2000);
		
		String Expected_active = "Active";
		
		WebElement active = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[8]/label"));
		String Actual_active = active.getText();
		
		AssertJUnit.assertEquals(Expected_active,Actual_active);
		
		Thread.sleep(2000);
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		JS.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
//		[Feedback Question Page]	[Add]
		
		driver.findElement(By.xpath("//label[text()='Feedback Question']")).click();
		
		Thread.sleep(3000);
			
		String Expected_URL_4 = "https://sonline.us/rental-review/admin/#/question-list";
		
		String Actual_URL_4 = driver.getCurrentUrl();
		System.out.println(Actual_URL_4);
		
		AssertJUnit.assertEquals(Expected_URL_4,Actual_URL_4);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"review_list_content\"]/h4/button/i")).click();
		
		Thread.sleep(3000);
		
		WebElement review_type = driver.findElement(By.id("review_type"));
		Select rt = new Select(review_type); 
		Thread.sleep(2000);
		rt.selectByVisibleText(" Communication ");
		
		Thread.sleep(3000);
		
		WebElement review_category = driver.findElement(By.id("review_category"));
		Select rc = new Select(review_category); 
		Thread.sleep(2000);
		rc.selectByVisibleText("Renter");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("review_question")).sendKeys("Automated_Were they responsive to requests and inquiries?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
//		[Feedback Question Type]	[Update]
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Were they responsive to requests and inquiries?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"question_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		WebElement edit_review_type = driver.findElement(By.id("review_edit_type"));
		Select ert = new Select(edit_review_type); 
		Thread.sleep(2000);
		ert.selectByVisibleText(" Property Condition ");
			
		Thread.sleep(3000);
		
		driver.findElement(By.id("review_edit_question")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("review_edit_question")).sendKeys("Automated_Were_they responsive to requests and inquiries?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[Feedback Question Type]	[Delete]	
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Were_they responsive to requests and inquiries?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"question_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); //click on OK btn
		
		Thread.sleep(5000);
		
//		alert.dismiss(); //click on cancel btn //
		
		
		
		
		
		
		
		
		
		
//		[Feedback Question Type Page]	[Add]
		
		driver.findElement(By.xpath("//label[text()='Feedback Question Type']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_5 = "https://sonline.us/rental-review/admin/#/question-type-list";
		
		String Actual_URL_5 = driver.getCurrentUrl();
		System.out.println(Actual_URL_5);
		
		AssertJUnit.assertEquals(Expected_URL_5,Actual_URL_5);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h4/button[2]/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("review_type_name")).sendKeys("Automated_Recommendation");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
//		[Edit Feedback Question Type]   [Update]
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Recommendation");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"question_type_list_table\"]/tbody/tr/td[5]/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("review_type_name")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("review_type_name")).sendKeys("Automated_Recommendation_1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[Edit Feedback Question Type]   [Delete]		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Recommendation_1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"question_type_list_table\"]/tbody/tr/td[5]/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		
		Thread.sleep(5000);
		
		Alert alert_1 = driver.switchTo().alert();
		System.out.println(alert_1.getText());
		alert_1.accept(); //click on OK btn
		
		Thread.sleep(5000);
		
//		alert.dismiss(); //click on cancel btn	//
		
		
		
		
		
		
		
//		[Review Report Page]	
		
		driver.findElement(By.xpath("//label[text()='Review Report']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"report_list_table\"]/tbody/tr[1]")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_11 = "https://sonline.us/rental-review/admin/#/review-edit";
		
	
		String Actual_URL_11 = driver.getCurrentUrl();
		System.out.println(Actual_URL_11);
		
		AssertJUnit.assertEquals(Expected_URL_11,Actual_URL_11);
		
		Thread.sleep(3000);
		
		String Expected_heading_1 = "Edit Review";
		
		WebElement heading_1 = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		String Actual_heading_1 = heading_1.getText();
		
		AssertJUnit.assertEquals(Expected_heading_1,Actual_heading_1);
		
		Thread.sleep(3000);
		
		String Expected_username_1 = "User Name";
		
		WebElement username_1 = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[2]/label"));
		String Actual_username_1 = username_1.getText();
		
		AssertJUnit.assertEquals(Expected_username_1,Actual_username_1);
		
		Thread.sleep(3000);
		
		String Expected_propertyname_1 = "Property Name*";
		
		WebElement propertyname_1 = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[3]/label"));
		String Actual_propertyname_1 = propertyname_1.getText();
		
		AssertJUnit.assertEquals(Expected_propertyname_1,Actual_propertyname_1);
		
		Thread.sleep(3000);
		
		String Expected_IP_address_1 = "IP address";
		
		WebElement IP_address_1 = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[4]/label"));
		String Actual_IP_address_1 = IP_address_1.getText();
		
		AssertJUnit.assertEquals(Expected_IP_address_1,Actual_IP_address_1);
		
		Thread.sleep(3000);
		
		String Expected_address_1 = "Address";
		
		WebElement address_1 = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[5]/label"));
		String Actual_address_1 = address_1.getText();
		
		AssertJUnit.assertEquals(Expected_address_1,Actual_address_1);
		
		Thread.sleep(3000);
		
		String Expected_message_1 = "Message";
		
		WebElement message_1= driver.findElement(By.xpath("//*[@id=\"message\"]/label"));
		String Actual_message_1 = message_1.getText();
		
		AssertJUnit.assertEquals(Expected_message_1,Actual_message_1);
		
		Thread.sleep(3000);
		
		String Expected_approved_1 = "Approved";
		
		WebElement Approved_1 = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[7]/label"));
		String Actual_approved_1 = Approved_1.getText();
		
		AssertJUnit.assertEquals(Expected_approved_1,Actual_approved_1);
		
		Thread.sleep(3000);
		
		String Expected_active_1 = "Active";
		
		WebElement active_1 = driver.findElement(By.xpath("//*[@id=\"validation-form\"]/fieldset/div/div[2]/div[8]/label"));
		String Actual_active_1 = active_1.getText();
		
		AssertJUnit.assertEquals(Expected_active_1,Actual_active_1);
		
		Thread.sleep(3000);
		
		JavascriptExecutor JS_1 = (JavascriptExecutor)driver;
		
		JS_1.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
		
		
		
		
		
		
		
		
		
		
//		[Blog Page]	[Add]
		
		driver.findElement(By.xpath("//label[text()=' Blog']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_6 = "https://sonline.us/rental-review/admin/#/blog-list";
		
		String Actual_URL_6 = driver.getCurrentUrl();
		System.out.println(Actual_URL_6);
		
		AssertJUnit.assertEquals(Expected_URL_6,Actual_URL_6);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h4/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_title")).sendKeys("Automated_The Rental Review Ultimate First-Time Renters Guide");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_slug")).sendKeys("Automated-rental-review-blog-second");
		
		Thread.sleep(3000);
		
		WebElement blog_category_id = driver.findElement(By.id("blog_category_id"));
		Select bci = new Select(blog_category_id); 
		Thread.sleep(2000);
		bci.selectByVisibleText(" House ");
	
		driver.findElement(By.xpath("//*[@id=\"review_validation-form\"]/div[1]/fieldset/div[3]/div/ckeditor/div[2]/div[2]/div")).sendKeys("Are you ready to take the leap into the exciting world of renting your first apartment or house? First-time renters often find themselves facing many questions and uncertainties. Where should you start? What should you look for in a rental property? \r\n"
				+ "\r\n"
				+ "1. Assessing Your Needs\r\n"
				+ "\r\n"
				+ "Before you dive into the rental market, it’s crucial to assess your needs and priorities. Consider factors like:\r\n"
				+ "\r\n"
				+ "Budget: Determine how much you can comfortably afford for rent, keeping in mind other expenses like utilities, groceries, and transportation.\r\n"
				+ "Location: Think about where you want to live. Proximity to work, school, public transport, and amenities can greatly impact your daily life.\r\n"
				+ "Type of Property: Decide between an apartment, condo, house, or shared accommodation. Each has its advantages and disadvantages.\r\n"
				+ "Amenities: Make a list of must-have amenities such as parking, laundry facilities, or a pet-friendly environment.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "2. Researching the Market\r\n"
				+ "\r\n"
				+ "Now that you know what you’re looking for, it’s time to research the rental market:\r\n"
				+ "\r\n"
				+ "Online Listings: Apartment listing sites such as are great places to start your search. They provide detailed listings with photos, prices, and contact information.\r\n"
				+ "Local Classifieds: Check out local newspapers, community bulletin boards, and social media groups for additional rental listings.\r\n"
				+ "Real Estate Agents: Consider enlisting the help of a real estate agent who specializes in rentals. They can provide valuable insights and access to exclusive listings.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "3. The Viewing Process\r\n"
				+ "\r\n"
				+ "Once you’ve identified potential rentals, schedule viewings:\r\n"
				+ "\r\n"
				+ "Prepare Questions: Prepare a list of questions to ask the landlord or property manager during the viewing. Inquire about the lease terms, maintenance policies, and any required deposits.\r\n"
				+ "Inspect Thoroughly: Look for signs of damage or disrepair. Check the plumbing, electrical systems, appliances, and the overall condition of the property.\r\n"
				+ "Note the Surroundings: Pay attention to the neighbourhood, noise levels, and access to essential services and public transportation.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "4. Understanding the Lease\r\n"
				+ "\r\n"
				+ "Understanding your lease is essential to a smooth rental experience:\r\n"
				+ "\r\n"
				+ "Read Thoroughly: Read the lease agreement carefully. Ensure you understand all the terms and conditions before signing.\r\n"
				+ "Duration: Determine the length of the lease. Is it month-to-month, a fixed-term lease, or a lease with the option to renew?\r\n"
				+ "Rent Increases: Ask about the policy for rent increases and how much notice you’ll receive.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "5. Budgeting and Financial Responsibility\r\n"
				+ "\r\n"
				+ "Managing your finances is a crucial aspect of renting:\r\n"
				+ "\r\n"
				+ "Security Deposit: Know the amount of the security deposit and the conditions under which it may be withheld.\r\n"
				+ "Monthly Budgeting: Create a budget that includes rent, utilities, groceries, and other expenses. Stick to it to avoid financial stress.\r\n"
				+ "Renter’s Insurance: Consider purchasing renter’s insurance to protect your belongings in case of theft, fire, or other unexpected events.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "6. Moving In\r\n"
				+ "\r\n"
				+ "Congratulations on finding the perfect rental! As you prepare to move in:\r\n"
				+ "\r\n"
				+ "Inspect Again: Conduct a final walkthrough with your landlord to document the condition of the property before moving in.\r\n"
				+ "Utilities: Set up utilities in your name, such as electricity, gas, water, and internet.\r\n"
				+ "Change of Address: Notify relevant parties about your change of address, including your employer, bank, and the post office.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "7. Building a Good Tenant-Landlord Relationship\r\n"
				+ "\r\n"
				+ "A positive tenant-landlord relationship is essential for a harmonious living situation:\r\n"
				+ "\r\n"
				+ "Communication: Maintain open and respectful communication with your landlord. Report maintenance issues promptly.\r\n"
				+ "Respect the Property: Treat the rental property with care, and follow all rules outlined in the lease agreement.\r\n"
				+ "Know Your Rights: Familiarize yourself with tenant rights in your area to protect yourself from unfair practices.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "8. Preparing to Move Out\r\n"
				+ "\r\n"
				+ "When it’s time to move on:\r\n"
				+ "\r\n"
				+ "Notice: Give proper notice to your landlord before moving out, as per the terms of your lease.\r\n"
				+ "Cleaning and Repairs: Clean the property thoroughly and make necessary repairs, if required, to ensure the return of your security deposit.\r\n"
				+ "Return of Keys: Hand over the keys to the landlord or property manager.\r\n"
				+ "\r\n"
				+ "Renting your first property is an exciting step towards independence and adulthood. With the Rentals.ca Ultimate First-Time Renters Guide, you’ll have the knowledge and confidence. Remember, Rentals.ca is in your journey to find the perfect place to call home. Happy renting!\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_image")).sendKeys("C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\3ceff6a3-243a-4e1e-8791-abab5d20d637.jpg");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
//		[Blog Page]	[Edit]		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated-rental-review-blog-second");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"blog_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_title")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("blog_title")).sendKeys("Automated_The_Rental Review Ultimate First-Time Renters Guide");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_slug")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("blog_slug")).sendKeys("Automated-rental-review-blog-second-1");
		
		Thread.sleep(3000);
		
		WebElement edit_blog_category_id = driver.findElement(By.id("blog_category_id"));
		Select ebci = new Select(edit_blog_category_id); 
		Thread.sleep(2000);
		ebci.selectByVisibleText(" Aparment ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"review_validation-form\"]/div[2]/div/ckeditor/div[2]/div[2]/div")).clear();
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@id=\"review_validation-form\"]/div[2]/div/ckeditor/div[2]/div[2]/div")).sendKeys("Are you ready to take the leap into the exciting world of renting your first apartment or house? First-time renters often find themselves facing many questions and uncertainties. Where should you start? What should you look for in a rental property? \r\n"
				+ "\r\n"
				+ "1. Assessing Your Needs\r\n"
				+ "\r\n"
				+ "Before you dive into the rental market, it’s crucial to assess your needs and priorities. Consider factors like:\r\n"
				+ "\r\n"
				+ "Budget: Determine how much you can comfortably afford for rent, keeping in mind other expenses like utilities, groceries, and transportation.\r\n"
				+ "Location: Think about where you want to live. Proximity to work, school, public transport, and amenities can greatly impact your daily life.\r\n"
				+ "Type of Property: Decide between an apartment, condo, house, or shared accommodation. Each has its advantages and disadvantages.\r\n"
				+ "Amenities: Make a list of must-have amenities such as parking, laundry facilities, or a pet-friendly environment.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "2. Researching the Market\r\n"
				);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_image")).sendKeys("C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\0dae5676-8702-499e-9fb8-7921d7e0da12.jpg");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
//		[Blog Page]	[Delete]	
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated-rental-review-blog-second-1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"blog_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		
		Thread.sleep(5000);
		
		Alert alert_2 = driver.switchTo().alert();
		System.out.println(alert_2.getText());
		alert_2.accept(); //click on OK btn
		
		Thread.sleep(8000);
		
//		alert_2.dismiss(); //click on cancel btn	//
		
		
		
		
		
		
		
		
		
		
		
//		[Blog Category Page]	
		
		driver.findElement(By.xpath("//label[text()='Blog Category']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_7 = "https://sonline.us/rental-review/admin/#/blog-category-list";
		
		String Actual_URL_7 = driver.getCurrentUrl();
		System.out.println(Actual_URL_7);
		
		AssertJUnit.assertEquals(Expected_URL_7,Actual_URL_7);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h4/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("category_name")).sendKeys("Automated_Land");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
//		[Edit Feedback Question Type]   [Update]
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Land");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"blog_category_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("category_name")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("category_name")).sendKeys("Automated_Land_1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[Edit Feedback Question Type]   [Delete]		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Land_1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"blog_category_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		
		Thread.sleep(5000);
		
		Alert alert_3 = driver.switchTo().alert();
		System.out.println(alert_3.getText());
		alert_3.accept(); //click on OK btn

		Thread.sleep(8000);
//		
//		alert.dismiss(); //click on cancel btn	//
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		[FAQ Page]	[Add]
		
		driver.findElement(By.xpath("//label[text()='FAQ']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_8 = "https://sonline.us/rental-review/admin/#/faq-list";
		
		String Actual_URL_8 = driver.getCurrentUrl();
		System.out.println(Actual_URL_8);
		
		AssertJUnit.assertEquals(Expected_URL_8,Actual_URL_8);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h4/button[2]/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("faq_question")).sendKeys("Automated_Should I trust reviews entirely when choosing a rental property?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("faq_answer")).sendKeys("Automated_Reviews are a useful tool, but it's essential to consider other factors, such as your specific needs and the property's condition during your visit.");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(6000);
		
//		[FAQ Page]	[Edit]
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Should I trust reviews entirely when choosing a rental property?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"faq_list_table\"]/tbody/tr/td[5]/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("faq_question")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("faq_question")).sendKeys("Automated_Should_I trust reviews entirely when choosing a rental property?");
		
		Thread.sleep(3000);

		driver.findElement(By.id("faq_answer")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("faq_answer")).sendKeys("Automated_Reviews_are a useful tool, but it's essential to consider other factors, such as your specific needs and the property's condition during your visit.");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[FAQ Page]	[Delete]
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_Should_I trust reviews entirely when choosing a rental property?");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"faq_list_table\"]/tbody/tr/td[5]/button/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		
		Thread.sleep(5000);
		
		Alert alert_4 = driver.switchTo().alert();
		System.out.println(alert_4.getText());
		alert_4.accept(); //click on OK btn
//		alert.dismiss(); //click on cancel btn	//
//		
		Thread.sleep(8000);
		
		
		
		
		
		
		
		
//		[CMS Page]	[Edit]
		
		driver.findElement(By.xpath("//label[text()='CMS']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_9 = "https://sonline.us/rental-review/admin/#/cms-list";
		
		String Actual_URL_9 = driver.getCurrentUrl();
		System.out.println(Actual_URL_9);
		
		AssertJUnit.assertEquals(Expected_URL_9,Actual_URL_9);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Home page Title");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"cms_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("cms_name")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("cms_name")).sendKeys("_Home page Title_");
		
		Thread.sleep(3000);
		
		String Expected_CMS_content = "Share Your Rental Experiences";
		
		WebElement CMS_cont = driver.findElement(By.xpath("(//div[contains (@class,'ck-blurred ck ck-content ck-editor__editable ck-rounded-corners ck-editor__editable_inline')])"));
		String Actual_CMS_content = CMS_cont.getText();
		
		AssertJUnit.assertEquals(Expected_CMS_content,Actual_CMS_content);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[CMS Page]	[Again Edit]
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("_Home page Title_");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"cms_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("cms_name")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("cms_name")).sendKeys("Home page Title");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		
		
		
		

		

//		[Testimonial Page]	[Add]
		
		driver.findElement(By.xpath("//label[text()='Testimonial']")).click();
		
		Thread.sleep(3000);
		
		String Expected_URL_10 = "https://sonline.us/rental-review/admin/#/testinomial-list";
		
		String Actual_URL_10 = driver.getCurrentUrl();
		System.out.println(Actual_URL_10);
		
		AssertJUnit.assertEquals(Expected_URL_10,Actual_URL_10);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h4/button/i")).click();
		
		Thread.sleep(3000);		
		
		driver.findElement(By.id("owner_name")).sendKeys("Automated_max");
		
		Thread.sleep(3000);		
		
		driver.findElement(By.id("owner_designation")).sendKeys("Automated_owner");
		
		Thread.sleep(3000);	
		
		driver.findElement(By.id("owner_description")).sendKeys("I recently moved to a new city and was on the hunt for a rental property. Your website was a lifesaver! The reviews from previous tenants gave me valuable insights into the different properties and landlords in the area. It helped me make an informed decision, and I ended up finding a great place with an excellent landlord. I highly recommend this website to anyone looking for a rental property.");
		
		Thread.sleep(3000);	
		
		driver.findElement(By.id("blog_image")).sendKeys("C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\39d11141-77f2-44e7-8909-ee799ba8806a.png");
		
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[Testimonial Page]	[Edit]		
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_max");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"testinomial_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("owner_name")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("owner_name")).sendKeys("Automated_maxx");
		
		Thread.sleep(3000);

		driver.findElement(By.id("owner_designation")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("owner_designation")).sendKeys("Automated_owner_1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("blog_image")).sendKeys("C:\\Users\\tushar.bagul\\eclipse-workspace\\Rental-Review\\src\\test\\resources\\39d11141-77f2-44e7-8909-ee799ba8806a.png");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
//		[Testimonial Page]	[Delete]	
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Automated_maxx");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"testinomial_list_table\"]/tbody/tr/td[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		
		Thread.sleep(5000);
		
		Alert alert_5 = driver.switchTo().alert();
		System.out.println(alert_5.getText());
		alert_5.accept(); //click on OK btn
//		alert.dismiss(); //click on cancel btn	//
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//label[text()='Sign Out]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}
}
