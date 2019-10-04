package jazeera.jazeera.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import jazeera.jazeera.common.CommonMethod;


public class Date extends CommonMethod{
	public void dateHandling(String Year,String Month,String DDate)  {
		/*driver.findElementByXPath("//td[@class=' ']//a").click();
		System.out.println("date is selected");
	}*/

		try {
			section:
				for(int a=0; a<=50;a++)
			{	
					String year= driver.findElementByXPath("//*[contains(@class,'year')]").getText();
					
			if(year.equals(Year)) {
					String month= driver.findElementByXPath("//span[contains(@class,'month')]").getText();
					
			if(month.equals(Month)) {
					List<WebElement> date = driver.findElementsByXPath("//a[contains(@class,'ui-state-default')]");
					for(int d=0; d<=date.size();d++) {		
						
				if(date.get(d).getText().equals(DDate)) {
					date.get(d).click();
					
				break section;
								}
					}
			}
			else {
				driver.findElementByXPath("(//*[contains(@class,'icon')])[2]").click();
			}
					}
			else {
				driver.findElementByXPath("(//*[contains(@class,'icon')])[2]").click();
			}
			
				}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			num:
			for(int f=0;f<=100;f++) {
				List <WebElement> date = driver.findElementsByXPath("//a[contains(@class,'ui-state-default')]");
				int dte=Integer.parseInt(DDate);
				for(int d=0;d<=date.size();d++) {
					String dDte =date.get(d).getText();
					int ddTe= Integer.parseInt(dDte);
					if(dte<ddTe) {
						date.get(d).click();
						break num;
				}
				
				}
			}
		}
				}
}

