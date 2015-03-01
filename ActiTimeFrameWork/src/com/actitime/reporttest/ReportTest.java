package com.actitime.reporttest;



import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.businessComponent.ProjectAndCustomerLib;
import com.actitime.genericLib.Driver;
import com.actitime.genericLib.ExcelLib;
import com.actitime.genericLib.WebDriverCommomUtill;
import com.actitime.objectrepository.CustomerDetailsPage;


public class ReportTest {


//object deceleration
	
ExcelLib eLib;
    
WebDriverCommomUtill wLib;
    
ProjectAndCustomerLib bLib;
   
 CustomerDetailsPage customerdetailsPage;
	
	
@BeforeClass
	
public void configBeforeClass(){

		 // object initialization
		
System.out.println("execute ReportTest test case");
		 
eLib = new ExcelLib();
		 
wLib = new WebDriverCommomUtill();
		 
bLib = new ProjectAndCustomerLib();
		 
customerdetailsPage = PageFactory.initElements(Driver.driver, CustomerDetailsPage.class);
		 		
	}
	
	 
	 
@BeforeMethod
	 
public void configBeforeMtd() throws InvalidFormatException, IOException{
	     
// get test data from excel
		 
String userName= eLib.getExcelData("Sheet1" , 1 , 2);
		 
String password= eLib.getExcelData("Sheet1" , 1 , 3);
		
		 
		 
//step 1 : login to APP
		 
bLib.loginToAPP(userName, password);
	
		 
	 
}
	
	 
@Test
	  
public void createReportTest() throws InterruptedException, InvalidFormatException, IOException{
		
		 
System.out.println("create Report");
	  }
	 	 
	 
@Test
	  
public void modifyReportTest() throws InterruptedException, InvalidFormatException, IOException{

		 
System.out.println("modify Report");

	  
}
	 
	 
@AfterMethod
	 
public void configAfterMtd(){
		 
//ste 5 : logout
		 
bLib.logOut();	 
	 }
	 
	 
     
@AfterClass
     
public void configAfterClass(){
	  
Driver.driver.quit();
	  
System.out.println("====================ReportTest  Completed================");

     }


  
}

