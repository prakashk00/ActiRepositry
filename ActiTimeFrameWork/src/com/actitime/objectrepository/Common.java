package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	
	@FindBy(xpath="//img[@alt='Logout']")
	private WebElement logoutImg;

	public WebElement getLogoutImg() {
		return logoutImg;
	}
	
	

}
