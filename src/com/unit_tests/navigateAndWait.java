package com.unit_tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.general.BasicFunctions;

public class navigateAndWait {

	BasicFunctions basic = new BasicFunctions();
		
	@BeforeClass
	void init() {
		basic.openBroswer();
		//basic.navigateTo("https://www.google.com.mx/");
	}
		
	@AfterClass
	void end() {
		basic.closeBroswer();
	}
		
	@Test
	void navigateByID_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.id("hplogo")));
	}
	
	@Test
	void navigateByID_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.id("test")));
	}
	
	@Test
	void navigateByCLASS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.className("ctr-p")));
	}
	
	@Test
	void navigateByCLASS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test")));
	}
	
	@Test
	void navigateByLINK_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.linkText("Gmail")));
	}
	
	@Test
	void navigateByLINK_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test")));
	}
		
	@Test
	void navigateByNAME_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.name("f")));
	}
	
	@Test
	void navigateByNAME_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.name("test")));
	}
	
	@Test
	void navigateByTAG_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.tagName("div")));
	}
	
	@Test
	void navigateByTAG_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.tagName("test")));
	}
	
	@Test
	void navigateByXPATH_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")));
	}
	
	@Test
	void navigateByXPATH_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.xpath("//*[@id='test']")));
	}
	
	@Test
	void navigateByCSS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.cssSelector(".hp.vasq")));
	}
	
	@Test
	void navigateByCSS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.cssSelector(".test")));
	}
	
	///////////////////////////////////////////////////
	
	@Test
	void navigateByID_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.id("hplogo"),5000));
	}
	
	@Test
	void navigateByID_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.id("test"),5000));
	}
	
	@Test
	void navigateByCLASS_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.className("ctr-p"),5000));
	}
	
	@Test
	void navigateByCLASS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test"),5000));
	}
	
	@Test
	void navigateByLINK_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.linkText("Gmail"),5000));
	}
	
	@Test
	void navigateByLINK_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test"),5000));
	}
		
	@Test
	void navigateByNAME_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.name("f"),5000));
	}
	
	@Test
	void navigateByNAME_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.name("test"),5000));
	}
	
	@Test
	void navigateByTAG_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.tagName("div"),5000));
	}
	
	@Test
	void navigateByTAG_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.tagName("test"),5000));
	}
	
	@Test
	void navigateByXPATH_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"),5000));
	}
	
	@Test
	void navigateByXPATH_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.xpath("//*[@id='test']"),5000));
	}
	
	@Test
	void navigateByCSS_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.cssSelector(".hp.vasq"),5000));
	}
	
	@Test
	void navigateByCSS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.cssSelector(".test"),5000));
	}
	

}
