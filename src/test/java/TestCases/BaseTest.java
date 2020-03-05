package TestCases;

import Utilities.Constansts;
import Utilities.URLs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	public static WebDriver driver;
	
	@org.testng.annotations.BeforeTest
	public void beforeTest(String browser) throws Exception {
	//	_browser = browser;
		getDriver(browser);
		driver.get(URLs.URL_automationPractice);
	}

	@org.testng.annotations.AfterTest
	public void afterTest() {
		resetTestContext();
	}

	public static void resetTestContext(){
		//getDriver().quit();
		driver = null;
	}
	
	public static WebDriver getDriver(){
		if(driver==null)
		{
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/AnshulAgarwal/Desktop/OIX Automation/OIX-Automation/oix/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}
		return driver;
		}
		 
	public static WebDriver getDriver(String browserName){
		if(driver==null){
		if(browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "D:Softwaresjarsgeckodriver-v0.23.0-win64geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}else if(browserName.equalsIgnoreCase("chrome")){
		System.out.println("in chrome");
		System.setProperty("webdriver.chrome.driver", "D:chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}else if(browserName.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", "D:SoftwaresjarsIEDriverServer_Win32_3.14.0IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}
		}
		return driver;
		}
		}
