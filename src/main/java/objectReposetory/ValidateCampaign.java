package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateCampaign 
{
	public ValidateCampaign(WebDriver driver)
    {
		PageFactory.initElements(driver,this);
	}
	
    public String ValidateCampaignDetails(WebDriver driver)
    {
    	String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();
//		if(actData.equals(cmpName))
//		{
//			System.out.println("Campaign "+cmpName+" is created successfully");
//		}
//		else
//		{
//			System.out.println("campaign "+cmpName+" is not created");
//		}
		return actData;

    }
    public String ValidateProductAddedToCmp(WebDriver driver)
    {
    	String actPrdt = driver.findElement(By.xpath("//span[@id=\"dtlview_Product\"]")).getText();
//		if(actPrdt.contains(productName))
//		{
//			System.out.println("product "+productName+" is created successfully in the campaign "+cmpName);
//		}
//		else
//		{
//			System.out.println("product "+productName+" is not created in the campaign "+cmpName);
//		}
		return actPrdt;

    }
}
