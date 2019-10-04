package jazeera.jazeera.pages;

import org.openqa.selenium.support.ui.Select;

import jazeera.jazeera.common.CommonMethod;



public class Contactdetails extends  CommonMethod{


	public Contactdetails()
	{
		
	}
	public Contactdetails Title()
	{
		Select s=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[24]"));
		s.selectByVisibleText("Ms");
		
		return this;
	}
	public Contactdetails Fname()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[26]").sendKeys("akal");;
		return this;
	}
	public Contactdetails Lname()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[28]").sendKeys("b");;
		return this;
	}
	public Contactdetails Country()
	{
		Select s=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[31]"));
		s.selectByVisibleText("Albania");
		return this;
	}
	public Contactdetails CountryCode()
	{
		Select s=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[33]"));
	
		s.selectByVisibleText("Albania(355)");
		return this;
	}
	public Contactdetails Mobile()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[35]").sendKeys("123456789");;
		return this;
	}
	public Contactdetails Email()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[37]").sendKeys("akal@gmail.com");;
		return this;
	}
	public CommonMethod click()
	{
		driver.findElementByXPath("//a[@id='CONTROLGROUPCONTACT_ButtonSubmit']").click();
		return new CommonMethod();
	}
}

