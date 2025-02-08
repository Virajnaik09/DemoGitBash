package objectReposetory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsLookupImg_Page 
{
	public ContactsLookupImg_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	private WebElement FirstNameTextField;
	
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	private WebElement LastNameTextFielc;
	
	@FindBy(xpath = "//img[@alt=\"Select\"]")
	private WebElement AddOrganizationButton;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement SaveButton;
	
	
	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextFielc() {
		return LastNameTextFielc;
	}

	public WebElement getAddOrganizationButton() {
		return AddOrganizationButton;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void EnterFirstAndLastNameToContacts(String FirstName,String LastName)
	{
		FirstNameTextField.sendKeys(FirstName);
		LastNameTextFielc.sendKeys(LastName);
	}
	
	public void AddOrgToContacts(WebDriver driver, String orgName)
	{
		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
	}
}
