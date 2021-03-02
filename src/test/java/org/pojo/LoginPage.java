package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="email")
	private WebElement TextUsername;
	
	@FindBy(id="pass")
	private WebElement TextPassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTextUsername() {
		return TextUsername;
	}

	public WebElement getTextPassword() {
		return TextPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
