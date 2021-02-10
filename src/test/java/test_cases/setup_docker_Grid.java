package test_cases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class setup_docker_Grid {
	
	@BeforeTest
	void startdockergrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(35000);
	}
	
	@AfterTest
	void stopdockergrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(25000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
	}

}
