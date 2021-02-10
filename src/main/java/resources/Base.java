package resources;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base {
	DesiredCapabilities cap;
	public WebDriver driver;
	
	public DesiredCapabilities capabilities()
	{
	  cap = new DesiredCapabilities();
	  return cap;
	}

	public WebDriver initializeBrowser() throws MalformedURLException
	{
	
	 driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	 return driver;
	}
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                File DestFile=new File(fileWithPath);
                FileUtils.copyFile(SrcFile, DestFile);

    }

	
	public String getScreenshotPath(String TestCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destpath=System.getProperty("user.dir")+"/reports/"+TestCaseName+".png";
		File file=new File(destpath);
		FileUtils.copyFile(source, file);
		//System.out.println(destpath);
		return destpath;
		
	}

}
