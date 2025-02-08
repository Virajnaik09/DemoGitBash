package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

 public HomePage(WebDriver driver) {
	 PageFactory.initElements(driver , this);
	}
@FindBy(xpath = "//img[@src=\"themes/softed/images/Home.PNG\"]")
 private WebElement HomeButton;
 
 @FindBys({@FindBy(xpath = "//a[text()='Calendar']"),@FindBy(xpath = "//a[@href=\'index.php?module=Calendar&action=index\']")})
 private WebElement CalenderButton;
 
 @FindBys({@FindBy(xpath = "//a[text()='Organizations']"),@FindBy(xpath = "//a[@href=\"index.php?module=Accounts&action=index\"]")})
 private WebElement OrganizationButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Contacts']"),@FindBy(xpath = "//a[@href=\"index.php?module=Contacts&action=index\"]")})
 private WebElement ContacsButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Opportunities']"),@FindBy(xpath = "//a[@href=\"index.php?module=Potentials&action=index\"]")})
 private WebElement OpportunitiesButton;
 
 @FindAll({@FindBy(xpath = "//a[text()=\"Products\"]"),@FindBy(xpath = "//a[@href=\"index.php?module=Products&action=index\"]")})
 private WebElement ProductsButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Documents']"),@FindBy(xpath = "//a[@href=\"index.php?module=Documents&action=index\"]")})
 private WebElement DocumentsButton;
 
 @FindAll({@FindBy(xpath = "href=\"index.php?module=Emails&action=index\""),@FindBy(xpath = "//a[text()='Email']")})
 private WebElement EmailButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Trouble Tickets']"),@FindBy(xpath = "//a[@href=\"index.php?module=HelpDesk&action=index\"]")})
 private WebElement TroubleTicketsButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Dashboard']"),@FindBy(xpath = "//a[@href=\"index.php?module=Dashboard&action=index\"]")})
 private WebElement DashboardButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='More']"),@FindBy(xpath = "//a[@href=\"javascript:;\"]")})
 private WebElement MoreButton;
 
 @FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
 private WebElement AdministratorButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='My Preferences']"),@FindBy(xpath = "(//a[@class=\"drop_down_usersettings\")[3]]"),@FindBy(xpath = "//a[@id=\"_my_preferences_\"]")})
 private WebElement MyPreferences;
 
 @FindAll({@FindBy(xpath = "//a[text()='Sign Out']"),@FindBy(xpath = "(//a[@class=\"drop_down_usersettings\")[2]]"),@FindBy(xpath = "//a[@href=\"index.php?module=Users&action=Logout\"]")})
 private WebElement LogOutButton;
 
 @FindBy(xpath = "//img[@src=\"themes/softed/images/info.PNG\"]")
 private WebElement InfoButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Help']"),@FindBy(xpath = ("(//a[@class=\"drop_down_usersettings\"])[3]"))})
 private WebElement HelpButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='Feedback']"),@FindBy(xpath = "(//a[@class=\"drop_down_usersettings\"])[4]")})
 private WebElement FeedBackButton;
 
 @FindBy(xpath = "//img[@src=\"themes/softed/images/mainSettings.PNG\"]")
 private WebElement SettingsButton;
 
 @FindAll({@FindBy(xpath = "//a[text()='CRM Settings']"),@FindBy(xpath = "(//a[@class=\"drop_down_usersettings\"])[5]"),@FindBy(xpath = "//a[@href=\"index.php?module=Settings&action=index&parenttab=\"]")})
 private WebElement CRMSettingsButton;
 
 @FindAll({@FindBy(className = "searchBox"),@FindBy(name = "query_string")})
 private WebElement SearchTextField;
 
 @FindBy(name = "Campaigns")
 private WebElement CampaignButton;
 

public WebElement getCampaignButton() {
	return CampaignButton;
}

public WebElement getSearchTextField() {
	return SearchTextField;
}

public WebElement getHomeButton() {
	return HomeButton;
}

public WebElement getCalenderButton() {
	return CalenderButton;
}

public WebElement getOrganizationButton() {
	return OrganizationButton;
}

public WebElement getContacsButton() {
	return ContacsButton;
}

public WebElement getOpportunitiesButton() {
	return OpportunitiesButton;
}

public WebElement getProductsButton() {
	return ProductsButton;
}

public WebElement getDocumentsButton() {
	return DocumentsButton;
}

public WebElement getEmailButton() {
	return EmailButton;
}

public WebElement getTroubleTicketsButton() {
	return TroubleTicketsButton;
}

public WebElement getDashboardButton() {
	return DashboardButton;
}

public WebElement getMoreButton() {
	return MoreButton;
	
}
public WebElement getAdministratorButton() {
	return AdministratorButton;
}

public WebElement getMyPreferences() {
	return MyPreferences;
}

public WebElement getLogOutButton() {
	return LogOutButton;
}

public WebElement getInfoButton() {
	return InfoButton;
}

public WebElement getHelpButton() {
	return HelpButton;
}

public WebElement getFeedBackButton() {
	return FeedBackButton;
}

public WebElement getSettingsButton() {
	return SettingsButton;
}

public WebElement getCRMSettingsButton() {
	return CRMSettingsButton;
}
 
public void logout(WebDriver driver)
{
	AdministratorButton.click();
	LogOutButton.click();
}
//public void ClickHomeButton() 
//{
//	HomeButton.click();
//}
//public void ClickOrganizationButton() 
//{
//	OrganizationButton.click();
//}
//public void ClickContacsButton() 
//{
//	ContacsButton.click();
//}
//public void ClickOpportunitiesButton() 
//{
//	OpportunitiesButton.click();
//}
//public void ClickProductsButton() 
//{
//	ProductsButton.click();
//}
//public void ClickEmailButton() 
//{
//	EmailButton.click();
//}
//public void ClickCalenderButton() 
//{
//	CalenderButton.click();
//}
//public void ClickTroubleTicketsButton() 
//{
//	TroubleTicketsButton.click();
//}
//public void ClickDashboardButton() 
//{
//	DashboardButton.click();
//}
//public void ClickDocumentsButton() 
//{
//	DocumentsButton.click();
//}
//public void ClickMoreButton() 
//{
//	MoreButton.click();
//}
//public void AdministratorButton() 
//{
//	AdministratorButton.click();
//}
//public void MyPreferences() 
//{
//	MyPreferences.click();
//}
//public void LogOutButton() 
//{
//	LogOutButton.click();
//}
//public void InfoButton() 
//{
//	InfoButton.click();
//}
//public void HelpButton() 
//{
//	HelpButton.click();
//}
//public void FeedBackButton() 
//{
//	FeedBackButton.click();
//}
//public void SettingsButton() 
//{
//	SettingsButton.click();
//}
//public void CRMSettingsButton() 
//{
//	CRMSettingsButton.click();
//}
 
}
 

