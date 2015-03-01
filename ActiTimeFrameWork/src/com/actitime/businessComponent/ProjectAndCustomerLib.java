package com.actitime.businessComponent;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericLib.Driver;
import com.actitime.genericLib.WebDriverCommomUtill;
import com.actitime.objectrepository.ActiveProjectsAndCustomers;
import com.actitime.objectrepository.AddNewCustomer;
import com.actitime.objectrepository.Common;
import com.actitime.objectrepository.Login;
import com.actitime.objectrepository.OpenTasks;

public class ProjectAndCustomerLib extends WebDriverCommomUtill{
	
	
	Login loginPage = PageFactory.initElements(Driver.driver, Login.class);
	OpenTasks openTaskPage = PageFactory.initElements(Driver.driver, OpenTasks.class);
	ActiveProjectsAndCustomers activeProAndCustPage = PageFactory.initElements(Driver.driver, ActiveProjectsAndCustomers.class);
	AddNewCustomer addNewCustPage= PageFactory.initElements(Driver.driver, AddNewCustomer.class);
	Common commonPage = PageFactory.initElements(Driver.driver, Common.class);
	
	
	public void loginToAPP(String username , String password){
	
		Driver.driver.get("http://prakash-pc/login.do");
		System.out.println("application is launched ="+Driver.driver.getCurrentUrl());
		loginPage.getUserNameEdt().sendKeys(username);
		loginPage.getPasswordEdt().sendKeys(password);
		loginPage.getLoginBtn().click();
		waitForPageToLoad();
		System.out.println("login is sucess");
	}
	
	public WebElement getUserNameEdt() {
		return loginPage.getUserNameEdt();
	}

	public WebElement getPasswordEdt() {
		return loginPage.getPasswordEdt();
	}

	public WebElement getProjectAndCustomerLnk() {
		return openTaskPage.getProjectAndCustomerLnk();
	}

	public WebElement getCompletedTaskLnk() {
		return openTaskPage.getCompletedTaskLnk();
	}

	public WebElement getAddNewCustomerBtn() {
		return activeProAndCustPage.getAddNewCustomerBtn();
	}

	public WebElement getAddNewProjectBtn() {
		return activeProAndCustPage.getAddNewProjectBtn();
	}

	public WebElement getCustomerNameEdt() {
		return addNewCustPage.getCustomerNameEdt();
	}

	public WebElement getCreatecustomerBtn() {
		return addNewCustPage.getCreatecustomerBtn();
	}

	public WebElement getLogoutImg() {
		return commonPage.getLogoutImg();
	}

	public Login getLoginPage() {
		return loginPage;
	}

	public OpenTasks getOpenTaskPage() {
		return openTaskPage;
	}

	public ActiveProjectsAndCustomers getActiveProAndCustPage() {
		return activeProAndCustPage;
	}

	public AddNewCustomer getAddNewCustPage() {
		return addNewCustPage;
	}

	public Common getCommonPage() {
		return commonPage;
	}

	public void navigteToProjectAndCustomerPage(){
		System.out.println("naviagte to ProjectAndCustomerPage");
		openTaskPage.getProjectAndCustomerLnk().click();
		waitForPageToLoad();
	}
	
	public void createCustomer(String customerName){
		System.out.println(" createCustomer "+ customerName);
		activeProAndCustPage.getAddNewCustomerBtn().click();
		waitForPageToLoad();
		addNewCustPage.getCustomerNameEdt().sendKeys(customerName);
		addNewCustPage.getCreatecustomerBtn().click();
		waitForPageToLoad();
		System.out.println(customerName + "= is sucessfully  created");
	}
	
	public void logOut(){
		commonPage.getLogoutImg().click();
		System.out.println("logout from the APP");
	}
	

}
