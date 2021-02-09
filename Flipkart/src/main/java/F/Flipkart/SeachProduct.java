package F.Flipkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeachProduct extends TestBase{
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//input[@type='text' and @class='LM6RPg']")
	WebElement Search;
	
	
	@FindBy(xpath="//a[contains(@title,'Realme C2 (Diamond Black, 32 GB)')]")
	WebElement clickOnProduct;
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement AddToCart;
	
	
	public SeachProduct(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void SearchingProduct()
	{
		Search.sendKeys("Realme c2");
		Search.sendKeys(Keys.ENTER);
		
	}
	

	
	public void clickOnProduct()
	{
		clickOnProduct.click();
		
		
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
		String childWindow=itr.next();
		// Compare whether the main windows is not equal to child window. If not equal, we will close.
		if(!mainWindow.equals(childWindow)){
		driver.switchTo().window(childWindow);
		//System.out.println(driver.switchTo().window(childWindow).getTitle());
		//driver.close();
		}
		}
				
	}	
	
	
	public void addtocart()
	{
		AddToCart.click();
	}
	
	

}
