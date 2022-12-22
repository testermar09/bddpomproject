package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage  {
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	WebElement radioButton;
	
	
	@FindBy(xpath="//input[@name='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelButton;
	
	
	

}
