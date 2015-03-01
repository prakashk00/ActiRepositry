package com.actitime.objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectsAndCustomers {
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerBtn;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectBtn;

	public WebElement getAddNewCustomerBtn() {
		return addNewCustomerBtn;
	}

	public WebElement getAddNewProjectBtn() {
		return addNewProjectBtn;
	}

}
