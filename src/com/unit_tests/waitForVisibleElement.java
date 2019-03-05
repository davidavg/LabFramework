package com.unit_tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.general.BasicFunctions;

public class waitForVisibleElement {
	
	BasicFunctions basic = new BasicFunctions();
	
	@BeforeClass
	void init() {
		basic.openBroswer();
		basic.navigateTo("https://www.google.com.mx/");
	}
		
	@AfterClass
	void end() {
		basic.closeBroswer();
	}
		
	@Test
	void verifyVisibilityByID_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.id("hplogo")));
	}
	
	@Test
	void verifyVisibilityByID_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.id("test")));
	}
	
	@Test
	void verifyVisibilityByCLASS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.className("ctr-p")));
	}
	
	@Test
	void verifyVisibilityByCLASS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test")));
	}
	
	@Test
	void verifyVisibilityByLINK_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.linkText("Gmail")));
	}
	
	@Test
	void verifyVisibilityByLINK_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test")));
	}
		
	@Test
	void verifyVisibilityByNAME_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.name("f")));
	}
	
	@Test
	void verifyVisibilityByNAME_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.name("test")));
	}
	
	@Test
	void verifyVisibilityByTAG_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.tagName("div")));
	}
	
	@Test
	void verifyVisibilityByTAG_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.tagName("test")));
	}
	
	@Test
	void verifyVisibilityByXPATH_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")));
	}
	
	@Test
	void verifyVisibilityByXPATH_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.xpath("//*[@id='test']")));
	}
	
	@Test
	void verifyVisibilityByCSS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.cssSelector(".hp.vasq")));
	}
	
	@Test
	void verifyVisibilityByCSS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.cssSelector(".test")));
	}
	
	
	@Test
	void verifyVisibilityByID_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.id("hplogo"),5));
	}
	
	@Test
	void verifyVisibilityByID_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.id("test"),5));
	}
	
	@Test
	void verifyVisibilityByCLASS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.className("ctr-p"),5));
	}
	
	@Test
	void verifyVisibilityByCLASS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test"),5));
	}
	
	@Test
	void verifyVisibilityByLINK_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.linkText("Gmail"),5));
	}
	
	@Test
	void verifyVisibilityByLINK_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test"),5));
	}
		
	@Test
	void verifyVisibilityByNAME_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.name("f"),5));
	}
	
	@Test
	void verifyVisibilityByNAME_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.name("test"),5));
	}
	
	@Test
	void verifyVisibilityByTAG_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.tagName("div"),5));
	}
	
	@Test
	void verifyVisibilityByTAG_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.tagName("test"),5));
	}
	
	@Test
	void verifyVisibilityByXPATH_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"),5));
	}
	
	@Test
	void verifyVisibilityByXPATH_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.xpath("//*[@id='test']"),5));
	}
	
	@Test
	void verifyVisibilityByCSS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.cssSelector(".hp.vasq"),5));
	}
	
	@Test
	void verifyVisibilityByCSS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.cssSelector(".test"),5));
	}

}
