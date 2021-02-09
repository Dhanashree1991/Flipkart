package F.Flipkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
	
	public  WebDriver driver;
	
//	@FindBy(xpath = "//*[contains(text(), 'Login & Signup')]")
//	WebElement Login;
//	
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement email;

	@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement LoginButton;
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);	
	}
	
     	
		public void LoginApp() 
		{
			
			email.sendKeys("7620366935");
			Password.sendKeys("Priti@2015");
			LoginButton.click();
		}
			
	
}
