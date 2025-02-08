package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignLookup_Page {
 public CampaignLookup_Page(WebDriver driver) 
 {
	PageFactory.initElements( driver,this);
}
 @FindBy(xpath = "//input[@name=\"campaignname\"]")
 private WebElement CampaignNameTextField;
 
 @FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
 private WebElement SaveButton;
 
 @FindBy(xpath = "//img[@alt=\"Select\"]")
 private WebElement AddProductLookupImg;
 
 @FindBy(xpath = "//input[@name=\"search_text\"]")
 private WebElement ProductSearchTextField;
 
 
public WebElement getAddProductLookupImg() {
	return AddProductLookupImg;
}
public WebElement getProductSearchTextField() {
	return ProductSearchTextField;
}
//public WebElement getSelectProduct() {
//	return SelectProduct;
//}
public WebElement getSaveButton() {
	return SaveButton;
}
public WebElement getCampaignNameTextField() {
	return CampaignNameTextField;
}
 public void EnterCampaignName(String cmpName)
 {
	 CampaignNameTextField.sendKeys(cmpName);
 }
 public void ClickSaveButton()
 {
	 SaveButton.click();
 }
 public void ClickAddProductLookupImg()
 {
	 AddProductLookupImg.click();
 }
 public void SearchProductTextField(String PrdctName)
 {
	 ProductSearchTextField.sendKeys(PrdctName,Keys.ENTER);
 }
 public void SelectProduct(WebDriver driver, String productName)
 {
		driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
 }

}
