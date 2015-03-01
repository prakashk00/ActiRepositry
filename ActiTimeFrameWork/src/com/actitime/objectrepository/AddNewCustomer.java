package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer {
	
	@FindBy(name="name")
	private WebElement customerNameEdt;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement createcustomerBtn;

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getCreatecustomerBtn() {
		return createcustomerBtn;
	}
	
	
	
}
