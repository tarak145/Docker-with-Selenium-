package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import resources.Base;



public class invoke_Chrome2 extends Base {
	public static Logger log=LogManager.getLogger(invoke_Chrome2.class.getName());
	DesiredCapabilities cap;
	WebDriver driver;
	
	
	@Test
	public void Invoke_Chrome2_Docker() throws Exception
	{
		
		cap = capabilities();
		cap.setBrowserName(BrowserType.CHROME);
		driver =initializeBrowser();
		log.info("successfully initiated Driver");
	    driver.get("https://www.flipkart.com/");
	    log.info("successfully launched the url");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("tarkeshwar@145");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
	    takeSnapShot(driver, "F:\\java1\\Docker\\reports\\Screenshots\\Chrome2.png") ;
	    System.out.println(driver.getTitle());
	    log.info("successfully Extracted Title");
	    driver.close();
	
}}
