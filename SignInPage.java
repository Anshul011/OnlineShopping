package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

	
		@FindBy(how=How.XPATH,using="//*[text()='Sign in']")
		@CacheLookup
		static
		WebElement signin;
		@FindBy(how=How.NAME,using="email")
		@CacheLookup
		static
		WebElement username;
		@FindBy(how=How.NAME,using="passwd")
		@CacheLookup
		static
		WebElement password;
		@FindBy(how=How.NAME,using="SubmitLogin")
		@CacheLookup
		static
		WebElement Login;
		
		public static void Signin(String uname, String pswrd) throws InterruptedException
		{
			signin.click();
			username.sendKeys(uname);
			password.sendKeys(pswrd);
			Login.click();
		}
	
}
