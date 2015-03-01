package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommomUtill {

	
	boolean flag = false;
	
	public void alertHandle(){
		
		Alert alrt = Driver.driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();

		}

	
	public void waitForPageToLoad(){	
	  Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	public void waitForLinkPresent(String wbLinkText){
	 WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
	 wait.until(ExpectedConditions.elementToBeClickable(By.linkText(wbLinkText)));	       
	}
	
	
	public void waitForXpathPresent(String wbXpath){
	 WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(wbXpath)));	       
	}
	
	public void selectValue(String selXpath , String value){	       
	   Select sel = new Select(Driver.driver.findElement(By.xpath(selXpath)));
	   sel.selectByVisibleText(value);
	}
	
	
	public void aceptAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	
	public void dismissAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	
	public boolean verifyText(String webXpath , String expectedText){
	
        String actPage =Driver.driver.findElement(By.xpath(webXpath)).getText();
	       
        if(expectedText.equals(actPage)){
        	flag=true;
        	System.out.println(expectedText + " = is verified");
        }else{
        	System.out.println(expectedText + " = is not verified");
        }
        return flag;
	}
	
	public boolean verifyTextPresent(String expectedText){
	
		String entireHtmlSrc =Driver.driver.getPageSource();
		
		if(entireHtmlSrc.contains(expectedText)){
			flag=true;
			System.out.println(expectedText + " = is verified");
		}else{
        	System.out.println(expectedText + " = is not verified");
        }
        return flag;
		
        
        
	}
	
}







