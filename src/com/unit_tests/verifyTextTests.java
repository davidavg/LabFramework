package com.unit_tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import com.general.BasicFunctions;

public class verifyTextTests {

	static BasicFunctions basic = new BasicFunctions();
	
	@BeforeClass
	public static void init() {
		basic.openBroswer();
	}
		
	@AfterClass
	public static void end() {
		basic.closeBroswer();
	} 
	
	@Test
	public void verifyText_success() {
		try {
			basic.navigateTo();
			Assert.assertTrue(basic.verifyText(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"), 
					"Gmail"));
		}catch(Exception e) {
			Assert.assertTrue(false);
		}		
	}
	
	@Test
	public void verifyText_emptyTextReturned() {
		try {
			basic.navigateTo();
			Assert.assertFalse(basic.verifyText(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"), 
					"Incorrect text"));
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void verifyText_fail() {
		try {
			basic.navigateTo();
			Assert.assertFalse(basic.verifyText(By.xpath("//*[@id=\\\"gbw\\\"]/div/div/div[1]/div[1]/a"), 
					"Incorrect text"));
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void verifyText_incorrectObject() {
		try {
			basic.navigateTo();
			Assert.assertFalse(basic.verifyText(By.xpath(""), 
					"Incorrect text"));
		}catch(Exception e) {
			Assert.assertTrue(false);
		}
	}

}
