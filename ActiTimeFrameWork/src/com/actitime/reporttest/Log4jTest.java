package com.actitime.reporttest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Log4jTest {
 
	static Logger log=Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
log.debug("This debug message");
log.warn("warn message");
log.info("info message");
log.fatal("warn message");
	}

}
