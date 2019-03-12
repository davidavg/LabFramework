package com.general;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Logging {
	
	//String LOG_CONFIG_LOCATION = "src/config/log4j2.xml";
	
	public Logger initLogger(String strClass) {
		//Create Logger
		Logger log = LogManager.getLogger(strClass);
		LoggerContext context = (LoggerContext) LogManager.getContext(false);
		
		//Create object to read config params from file
		ConfigParams cp = new ConfigParams();
		
		//Set log4j2 config file only when it is not in the source folder or a default location. Else, comment two lines below
		File file = new File(cp.getParam("log4path"));
		context.setConfigLocation(file.toURI());
		
		return log;
	}
	
	public void test() {
		Logger log = initLogger(this.getClass().getName());
		log.info("debugging test message");
	}

}
