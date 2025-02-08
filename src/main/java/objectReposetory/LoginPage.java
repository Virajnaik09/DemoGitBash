package objectReposetory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public LoginPage(WebDriver driver) 
{
		PageFactory.initElements(driver ,this);
	}

@FindBy(name = "user_name")
private WebElement UserNameTextField;

@FindBy(name = "user_password")
private WebElement PasswordTextField;

@FindBy(id = "submitButton")
private WebElement LoginButton;

public WebElement getUserNameTextField() {
	return UserNameTextField;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}
public void LoginToApp(String username , String password)
{
	UserNameTextField.sendKeys(username);
	PasswordTextField.sendKeys(password);
	LoginButton.click();
}
}
