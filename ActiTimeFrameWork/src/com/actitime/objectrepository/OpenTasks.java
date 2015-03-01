package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomerLnk;
	
	@FindBy(linkText="Completed Tasks")
	private WebElement completedTaskLnk;

	public WebElement getProjectAndCustomerLnk() {
		return projectAndCustomerLnk;
	}

	public WebElement getCompletedTaskLnk() {
		return completedTaskLnk;
	}


}
