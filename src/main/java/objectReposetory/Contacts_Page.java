package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_Page {
public Contacts_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//img[@alt=\"Create Contact...\"]")
private WebElement CtreateContactsLookupImg;

public WebElement getCtreateContactsLookupImg() {
	return CtreateContactsLookupImg;
}

public void CreateContactsButton()
{
	CtreateContactsLookupImg.click();
}

}
