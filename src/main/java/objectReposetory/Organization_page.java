package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_page 
{
	
public Organization_page(WebDriver driver) 
{ 
	PageFactory.initElements(driver,this);
	}

@FindBy(xpath = "//img[@title=\"Create Organization...\"]")
private WebElement CreateOrganizationButton;

public WebElement getCreateOrganizationButton() {
	return CreateOrganizationButton;
}


}
