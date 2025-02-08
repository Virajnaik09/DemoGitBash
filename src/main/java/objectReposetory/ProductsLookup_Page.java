package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsLookup_Page {

	public ProductsLookup_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@name=\"productname\"]")
	private WebElement ProductNameTextField;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement SaveButton;
	
	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getProductNameTextField() {
		return ProductNameTextField;
	}
	
	public void EnterProductName(String ProductName)
	{
		ProductNameTextField.sendKeys(ProductName);
	}
	public void clickSaveButton()
	{
		SaveButton.click();
	}
	
	
}
