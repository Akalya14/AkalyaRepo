package org.trident.leaftaps.common;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.trident.leaftaps.utils.DataLibrary;
public class  CommonMethod{
	public static ChromeDriver driver;
	public static String id1="";
	public static String ExcelName;
	@BeforeMethod
	//launching browser
	public void LaunchUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\abalasubramanian\\\\Desktop\\\\eclipse\\\\selenium\\\\driver\\\\driver2\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev77567.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] dataCentre() throws IOException {
		String[][] data = DataLibrary.readExcel(ExcelName);
		return data;
	}
}


