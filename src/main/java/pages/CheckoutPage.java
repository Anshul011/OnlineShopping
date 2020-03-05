package pages;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage {

	@FindBy(how=How.XPATH,using="//*[text()='Proceed to checkout']")
		@CacheLookup
		static
	WebElement proceedToCheckoutbutton;
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/form/p/button/span/text()")
	@CacheLookup
	static
	WebElement proceedToCheckoutbutton2;
	@FindBy(how=How.XPATH,using="//*[@id='form']/p/button/span/text()")
	@CacheLookup
	static
	WebElement proceedToCheckoutbutton3;
	@FindBy(how=How.NAME,using="cgv")
	@CacheLookup
	static
	WebElement AgreeTermCondition;
	@FindBy(how=How.XPATH,using="//*[@id='HOOK_PAYMENT']/div[2]/div/p/a/text()")
	@CacheLookup
	static
	WebElement PayByCheck;
	@FindBy(how=How.XPATH,using="//*[@id='cart_navigation']/button/span/text()")
	@CacheLookup
	static
	WebElement ConfirmOrder;

public static void Checkout() throws InterruptedException
{
	proceedToCheckoutbutton.click();
	proceedToCheckoutbutton2.click();
	AgreeTermCondition.click();
	proceedToCheckoutbutton3.click();
	PayByCheck.click();
	ConfirmOrder.click();
}
}

