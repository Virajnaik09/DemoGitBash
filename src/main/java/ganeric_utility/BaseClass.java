package ganeric_utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objectReposetory.HomePage;
import objectReposetory.LoginPage;



public class BaseClass {
	public WebDriver driver ;
	public static WebDriver sdriver;
	 @BeforeSuite(groups = {"smokeTest","regressionTest"})
		public void BS()
		{
			
		}
		@BeforeTest(groups = {"smokeTest","regressionTest"})
		public void BT()
		{
			
		}
		@BeforeClass(groups = {"smokeTest","regressionTest"})
		public void BC() throws Throwable
		{
			File_utility flib = new File_utility();
			String BROWSER = flib.getKeyAndValuePair("browser");

			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(BROWSER.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
			}
			else if(BROWSER.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
			else
			{
				driver = new EdgeDriver();
			}
			sdriver=driver;
			Webdriver_Utility wlib = new Webdriver_Utility();

			wlib.MaximizeWindows(driver);
			wlib.ImplicitWait(driver);
		}
		@BeforeMethod(groups = {"smokeTest","regressionTest"})
		public void BM() throws Throwable
		{
			File_utility flib = new File_utility();
			String URL = flib.getKeyAndValuePair("url");
			String USERNAME = flib.getKeyAndValuePair("username");
			String PASSWORD = flib.getKeyAndValuePair("username");
			driver.get(URL);
			LoginPage login = new LoginPage(driver);
			login.LoginToApp(USERNAME, PASSWORD);
			
		}
		
		@AfterMethod(groups = {"smokeTest","regressionTest"})
		public void AM()
		{
			HomePage home = new HomePage(driver);
			home.logout(driver);
		}
		@AfterClass(groups = {"smokeTest","regressionTest"})
		public void AC() throws Throwable
		{ 	
			Webdriver_Utility wlib = new Webdriver_Utility();
		    wlib.QuitBrowser(driver);
		}
		@AfterTest(groups = {"smokeTest","regressionTest"})
		public void AT()
		{
			
		}
		@AfterSuite(groups = {"smokeTest","regressionTest"})
		public void AS() 
		{
			
		}

   
}
