package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[3]/a")
	@CacheLookup
	static
	WebElement Tshirts;
	
	public static void SelectItem() throws InterruptedException
	{
		Tshirts.click();
		
	}
}
