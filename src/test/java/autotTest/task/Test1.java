package autotTest.task;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.Driver;
import util.ConfigsReader;

public class Test1 {

	@BeforeMethod (alwaysRun = true)
	public void beforeMyMethod () throws InterruptedException {
		
		Driver.getDriver().get(ConfigsReader.getProperty("url99"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
	}
	
	@Test
	public  void lookItem () throws InterruptedException  { 
		String title = Driver.getDriver().getTitle();
		System.out.println(title);
		
	}
	
	
} //end class
