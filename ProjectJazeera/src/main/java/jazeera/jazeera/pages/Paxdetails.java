package jazeera.jazeera.pages;

import org.openqa.selenium.support.ui.Select;

import jazeera.jazeera.common.CommonMethod;



public class Paxdetails  extends CommonMethod {
	public Paxdetails() {
	}
	public Paxdetails SelectMr()
	{
		Select mr=new Select(driver.findElementByXPath("//select[@class='select-mr-mrs']"));

		mr.selectByVisibleText("Ms");
		return this;
	}
		
	public Paxdetails  Fname() {
	
	driver.findElementByXPath("(//input[contains(@id,'CONTROLGROUPCONTACT')])[1]").sendKeys("akal");
	return this;
	}
	public Paxdetails lname() {
	driver.findElementByXPath("(//input[contains(@id,'CONTROLGROUPCONTACT')])[2]").sendKeys("b");
	return this;
	}
	public Paxdetails Gender1()
	{
		Select s=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[8]"));
		s.selectByIndex(1);
		return this;
	}
	public Paxdetails Adult2Mr()
	{
		Select mr1=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[10]"));
		mr1.selectByVisibleText("Mr");
		return this;
	}
	public Paxdetails  Adult2fname ()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[12]").sendKeys("gayu");
		return this;
	}
	public  Paxdetails Adult2Lname  ()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[14]").sendKeys("v");
		return this;
	}
	public Paxdetails Gender2()
	{
		Select s=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[16]"));
		s.selectByIndex(1);
		return this;
	}
	public Paxdetails ChildMr()
	{
		Select mr=new Select(driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[18]"));
		mr.selectByVisibleText("Miss");
		return this;
	}
	public Paxdetails ChildFname()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[20]").sendKeys("abi");
		return this;
	}
	public Contactdetails ChildLname()
	{
		driver.findElementByXPath("(//*[contains(@id,'CONTROLGROUPCONTACT')])[22]").sendKeys("s");
		return new Contactdetails();
	}
	
	
}
