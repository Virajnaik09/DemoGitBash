package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign_Page {
	public Campaign_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//img[@title=\"Create Campaign...\"]")
private WebElement CreateCampaignButton;

public WebElement getCreateCampaignButton() {
	return CreateCampaignButton;
}

public void ClickCreateCampaignButton()
{
	CreateCampaignButton.click();
}
}
