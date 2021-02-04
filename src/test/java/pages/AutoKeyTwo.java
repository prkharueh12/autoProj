package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Driver;

public class AutoKeyTwo {
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
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
	public WebElement moreButt;
	
	@FindBy (id = "send_friend_button")
	public WebElement sendFriend;
	
	@FindBy (id = "friend_name")
	public WebElement friendName;
	
	@FindBy (id = "friend_email")
	public WebElement friendEmail;
	
	@FindBy (id = "sendEmail")
	public WebElement sendButt;
	
	@FindBy (xpath = "//*[@id=\"product\"]/div[2]/div/div/div/p[1]")
	public WebElement text;
	
	@FindBy (xpath = "//*[@id=\"product\"]/div[2]/div/div/div/p[2]/input")
	public WebElement okButt;
	
	public AutoKeyTwo () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
}
