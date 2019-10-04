package jazeera.jazeera.common;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

	public class CommonMethod {
		public static ChromeDriver driver;
		public static String date;
		public static WebElement NextPage;
		public static WebElement search;
		@BeforeMethod
		public void AccessToCommon() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abalasubramanian\\\\Desktop\\\\eclipse\\\\selenium\\\\driver\\\\driver2\\\\chromedriver.exe");
				driver = new ChromeDriver();
			driver.get("https://ci.jazeeraairways.com/Ugrade4.3.0.111151/Search.aspx");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
	}
		@AfterMethod
		public void close()
		{
			driver.close();
		}
		
	

}
