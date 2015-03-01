package com.actitime.genericLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver driver = new FirefoxDriver();
	
public void maxWindow() {

	Driver.driver.manage().window().maximize();
	
}
//public void minWindow() {
	//Dimension d=new Dimension(10, 20);
	//Driver.driver.manage().window().setSize(d);
	
	
	
//}

}
