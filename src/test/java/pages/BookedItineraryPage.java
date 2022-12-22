package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BookedItineraryPage  {
	
	@FindBy(xpath="//input[@name='ids[]']")
	WebElement idCheckBox;
	
	
	@FindBy(xpath="//input[@name='order_id_text']")
	WebElement orderidtextBox;
	
	
	
	@FindBy(xpath="//input[@name='cancelall']")
	WebElement cancelallButton;
	
	@FindBy(xpath="//input[@name='search_hotel']")
	WebElement searchhotelButton;
	
	@FindBy(xpath="//input[@name='logout']")
	WebElement logoutButton;
	
	
	
}
