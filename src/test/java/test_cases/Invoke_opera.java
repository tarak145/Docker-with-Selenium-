package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import resources.Base;



public class Invoke_opera extends Base  {
	public static Logger log=LogManager.getLogger(Invoke_opera.class.getName());
	DesiredCapabilities cap;
	WebDriver driver;
	
	@Test
	public void Invoke_Opera_Docker() throws Exception
	{
		cap = capabilities();
		cap.setBrowserName(BrowserType.OPERA_BLINK);
		driver =initializeBrowser();
		log.info("successfully initiated Driver");
		driver.get("https://www.guru99.com/");
		log.info("successfully launched the url");
        Thread.sleep(5000);
	    System.out.println(driver.getTitle());
	    log.info("successfully Extracted Title");
	    takeSnapShot(driver, "F:\\java1\\Docker\\reports\\Screenshots\\Opera1.png") ;
	    driver.close();
	    
}}
