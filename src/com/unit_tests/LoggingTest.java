package com.unit_tests;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.general.Logging;

class LoggingTest {

	@Test
	void printLogs_unitTestPackage() {
		Logging logging = new Logging();
		Logger log = logging.initLogger(this.getClass().getName());
		
		log.trace("trace message");
		log.debug("Debug message");
		log.info("Info message");
		log.warn("Warning message");
		log.fatal("Fatal message");
		log.error("Error message");
		
	}
	
	@Test
	void printLogs_generalPackage() {
		Logging logging = new Logging();
		logging.test();
		
	}

}
