package org.trident.leaftaps.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
///import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
import org.trident.leaftaps.common.CommonMethod;

public class Incident extends CommonMethod  {


	public Incident SearchIncident() {
		driver.findElementByXPath("//input[@id='filter']").sendKeys("Incident");
		return this;
	}
	public Incident ClickCreateNew() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
		Thread.sleep(3000);
		return this;
	}
	public Incident GetIncidentNumber() throws InterruptedException
	{
		driver.switchTo().frame(0);
		id1 = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println("Generated ID: "+id1);
		Thread.sleep(3000);
		return this;
	}
	public Incident EnterCallerName(String Name) throws InterruptedException
	{
		Thread.sleep(5000);

		WebElement find = driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']");
		find.click();
		find.sendKeys(Name);

		Thread.sleep(5000);

		return this;
	}
	public Incident EnterDescription(String Description)
	{

		driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys(Description);
		return this;
	}

	public Verify ClickSubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement submit = driver.findElementByXPath("(//button[@id='sysverb_insert'])[1]");
		submit.click();
		Thread.sleep(3000);
		return new Verify();
	}

}
