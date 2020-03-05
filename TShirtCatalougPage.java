package pages;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import TestCases.BaseTest;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class TShirtCatalougPage {
	public static WebDriver driver;
	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[3]/a")
	@CacheLookup
	static
	WebElement Tshirts;
	@FindBy(how=How.XPATH,using="//*[text()='Faded Short Sleeve T-shirts']")
	@CacheLookup
	static
	WebElement Pic;
	@FindBy(how=How.XPATH,using="//*[text()='Add to cart']")
	@CacheLookup
	static
	WebElement AddToCart;
	@FindBy(how=How.XPATH,using="//*[text()='							Proceed to checkout']")
	@CacheLookup
	static
	WebElement ProceedToCheckout;
	
	public static void addItemtoCart() throws InterruptedException
	{
		Tshirts.click();
		
		Actions builder= new Actions(driver);
		builder.moveToElement(Pic).build().perform();
		AddToCart.click();
				
			String mainwindow = driver.getWindowHandle();
			//Set <String> childwindow = driver.getWindowHandles();
			for ( String childwindow :driver.getWindowHandles() )
			{
			if (!childwindow.equals(mainwindow))
				{
				
			 driver.switchTo().window(childwindow);
				ProceedToCheckout.click();
				}
			}
		}

	}

