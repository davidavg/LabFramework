package com.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import com.general.BasicFunctions;
import org.junit.jupiter.api.Test;

class cross_broswer {
	
	//Constant values for tests
	String CHROME = "chrome", FIREFOX = "firefox", MOZILLA = "mozilla", IE = "ie";

	@Test
	void test_browser_default() {
		BasicFunctions basic = new BasicFunctions();
		assertTrue(basic.openBroswer());
		basic.closeBroswer();
	}
	
	@Test
	void test_browser_chrome() {
		BasicFunctions basic = new BasicFunctions();
		assertTrue(basic.openBroswer(CHROME));
		basic.closeBroswer();
	}

	@Test
	void test_browser_firefox() {
		BasicFunctions basic = new BasicFunctions();
		assertTrue(basic.openBroswer(FIREFOX));
		basic.closeBroswer();
	}
	
	@Test
	void test_browser_mozilla() {
		BasicFunctions basic = new BasicFunctions();
		assertTrue(basic.openBroswer(MOZILLA));
		basic.closeBroswer();
	}

	
	@Test
	void test_browser_ie() {
		BasicFunctions basic = new BasicFunctions();
		assertTrue(basic.openBroswer(IE));
		basic.closeBroswer();
	}


}
