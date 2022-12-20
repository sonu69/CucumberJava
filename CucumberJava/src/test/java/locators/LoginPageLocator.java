package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {
	
	@FindBy(css=".login-heading>p") public WebElement loginPageHeader;

	@FindBy(name="userName") public WebElement userName;

	@FindBy(name="password") public WebElement password;

	@FindBy(css=".login") public WebElement loginButton;

	@FindBy(xpath="//mat-error[contains(@id,'mat-error')]") public List<WebElement> errorMsgs;

	@FindBy(xpath="//div[contains(text(),'Bad')]") public WebElement badCredential;

	@FindBy(xpath="//div[contains(text(),'You have successfully logged in')]") public WebElement successLoginMsg;
	
	@FindBy(xpath="//div[containa(@class,'snakbody')]") public WebElement loginAlert;

}
