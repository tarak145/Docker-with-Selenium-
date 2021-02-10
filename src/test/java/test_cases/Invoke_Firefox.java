package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;



public class Invoke_Firefox extends Base {
	public static Logger log=LogManager.getLogger(Invoke_Firefox.class.getName());
	DesiredCapabilities cap;
	WebDriver driver;
	
	@Test
	public void Invoke_Firefox_Docker() throws Exception
	{
		cap = capabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		driver =initializeBrowser();
		log.info("successfully initiated Driver");
		driver.get("https://www.google.co.in/");
		log.info("successfully launched the url");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("hello my name is Tarkeshwar Singh");
		log.info("successfully Entered the Text in Text Field");
	    System.out.println(driver.getTitle());
	    log.info("successfully Extracted Title");
	    takeSnapShot(driver, "F:\\java1\\Docker\\reports\\Screenshots\\Firefox1.png") ;
	    Assert.assertTrue(false);
	    driver.close();
}}
