package autotTest.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTING {
 public static void main (String [] args) throws InterruptedException {
	 
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 Actions act = new Actions (driver);
			 
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 
	 WebElement searchBox = driver.findElement(By.name("q"));
	 searchBox.clear();
	 searchBox.sendKeys("Free");
//	 WebElement pickone = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]/div[1]/span"));
	 
	 for (int i = 1; i <= 5; i++) {
		searchBox.sendKeys(Keys.DOWN);
	}
	 
	 
	 Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	 
	 driver.close();
	 
//	 List<WebElement> searchList = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[*]/div/div[2]/div[1]/span"));
//	 System.out.println(searchList.size());
	 
//	 for (WebElement myL : searchList) {
//		System.out.println(myL.getText()); 
//	}
	
	 
 }
}
