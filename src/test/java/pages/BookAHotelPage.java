package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BookAHotelPage  {
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement first_nameTextBox;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement last_nameTextBox;
	
	@FindBy(xpath="//input[@name='address']")
	WebElement addressTextBox;
	
	@FindBy(xpath="//input[@name='cc_num']")
	WebElement cc_numTextBox;
	
	@FindBy(xpath="//select[@name='cc_type']")
	WebElement cardTypeDropdown;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	WebElement cc_exp_yearDropdown;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	WebElement cc_exp_monthDropdown;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	WebElement cvvTextBox;
	
	@FindBy(xpath="//input[@name='book_now']")
	WebElement book_nowButton;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelButton;
	
	
	
	
	

}
