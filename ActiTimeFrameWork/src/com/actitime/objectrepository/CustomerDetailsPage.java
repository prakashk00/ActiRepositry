package com.actitime.objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'ted customer:')]/following-sibling::td/span")
	private WebElement customerNameText;

	public WebElement getCustomerNameText() {
		return customerNameText;
	}
	

}
