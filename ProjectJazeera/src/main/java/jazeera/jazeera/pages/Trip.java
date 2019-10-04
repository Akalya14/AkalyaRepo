package jazeera.jazeera.pages;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import jazeera.jazeera.common.CommonMethod;



public class Trip  extends CommonMethod{
	public Trip TripSelect(String tr) throws InterruptedException
	{
		switch(tr)
		{
		case "one":
			driver.findElementByXPath("//input[@class='radio'][2]").click();
			WebElement Click1 = driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStationText1']");
			Click1.click();
			Click1.sendKeys("HBE");
			driver.findElementByXPath("//p[@id='source_HBE']").click();

			WebElement Click2 = driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStationText1']");
			Click2.click();
			Click2.sendKeys("COK");
			driver.findElementByXPath("//p[@id='dest_COK']").click();
			WebElement adult=driver.findElementByXPath("//select[@class='guests'][1]");
			Select ss =new Select(adult);
			ss.selectByIndex(1);
			WebElement child=driver.findElementByXPath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']");
			Select cc =new Select(child);
			cc.selectByIndex(1);
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketDate1']").click();
			Thread.sleep(3000); 
			Date d=new  Date();
			d.dateHandling("2019","October","11");


			break;
		case "round":
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']").click();
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStationText1']").click();
			driver.findElementByXPath("//p[@id='source_HBE']").click();
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStationText1']").click();

			driver.findElementByXPath("//p[@id='dest_COK']").click();
			WebElement adult1=driver.findElementByXPath("//select[@class='guests'][1]");
			Select ss1 =new Select(adult1);
			ss1.selectByIndex(2);
			WebElement child1=driver.findElementByXPath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']");
			Select cc1 =new Select(child1);
			cc1.selectByIndex(2);
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_TextBoxMarketDate1']").click();
			Thread.sleep(3000); 
			Date d1=new  Date();
			d1.dateHandling("2019","October","4");
			driver.findElementByXPath("input[@name='ControlGroupSearchView$AvailabilitySearchInputSearchView$TextBoxMarketDate2']").click();

			d1.dateHandling("2019","October","7");
			driver.findElementByXPath("//a[@id='ControlGroupSearchView_LinkButtonSubmit']").click();
			break;
		case "Multi":
			driver.findElementByXPath("(//*[contains(@id,'ControlGroupSearchView')])[3]").click();
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStationText1']").click();
			driver.findElementByXPath("//p[@id='source_HBE']").click();
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStationText1']").click();

			driver.findElementByXPath("//p[@id='dest_COK']").click();
			Thread.sleep(3000); 
			Date d11=new  Date();
			d11.dateHandling("2019","October","4");
			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStationText1']").click();
			driver.findElementByXPath("//p[@id='source_COK']").click();

			driver.findElementByXPath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStationText1']").click();
			driver.findElementByXPath("//p[@id='dest_CAI']").click();
			d11.dateHandling("2019","October","7");
			WebElement adult11=driver.findElementByXPath("//select[@class='guests'][1]");
			Select ss11 =new Select(adult11);
			ss11.selectByIndex(2);
			WebElement child11=driver.findElementByXPath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']");
			Select cc11 =new Select(child11);
			cc11.selectByIndex(2);
			driver.findElementByXPath("//a[@id='ControlGroupSearchView_LinkButtonSubmit']").click();
			break;

		}

		return this;
	}
	public Trip ClickSearch()
	{

		 search = driver.findElementByXPath("//a[@id='ControlGroupSearchView_LinkButtonSubmit']");
		search.click();
		return this;
	}
	
	public  Trip VerifySearchFlight()
	{

		NextPage=driver.findElementByXPath("(//*[contains(text(),'Select Flight')])[3]");
		try {
			if(NextPage.isEnabled())
			{
				System.out.println("Search flight page is displayed");
			}

			else
			{
				System.err.println("Search flight page is  not  displayed");
			}
		} 
		catch (ElementNotVisibleException e) 
		{

			e.printStackTrace();
		}
		return this;
	}

	public Paxdetails SearchFlight()
	{
		driver.findElementByXPath("(//*[contains(@id,'ControlGroupSelectView')])[2]").click();
		driver.findElementByXPath("//a[@id='ControlGroupSelectView_ButtonSubmit']").click();

		return new Paxdetails (); 
	}

}

