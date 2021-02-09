package F.Flipkart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class TestBase {

	public  static WebDriver driver;
		
	@BeforeClass
        public  void initialization()
        {
     
		System.setProperty("webdriver.chrome.driver", "C://Users//Amol//Desktop//ch//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

        }
	
}

