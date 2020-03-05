package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.OrderHistoryPage;
import pages.SignInPage;
import pages.CheckoutPage;
import pages.personalInformation;
import pages.TShirtCatalougPage;
import TestCases.BaseTest;

public class TC01AddTshirt extends SignInPage {

	@Test(enabled=true, priority =1)
	public static boolean OrderTshirt(String uname, String pswrd) throws Exception
	{
		SignInPage.Signin("anshul.sharma11@gmail.com", "Dummypassword@123");
		HomePage.SelectItem();
		TShirtCatalougPage.addItemtoCart();
		CheckoutPage.Checkout();
		OrderHistoryPage.OrderHistory();
		
		//public boolean validateElementExists(string xpath)
		//{
			boolean result = false;
			{
				BaseTest.getDriver().findElement(By.xpath("//*[@id='order-list']/tbody/tr/td[2]"));
				result = true;
			
			}
				return result;
		
		//}
	}
		@Test(enabled=true, priority =2)
		public void updateAccountInformation() throws InterruptedException
{
	 OrderHistoryPage.accountDetails();
	 personalInformation.accountDetails();
	
}
	}
	
