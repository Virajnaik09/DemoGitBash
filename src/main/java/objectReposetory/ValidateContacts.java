package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateContacts 
{
	public ValidateContacts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyContactsName(WebDriver driver)
	{
		String actlname = driver.findElement(By.xpath("//span[@id=\"dtlview_Last Name\"]")).getText();	
		//	    System.out.println(orgName);
//		if(actlname.contains(lastname))
//		{
//			System.out.println("Contact "+lastname+" is created successfully");
//		}
//		else
//		{
//			System.out.println("Contact "+lastname+" is not created");
//		}
		return actlname;
	}
	
	public String Verify_IfTheOrgNameIsAddedToContacts(WebDriver driver)
	{
		String actlOrgName = driver.findElement(By.xpath("//td[@id=\"mouseArea_Organization Name\"]/a")).getText();
	      //System.out.println(actOrgName);
//			if(actOrgName.contains(orgName))
//			{
//				System.out.println("Organization "+orgName+" is added successfully in the contact " +lastname);
//			}
//			else
//			{
//				System.out.println("Organisation "+orgName+" not added in the contact "+lastname);
//			}
		return actlOrgName;
	}

}
