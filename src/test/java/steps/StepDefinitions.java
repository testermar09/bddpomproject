package steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class StepDefinitions  {

	public WebDriver driver;
	
	public FileInputStream fis1;
	
	public Properties configProp=new Properties();
	
	
	LoginPage loginPage;
	

	@Before
	public void setUp()
	{
		
		try {
			fis1=new FileInputStream("src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			configProp.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String browserName=configProp.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		driver.get(configProp.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Long.parseLong(configProp.getProperty("implicitWaitTime")), TimeUnit.SECONDS);
		
	}
	
	@After
	public void teardown()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
		
	}
	
	
	
	
	

	@Given("user is on LoginPage")
	public void user_is_on_login_page() {

		loginPage = new LoginPage(driver);
	}

	@When("user enters text in textbox in LoginPage")
	public void user_enters_text_int_textbox(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<Map<String, String>> listOfMaps = dataTable.asMaps();

		System.out.println(listOfMaps.size());

		System.out.println(listOfMaps.get(0).get("objectName"));
		System.out.println(listOfMaps.get(0).get("text"));

		if (listOfMaps.get(0).get("objectName").equalsIgnoreCase("usernameTextBox")) {
			loginPage.usernameTextBox.sendKeys(listOfMaps.get(0).get("text"));
		} else if (listOfMaps.get(0).get("objectName").equalsIgnoreCase("passwordTextBox")) {
			loginPage.passwordTextBox.sendKeys(listOfMaps.get(0).get("text"));
		}

		// driver.findElement(By.xpath(null)).sendKeys(listOfMaps.get(0).get("text"));

	}

	@When("user clicks on button in LoginPage")
	public void user_clicks_on_button_in_login_page(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		
		List<Map<String, String>> listOfMaps = dataTable.asMaps();
		
		if (listOfMaps.get(0).get("objectName").equalsIgnoreCase("loginButton"))
		{
			loginPage.loginButton.click();
		}
		
	}

}
