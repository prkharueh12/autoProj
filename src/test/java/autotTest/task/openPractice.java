package autotTest.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AutoKeyTwo;
import pages.praticeAutoKey;
import testBase.Driver;
import util.ConfigsReader;


public class openPractice {
	Actions act = new Actions(Driver.getDriver());
	public class RegisterEmailEtsy {
		praticeAutoKey autoTest = new praticeAutoKey ();
		AutoKeyTwo autoTwo = new AutoKeyTwo ();
		
		@BeforeMethod (alwaysRun = true)
		public void beforeMyMethod () throws InterruptedException {
			
			Driver.getDriver().get(ConfigsReader.getProperty("url5"));
			Driver.getDriver().manage().window().maximize();
			Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
		}
		
		@Test (description = "Search items")
		public  void lookItem () throws InterruptedException  { 
			
			autoTest.searchBox.sendKeys(ConfigsReader.getProperty("keyWord"));
			autoTest.searchEnter.click();
			Thread.sleep(1000);
			((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,300)");
			
			act.moveToElement(autoTest.hoverAct).perform();
			
			act.moveToElement(autoTest.addCartButt).click().perform();
			Thread.sleep(2000);
			
			act.moveToElement(autoTest.greenButt).click().perform();
			Thread.sleep(2000);
			((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,500)");
			Thread.sleep(1000);
			act.moveToElement(autoTest.proChkOut).click().perform();
			
		}
		
		}
	
	
	
	@AfterMethod (enabled = true)
	public  void closeIt () throws InterruptedException {
		Thread.sleep(1000);
		Driver.getDriver().close();
	}
} //end class
