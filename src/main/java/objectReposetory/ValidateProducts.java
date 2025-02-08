package objectReposetory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ValidateProducts {
	public ValidateProducts(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public String ProductVerificationDetails(WebDriver driver)
	{
		String actlPrdt = driver.findElement(By.xpath("//span[@id=\"dtlview_Product Name\"]")).getText();
//		if(prdt.contains(productName))
//		{
//			System.out.println("Products "+productName+" is created succesfully");
//		}
//		else
//		{
//			System.out.println("Products "+productName+" is not created");
//		}
		return actlPrdt;
	}
	
	
	public void Verify_IfTheProductIsDeleted(WebDriver driver,String productName )
	{
		boolean flag = false;
		List<WebElement> productList = driver.findElements(By.xpath("(//table[@class=\"lvt small\"]/tbody/tr/td[3])[position()>1]"));
		for(WebElement product : productList)
		{
			String prdctName = product.getText();
			//System.out.println(prdctName);
			if(productName.equals(prdctName))
			{

				flag = true;
				break;
			}

		}
		if(flag == false)
		{
			System.out.println(productName+ " Product Deleted");
		}
		else
		{
			System.out.println(productName+ " Product not Deleted");
		}
	}
}

