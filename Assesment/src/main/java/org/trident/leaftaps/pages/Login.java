package org.trident.leaftaps.pages;

//import org.testng.annotations.Test;
import org.trident.leaftaps.common.CommonMethod;

public class Login extends CommonMethod {
	//userName
	public Login EnterUsername() {
	driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
	return this;
	}
	//password
	public Login EnterPassword() {
		
	driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
	return this;
	}
	//clicklogin
	public Incident ClickLogin() {
		
	driver.findElementByXPath("//button[@id='sysverb_login']").click();
	return new Incident();
	}

}

