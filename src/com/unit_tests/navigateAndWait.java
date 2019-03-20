package com.unit_tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import com.general.BasicFunctions;

public class navigateAndWait {

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
	public void navigateByID_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.id("hplogo")));
	}
	
	@Test
	public void navigateByID_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.id("test")));
	}
	
	@Test
	public void navigateByCLASS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.className("ctr-p")));
	}
	
	@Test
	public void navigateByCLASS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test")));
	}
	
	@Test
	public void navigateByLINK_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.linkText("Gmail")));
	}
	
	@Test
	public void navigateByLINK_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test")));
	}
		
	@Test
	public void navigateByNAME_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.name("f")));
	}
	
	@Test
	public void navigateByNAME_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.name("test")));
	}
	
	@Test
	public void navigateByTAG_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.tagName("div")));
	}
	
	@Test
	public void navigateByTAG_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.tagName("test")));
	}
	
	@Test
	public void navigateByXPATH_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")));
	}
	
	@Test
	public void navigateByXPATH_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.xpath("//*[@id='test']")));
	}
	
	@Test
	public void navigateByCSS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.navigateAndWait(By.cssSelector(".hp.vasq")));
	}
	
	@Test
	public void navigateByCSS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.navigateAndWait(By.cssSelector(".test")));
	}
	
	
	@Test
	public void navigateByID_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.id("hplogo"),5));
	}
	
	@Test
	public void navigateByID_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.id("test"),5));
	}
	
	@Test
	public void navigateByCLASS_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.className("ctr-p"),5));
	}
	
	@Test
	public void navigateByCLASS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test"),5));
	}
	
	@Test
	public void navigateByLINK_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.linkText("Gmail"),5));
	}
	
	@Test
	public void navigateByLINK_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.className("test"),5));
	}
		
	@Test
	public void navigateByNAME_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.name("f"),5));
	}
	
	@Test
	public void navigateByNAME_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.name("test"),5));
	}
	
	@Test
	public void navigateByTAG_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.tagName("div"),5));
	}
	
	@Test
	public void navigateByTAG_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.tagName("test"),5));
	}
	
	@Test
	public void navigateByXPATH_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"),5));
	}
	
	@Test
	public void navigateByXPATH_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.xpath("//*[@id='test']"),5));
	}
	
	@Test
	public void navigateByCSS_objectFound_timeOutset() {
		Assert.assertTrue(basic.navigateAndWait(By.cssSelector(".hp.vasq"),5));
	}
	
	@Test
	public void navigateByCSS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.navigateAndWait(By.cssSelector(".test"),5));
	}
	

}
