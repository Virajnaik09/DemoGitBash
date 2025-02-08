package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class ValidateOrganization {
	public ValidateOrganization(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	public String ValidateOrgDetails(WebDriver driver)
	{
		String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Organization Name\"]")).getText();
//		if(actData.contains(orgName))
//		{
//			System.out.println("Organisation "+orgName+" is created successfully");
//		}
//		else
//		{
//			System.out.println("Organisation "+orgName+" is not created");
//		}
		
		return actData;
	}

}
