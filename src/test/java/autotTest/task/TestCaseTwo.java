package autotTest.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.AutoKeyTwo;
import pages.praticeAutoKey;
import testBase.Driver;
import util.ConfigsReader;

public class TestCaseTwo {
	
	Actions act = new Actions(Driver.getDriver());
	public class RegisterEmailEtsy {
		AutoKeyTwo autoTwo = new AutoKeyTwo ();
		
		@BeforeMethod (alwaysRun = true)
		public void beforeMyMethod () throws InterruptedException {
			
			Driver.getDriver().get(ConfigsReader.getProperty("url5"));
			Driver.getDriver().manage().window().maximize();
			Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
		}
		
		@Test (description = "Send to Friend")
		public  void sendToFriend () throws InterruptedException  { 
			
			autoTwo.searchBox.sendKeys(ConfigsReader.getProperty("keyWord"));
			autoTwo.searchEnter.click();
			Thread.sleep(1000);
			((JavascriptExecutor) Driver.getDriver()).executeScript("scroll(0,300)");
			act.moveToElement(autoTwo.hoverAct).perform();
			Thread.sleep(1000);
			act.moveToElement(autoTwo.moreButt).click().perform();
			
			act.moveToElement(autoTwo.sendFriend).click().perform();
			
			autoTwo.friendName.sendKeys(ConfigsReader.getProperty("friendN"));
			autoTwo.friendEmail.sendKeys(ConfigsReader.getProperty("friendE"));
			
			act.moveToElement(autoTwo.sendButt).click().perform();
		
			Assert.assertEquals(autoTwo.text.getText(),ConfigsReader.getProperty("actualText"));
			//System.out.println(autoTwo.text.getText());
			act.moveToElement(autoTwo.okButt).click().perform();
		}
}
	
	@AfterTest 
	public  void closeIt () throws InterruptedException {
		Thread.sleep(1000);
		Driver.getDriver().close();
	}
}//end class
