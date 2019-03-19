package com.unit_tests;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import com.general.BasicFunctions;

public class waitForVisibleElement {
	
	static BasicFunctions basic = new BasicFunctions();
	
	@BeforeClass
	public static void init() {
		basic.openBroswer();
		basic.navigateTo("https://www.google.com.mx/");
	}
		
	@AfterClass
	public static void end() {
		basic.closeBroswer();
	}
		
	@Test
	public void verifyVisibilityByID_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.id("hplogo")));
	}
	
	@Test
	public void verifyVisibilityByID_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.id("test")));
	}
	
	@Test
	public void verifyVisibilityByCLASS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.className("ctr-p")));
	}
	
	@Test
	public void verifyVisibilityByCLASS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test")));
	}
	
	@Test
	public void verifyVisibilityByLINK_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.linkText("Gmail")));
	}
	
	@Test
	public void verifyVisibilityByLINK_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test")));
	}
		
	@Test
	public void verifyVisibilityByNAME_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.name("f")));
	}
	
	@Test
	public void verifyVisibilityByNAME_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.name("test")));
	}
	
	@Test
	public void verifyVisibilityByTAG_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.tagName("div")));
	}
	
	@Test
	public void verifyVisibilityByTAG_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.tagName("test")));
	}
	
	@Test
	public void verifyVisibilityByXPATH_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")));
	}
	
	@Test
	public void verifyVisibilityByXPATH_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.xpath("//*[@id='test']")));
	}
	
	@Test
	public void verifyVisibilityByCSS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyVisibility(By.cssSelector(".hp.vasq")));
	}
	
	@Test
	public void verifyVisibilityByCSS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyVisibility(By.cssSelector(".test")));
	}
	
	
	@Test
	public void verifyVisibilityByID_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.id("hplogo"),5));
	}
	
	@Test
	public void verifyVisibilityByID_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.id("test"),5));
	}
	
	@Test
	public void verifyVisibilityByCLASS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.className("ctr-p"),5));
	}
	
	@Test
	public void verifyVisibilityByCLASS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test"),5));
	}
	
	@Test
	public void verifyVisibilityByLINK_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.linkText("Gmail"),5));
	}
	
	@Test
	public void verifyVisibilityByLINK_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.className("test"),5));
	}
		
	@Test
	public void verifyVisibilityByNAME_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.name("f"),5));
	}
	
	@Test
	public void verifyVisibilityByNAME_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.name("test"),5));
	}
	
	@Test
	public void verifyVisibilityByTAG_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.tagName("div"),5));
	}
	
	@Test
	public void verifyVisibilityByTAG_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.tagName("test"),5));
	}
	
	@Test
	public void verifyVisibilityByXPATH_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"),5));
	}
	
	@Test
	public void verifyVisibilityByXPATH_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.xpath("//*[@id='test']"),5));
	}
	
	@Test
	public void verifyVisibilityByCSS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyVisibility(By.cssSelector(".hp.vasq"),5));
	}
	
	@Test
	public void verifyVisibilityByCSS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyVisibility(By.cssSelector(".test"),5));
	}

}
