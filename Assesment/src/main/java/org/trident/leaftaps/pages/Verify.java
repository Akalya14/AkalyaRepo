package org.trident.leaftaps.pages;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.Keys;
import org.trident.leaftaps.common.CommonMethod;

public class Verify extends CommonMethod {
	public Verify SearchIncident()

	{
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(id1+Keys.ENTER);
		return this;

	}
	public void Compare() throws Exception
	{
		Thread.sleep(4000);
		String id2 = driver.findElementByXPath("(//*[@class='linked formlink'])").getText();
		System.out.println(id2);

		try {
			if(id1.equals(id2))
			{
				System.out.println("Completed");
			}
			else

			{
				System.out.println("Not completed");
			}
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.out.println("Not found");
		}
	}
}
