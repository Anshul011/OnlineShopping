package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class personalInformation {
	

	@FindBy(how=How.NAME,using="firstname")
	@CacheLookup
	static
	WebElement 	FName;
	@FindBy(how=How.NAME,using="lastname")
	@CacheLookup
	static
	WebElement 	LName;
	@FindBy(how=How.NAME,using="email")
	@CacheLookup
	static
	WebElement 	CEmail;
	@FindBy(how=How.NAME,using="old_passwd")
	@CacheLookup
	static
	WebElement 	DPassword;
	@FindBy(how=How.NAME,using="submitIdentity")
	@CacheLookup
	static
	WebElement 	save;
	
	public static void accountDetails() throws InterruptedException
	{

	FName.sendKeys("Testname");
	LName.sendKeys("Testlastname");
	CEmail.sendKeys("TestEmail");
	DPassword.sendKeys("TestPassword");
	save.click();
}
}

