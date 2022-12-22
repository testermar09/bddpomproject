package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewUserRegistrationPage  {

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameTextbox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextbox;

	@FindBy(xpath = "//input[@name='re_password']")
	WebElement re_passwordTextbox;

	@FindBy(xpath = "//input[@name='full_name']")
	WebElement full_nameTextbox;

	@FindBy(xpath = "//input[@name='email_add']")
	WebElement email_addTextbox;

	@FindBy(xpath = "//input[@name='captcha']")
	WebElement captchaTextbox;

	@FindBy(xpath = "//input[@name='tnc_box']")
	WebElement tnc_boxTextbox;

	@FindBy(xpath = "//input[@name='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//input[@name='rest']")
	WebElement restButton;
}
