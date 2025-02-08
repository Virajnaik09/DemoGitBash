package testNg;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import ganeric_utility.BaseClass;
import ganeric_utility.Excel_utility;
import ganeric_utility.Java_utility;
import objectReposetory.HomePage;
import objectReposetory.ProductsLookup_Page;
import objectReposetory.Products_page;
import objectReposetory.ValidateProducts;

@Listeners(ganeric_utility.ExtentReport.class)
public class CreateProductTest extends BaseClass{
	@Test(groups = "smokeTest",retryAnalyzer = ganeric_utility.RetryImp.class)
	public void createProductTest()throws Throwable 
	{   		
		HomePage home = new HomePage(driver);
		home.getProductsButton().click();;
		Products_page product = new Products_page(driver);
		product.clickCreateProductsButton();
		Java_utility jlib = new Java_utility();
		int ranNum = jlib.getRandomNumber();
		Excel_utility elib = new Excel_utility();
		String productName = elib.getExcelData("product", 0, 0) +ranNum;
		ProductsLookup_Page product1 = new ProductsLookup_Page(driver);
		product1.EnterProductName(productName);
		product1.clickSaveButton();
		ValidateProducts validate = new ValidateProducts(driver);
		String actprdt = validate.ProductVerificationDetails(driver);
		Assert.assertEquals(actprdt, productName);
		System.out.println("Product validated");
	}
}
