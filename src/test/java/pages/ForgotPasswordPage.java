package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ForgotPasswordPage  {
	
	@FindBy(xpath="//input[@name='emailadd_recovery']")
	WebElement emailaddrecoveryTextBox;
	
	
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//input[@name='rest']")
	WebElement restButton;
	
	
	

}
