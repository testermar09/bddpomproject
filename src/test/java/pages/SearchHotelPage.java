package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage  {
	
	WebDriver driver;
	
	public SearchHotelPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath = "//select[@name='location']")
	public WebElement locationDropdown;

	@FindBy(xpath = "//select[@name='hotels']")
	public WebElement hotelsDropdown;

	@FindBy(xpath = "//select[@name='room_type']")
	public WebElement roomTypeDropdown;

	@FindBy(xpath = "//select[@name='room_nos']")
	public WebElement noOfRoomsDropdown;

	@FindBy(xpath = "//select[@name='adult_room']")
	public WebElement noOfAdultsDropdown;

	@FindBy(xpath = "//select[@name='child_room']")
	public WebElement noOfChildrenDropdown;

	@FindBy(xpath = "//input[@name='datepick_in']")
	public WebElement checkInDateTextbox;

	@FindBy(xpath = "//input[@name='datepick_out']")
	public WebElement checkOutDateTextbox;
	
	@FindBy(xpath="//input[@name='Submit']")
	public WebElement searchButton;
	
	@FindBy(xpath="//span[@id='checkin_span']")
	public WebElement checkInDateError;
	
	@FindBy(xpath="//span[@id='checkout_span']")
	public WebElement checkOutDateError;


}