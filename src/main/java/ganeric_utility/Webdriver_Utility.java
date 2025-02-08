package ganeric_utility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Webdriver_Utility 
{
	
public void MaximizeWindows(WebDriver driver) 
{
	driver.manage().window().maximize();
}

public void ImplicitWait(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

public void Action(WebDriver driver , WebElement ele)
{
	Actions act = new Actions(driver);
	act.moveToElement(ele).click().perform();
}

public void AcceptAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
}

public void CancleAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}

public void RefreshWindow(WebDriver driver)
{
	driver.navigate().refresh();
}

public void QuitBrowser(WebDriver driver) throws Throwable
{
	Thread.sleep(2000);
	driver.quit();
}

public void SwitchWindow(WebDriver driver,String WindowName)
{
		Set<String> ALLID = driver.getWindowHandles();
		Iterator<String> it = ALLID.iterator();
		while(it.hasNext())
		{
			String win = it.next();
			driver.switchTo().window(win);
			if(win.contains(WindowName))
			{
				break;
			}
		}
	}

public static String TakeScreenshot(WebDriver driver,String ScreenshotName) throws Throwable
{
	TakesScreenshot SS = (TakesScreenshot)driver;
	File src = SS.getScreenshotAs(OutputType.FILE);
	File dst = new File("./Screenshots/"+ScreenshotName+".png");
	FileUtils.copyFile(src, dst);
	return dst.getAbsolutePath();
	
}
}
