package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderHistoryPage {
	
	@FindBy(how=How.XPATH,using="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
	@CacheLookup
	static
	WebElement Account;
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
	@CacheLookup
	static
	WebElement OrderHistory;
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
	@CacheLookup
	static
	WebElement 	PersonalInfo;

public static void OrderHistory() throws InterruptedException
{
	Account.click();
	OrderHistory.click();
}
public  static void accountDetails() throws InterruptedException
{
	Account.click();
	PersonalInfo.click();
}
}
