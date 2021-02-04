package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Driver;



public class praticeAutoKey {

	
	@FindBy (id = "search_query_top")
	public WebElement searchBox;
	
	@FindBy (xpath = "//*[@id=\"searchbox\"]/button")
	public WebElement searchEnter;

	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
	public WebElement addCartButt;

	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	public WebElement hoverAct;
	
	@FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	public WebElement greenButt;
	
	@FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	public WebElement chkOut;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	public WebElement proChkOut;
	
	public praticeAutoKey () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
}
