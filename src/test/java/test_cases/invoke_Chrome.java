package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import resources.Base;



public class invoke_Chrome extends Base {
	public static Logger log=LogManager.getLogger(invoke_Chrome.class.getName());
	DesiredCapabilities cap;
	WebDriver driver;
	//String destpath;
	
	
	@Test
	public void Invoke_Chrome1_Docker() throws Exception
	{
		
		cap = capabilities();
		cap.setBrowserName(BrowserType.CHROME);
		driver =initializeBrowser();
		log.info("successfully initiated Driver");
	    driver.get("https://mvnrepository.com/");
	    log.info("successfully launched the url");
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    log.info("successfully Extracted Title");
	    takeSnapShot(driver, "F:\\java1\\Docker\\reports\\Screenshots\\Chrome1.png") ;
	    driver.close();
	
}}
