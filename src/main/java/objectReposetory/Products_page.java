package objectReposetory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_page {
 public Products_page(WebDriver driver)
 {
	 PageFactory.initElements( driver,this);
 }
 @FindBy(xpath = "//img[@title=\"Create Product...\"]")
 private WebElement CreateProductsButton;
 
public WebElement getCreateProductsButton() {
	return CreateProductsButton;
}

public void clickCreateProductsButton()
{
	CreateProductsButton.click();
}
 public void DeleteProduct(WebDriver driver,String productName) throws Throwable
 {
	 driver.findElement(By.xpath("//table[@class=\"lvt small\"]//a[text()='"+productName+"']/../preceding-sibling::td//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Delete\"])[1]")).click();
		Thread.sleep(1000);
 }
 
 
 
}
