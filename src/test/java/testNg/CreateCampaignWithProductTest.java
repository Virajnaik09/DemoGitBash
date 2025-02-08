package testNg;
import org.testng.Assert;
import org.testng.annotations.Test;

import ganeric_utility.BaseClass;
import ganeric_utility.Excel_utility;
import ganeric_utility.Java_utility;
import ganeric_utility.Webdriver_Utility;
import objectReposetory.CampaignLookup_Page;
import objectReposetory.Campaign_Page;
import objectReposetory.HomePage;
import objectReposetory.ProductsLookup_Page;
import objectReposetory.Products_page;
import objectReposetory.ValidateCampaign;


public class CreateCampaignWithProductTest extends BaseClass{
	
	@Test(groups = "regressionTest")
	public void createCampaignWithProductTest()throws Throwable 
	{   Webdriver_Utility wlib = new Webdriver_Utility();
		HomePage home = new HomePage(driver);
		home.getProductsButton().click();
		Products_page product = new Products_page(driver);
		product.clickCreateProductsButton();
		Java_utility jlib = new Java_utility();
		int ranNum = jlib.getRandomNumber();
		Excel_utility elib = new Excel_utility();
		String productName = elib.getExcelData("product", 0, 0) +ranNum;
		ProductsLookup_Page prdlook = new ProductsLookup_Page(driver);
		prdlook.EnterProductName(productName);
		prdlook.clickSaveButton();
		home.getMoreButton().click();
		home.getCampaignButton().click();
		Campaign_Page cmp = new Campaign_Page(driver);
		cmp.ClickCreateCampaignButton();
		CampaignLookup_Page cmpLook = new CampaignLookup_Page(driver);
		String cmpName = elib.getExcelData("campaign", 0, 0) +ranNum;
        cmpLook.EnterCampaignName(cmpName);
		cmpLook.ClickAddProductLookupImg();
		wlib.SwitchWindow(driver, "Products&action");
		cmpLook.SearchProductTextField(productName);
		cmpLook.SelectProduct(driver, productName);
		wlib.SwitchWindow(driver, "Campaigns&action");
		cmpLook.ClickSaveButton();
		ValidateCampaign validate = new ValidateCampaign(driver);
		String actData = validate.ValidateCampaignDetails(driver);
		Assert.assertEquals(actData, cmpName);
		System.out.println("Campaign validated");
	}

}

