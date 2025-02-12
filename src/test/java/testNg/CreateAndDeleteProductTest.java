package testNg;


import org.testng.Assert;
import org.testng.annotations.Test;

import ganeric_utility.BaseClass;
import ganeric_utility.Excel_utility;
import ganeric_utility.Java_utility;
import ganeric_utility.Webdriver_Utility;
import objectReposetory.HomePage;
import objectReposetory.ProductsLookup_Page;
import objectReposetory.Products_page;
import objectReposetory.ValidateProducts;



public class CreateAndDeleteProductTest extends BaseClass {

	@Test(groups = {"smokeTest","regression"})
	public void createAndDeleteProduct() throws Throwable 
	//
	{
		Webdriver_Utility wlib = new Webdriver_Utility();
		HomePage home = new HomePage(driver);
		home.getProductsButton().click();
		Products_page prdct = new Products_page(driver);
		prdct.clickCreateProductsButton();
		Java_utility jlib = new Java_utility();
		int ranNum = jlib.getRandomNumber();
		Excel_utility elib = new Excel_utility();
		String productName = elib.getExcelData("product", 0, 0) + ranNum;
		ProductsLookup_Page prdctLook = new ProductsLookup_Page(driver);
		prdctLook.EnterProductName(productName);
		prdctLook.clickSaveButton();
		ValidateProducts validate = new ValidateProducts(driver);
		String actPrdct = validate.ProductVerificationDetails(driver);
		Assert.assertEquals(actPrdct, productName);
		System.out.println("Product validated");
		home.getProductsButton().click();
		prdct.DeleteProduct(driver, productName);
		wlib.AcceptAlert(driver);
		jlib.JavaSleep(2000);
		wlib.RefreshWindow(driver);
		validate.Verify_IfTheProductIsDeleted(driver, productName);
	}
}
