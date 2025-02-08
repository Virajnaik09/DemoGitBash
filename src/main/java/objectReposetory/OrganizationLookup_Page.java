package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationLookup_Page 
{
	
public OrganizationLookup_Page(WebDriver driver)
{
			PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//input[@name=\"accountname\"]")
private WebElement OrganizationNameTextField;

@FindBy(name = "email1")
private WebElement EmailTextField;

@FindBy(id = "phone")
private WebElement PhoneNumberTextField;

@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
private WebElement SaveButton;

public WebElement getOrganisationNameTextField() {
	return OrganizationNameTextField;
}

public WebElement getEmailTextField() {
	return EmailTextField;
}

public WebElement getPhoneNumberTextField() {
	return PhoneNumberTextField;
}

public WebElement getSaveButton() {
	return SaveButton;
}
public void EnterOrganizationName( String orgname)
{
	OrganizationNameTextField.sendKeys(orgname);
}
public void EnterEmail(String email)
{
	EmailTextField.sendKeys(email);
}
public void EnterNumber(String NUMBER)
{
	PhoneNumberTextField.sendKeys(NUMBER);
}

}
