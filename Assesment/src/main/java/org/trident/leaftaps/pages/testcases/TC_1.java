package org.trident.leaftaps.pages.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.trident.leaftaps.common.CommonMethod;
import org.trident.leaftaps.pages.Login;

public class TC_1 extends CommonMethod {
	@BeforeClass
	public void setData() {
		ExcelName = "Name";
	}
	@Test(dataProvider="fetchData")
	public void RunTestcases(String Name,String Description) throws Exception
	{
		Login l=new Login();
		l.EnterUsername()
		.EnterPassword()
		.ClickLogin()
		.SearchIncident()
		.ClickCreateNew()
		.GetIncidentNumber()
		.EnterCallerName(Name)
		.EnterDescription(Description)
		.ClickSubmit()
		.SearchIncident()
		.Compare();
	}

}
