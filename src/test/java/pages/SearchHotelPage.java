package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage  {

	
	@FindBy(xpath = "//select[@name='location']")
	WebElement locationDropdown;

	@FindBy(xpath = "//select[@name='hotels']")
	WebElement hotelsDropdown;

	@FindBy(xpath = "//select[@name='room_type']")
	WebElement roomTypeDropdown;

	@FindBy(xpath = "//select[@name='room_nos']")
	WebElement noOfRoomsDropdown;

	@FindBy(xpath = "//select[@name='adult_room']")
	WebElement noOfAdultsDropdown;

	@FindBy(xpath = "//select[@name='child_room']")
	WebElement noOfChildrenDropdown;

	@FindBy(xpath = "//input[@name='datepick_in']")
	WebElement checkInDateTextbox;

	@FindBy(xpath = "//input[@name='datepick_out']")
	WebElement checkOutDateTextbox;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement searchButton;
	
	@FindBy(xpath="//span[@id='checkin_span']")
	WebElement checkInDateError;
	
	@FindBy(xpath="//span[@id='checkout_span']")
	WebElement checkOutDateError;


}