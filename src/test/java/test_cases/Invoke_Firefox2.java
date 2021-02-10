package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import resources.Base;



public class Invoke_Firefox2 extends Base {
	public static Logger log=LogManager.getLogger(Invoke_Firefox2.class.getName());
	DesiredCapabilities cap;
	WebDriver driver;
	
	@Test
	public void Invoke_Firefox2_Docker() throws Exception
	{
		
		cap = capabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		driver =initializeBrowser();
		log.info("successfully initiated Driver");
		driver.get("https://www.tutorialspoint.com/index.htm");
		log.info("successfully launched the url");
		Thread.sleep(5000);
		driver.findElement(By.name("search")).sendKeys("selenium tutorials");
		log.info("successfully Entered the Text in Text Field");
	    System.out.println(driver.getTitle());
	    log.info("successfully Extracted Title");
	    takeSnapShot(driver, "F:\\java1\\Docker\\reports\\Screenshots\\Firefox2.png") ;
	    driver.close();
	    
}}
