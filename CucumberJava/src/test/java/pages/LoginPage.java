package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Base;
import locators.LoginPageLocator;

public class LoginPage extends Base{

	LoginPageLocator lp = new LoginPageLocator();

	public LoginPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,15);
		PageFactory.initElements(factory, lp);
	}

	public void doLogin(String username,String password) {
		lp.userName.sendKeys(username);
		lp.password.sendKeys(password);
	}

	public WebElement getLoginBtn() {
		return lp.loginButton;
	}

	public String successLoginAlert() {
		return lp.successLoginMsg.getText();
	}
	
	public String errorLoginAlert() {
		return lp.badCredential.getText();
	}

}
