package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ReportLib {
  @Test
  public void takeScreenShot(String filename) throws IOException {
	  
			  EventFiringWebDriver eDriver=new EventFiringWebDriver(Driver.driver);
			  File SrcImg=eDriver.getScreenshotAs(OutputType.FILE);
			  File dstImg=new File("C:\\Users\\prakash\\workspace1\\ActiTimeFrameWork\\ScreenShoot\\ " +filename + ".jpg");
			  FileUtils.copyFile(SrcImg, dstImg);
			  
  }
}
