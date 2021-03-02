package org.pojo;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPagePojoClass extends BaseClass{
	
	public RegistrationPagePojoClass() {
		PageFactory.initElements(driver, this);	
}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnCreateNewAccount;
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;

	@FindBy(name="reg_email__")
	private WebElement mobileNumber;

	@FindBy(name="reg_passwd__")
	private WebElement NewPassword;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")
	private WebElement gender;

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getBtnCreateNewAccount() {
		return btnCreateNewAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getNewPassword() {
		return NewPassword;
	}

	
	
	
	

}
