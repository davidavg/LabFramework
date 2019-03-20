package com.unit_tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.general.BasicFunctions;

public class navigateToTests {
	
	static BasicFunctions basic = new BasicFunctions();
	
	@BeforeClass
	public static void init() {
		basic.openBroswer();
		//basic.navigateTo("https://www.google.com.mx/");
	}
		
	@AfterClass
	public static void end() {
		basic.closeBroswer();
	} 
	
	@Test
	public void navigateTo_NoURL() {
		try {
			basic.navigateTo();
			Assert.assertTrue(true);
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
		
	}
	
	@Test
	public void navigateTo_withURL() {
		try {
			basic.navigateTo("https://www.google.com.mx/");
			Assert.assertTrue(true);	
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
		
	}
	
	@Test
	public void navigateTo_IncorrectURL() {
		try {
			basic.navigateTo("");
			Assert.assertTrue(false);
		}catch(Exception e) {
			Assert.assertTrue(true);
		}
		
	}

}
