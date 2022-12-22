package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage {
	
	@FindBy(xpath="//input[@name='current_pass']")
	WebElement current_passTextbox;
	
	@FindBy(xpath="//input[@name='new_password']")
	WebElement new_passwordTextbox;
	
	@FindBy(xpath="//input[@name='re_password']")
	WebElement re_passwordTextbox;
	
	@FindBy(xpath="//input[@name='change_password_Submit']")
	WebElement  change_password_SubmitButton;
	
	
	
	


}
