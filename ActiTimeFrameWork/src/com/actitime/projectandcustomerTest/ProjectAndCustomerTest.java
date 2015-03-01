package com.actitime.projectandcustomerTest;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.businessComponent.ProjectAndCustomerLib;
import com.actitime.genericLib.Driver;
import com.actitime.genericLib.ExcelLib;
import com.actitime.genericLib.ReportLib;
import com.actitime.genericLib.WebDriverCommomUtill;
import com.actitime.objectrepository.CustomerDetailsPage;


public class ProjectAndCustomerTest {
	

	//object deceleration
	
ExcelLib eLib;
    
WebDriverCommomUtill wLib;
    
ProjectAndCustomerLib bLib;
    
CustomerDetailsPage customerdetailsPage;
ReportLib rLib ;
static String userName;
static String password;
	
	
@BeforeClass
	
public void configBeforeClass() throws InvalidFormatException, IOException{
		
		
System.out.println("execute ProjectAndCustomerTest test case");
		 
// object initialization
		 
eLib = new ExcelLib();
		 
wLib = new WebDriverCommomUtill();
		 
bLib = new ProjectAndCustomerLib();
		 
customerdetailsPage = PageFactory.initElements(Driver.driver, CustomerDetailsPage.class);

rLib = new ReportLib();
 userName= eLib.getExcelData("Sheet1" , 1 , 2);
 password= eLib.getExcelData("Sheet1" , 1 , 3);
		 		
	}
	
	 
	 @BeforeMethod
	 public void configBeforeMtd() throws InvalidFormatException, IOException{
	     // get test data from excel
		try{
		
		
		 
		 //step 1 : login to APP
		 bLib.loginToAPP(userName, password);
		 
		 //step 2: navigate ProjetAndCustomer Page
		 bLib.navigteToProjectAndCustomerPage();
		}catch(Throwable t){
			System.out.println(" Failed" + Driver.driver.getTitle());
			rLib.takeScreenShot(Driver.driver.getTitle());
			 Driver.driver.close();
			 bLib.loginToAPP(userName, password);
			
		}
	 }
	
	 @Test
	  public void createCustomer() throws InterruptedException, InvalidFormatException, IOException{
		
		 try{
		 String customerName= eLib.getExcelData("Sheet1" , 1 , 4);
		 
		 //step 3: create Customer
		 bLib.createCustomer(customerName);
		 
		 
		 //step 4: verify customer
		 Driver.driver.findElement(By.linkText(customerName)).click();
		 
		 String actCustomerNAme = customerdetailsPage.getCustomerNameText().getText();
		 
Assert.assertEquals(actCustomerNAme, customerName,customerName + " = name is not verified");
	

	 }catch(Throwable t){
			System.out.println(" Failed" + Driver.driver.getTitle());
			rLib.takeScreenShot(Driver.driver.getTitle());
			wLib.alertHandle();
			Driver.driver.close();
			//bLib.loginToAPP(userName, password);
	 }
		}
	 	 
	
 @Test
	  
public void modifyCustomer() throws InterruptedException, InvalidFormatException, IOException{
		

try{
		 String customerName= eLib.getExcelData("Sheet1" , 2 , 5);
		// String[] arrName = customerName.split(";");
		// String customerFirstName= arrName[0];
		// String customerSecondName= arrName[1];

		 //step 3: create Customer
		 bLib.createCustomer(customerName);
		 
		 //step 4:  modify & verify customer
		
}catch(Throwable t){
	System.out.println(" Failed" + Driver.driver.getTitle());
	rLib.takeScreenShot(Driver.driver.getTitle());
	wLib.alertHandle();
	Driver.driver.close();
	//bLib.loginToAPP(userName, password);
	
}
	  }
	 
	 @AfterMethod
	 public void configAfterMtd(){
		 //ste 5 : logout
		 bLib.logOut();	 
	 }
	 
	 
     @AfterClass
     public void configAfterClass(){
	  //Driver.driver.quit();
    	 System.out.println("===========ProjectAndCustomerTest Completed =================");
     }

	  
}
