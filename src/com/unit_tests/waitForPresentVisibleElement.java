package com.unit_tests;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import com.general.BasicFunctions;

public class waitForPresentVisibleElement {

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
	public void verifyPresenceVisibilityByID_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.id("hplogo")));
	}
	
	@Test
	public void verifyPresenceVisibilityByID_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.id("test")));
	}
	
	@Test
	public void verifyPresenceVisibilityByCLASS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.className("ctr-p")));
	}
	
	@Test
	public void verifyPresenceVisibilityByCLASS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test")));
	}
	
	@Test
	public void verifyPresenceVisibilityByLINK_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.linkText("Gmail")));
	}
	
	@Test
	public void verifyPresenceVisibilityByLINK_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test")));
	}
		
	@Test
	public void verifyPresenceVisibilityByNAME_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.name("f")));
	}
	
	@Test
	public void verifyPresenceVisibilityByNAME_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.name("test")));
	}
	
	@Test
	public void verifyPresenceVisibilityByTAG_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.tagName("div")));
	}
	
	@Test
	public void verifyPresenceVisibilityByTAG_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.tagName("test")));
	}
	
	@Test
	public void verifyPresenceVisibilityByXPATH_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")));
	}
	
	@Test
	public void verifyPresenceVisibilityByXPATH_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.xpath("//*[@id='test']")));
	}
	
	@Test
	public void verifyPresenceVisibilityByCSS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.cssSelector(".hp.vasq")));
	}
	
	@Test
	public void verifyPresenceVisibilityByCSS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.cssSelector(".test")));
	}
	
	
	@Test
	public void verifyPresenceVisibilityByID_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.id("hplogo"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByID_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.id("test"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByCLASS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.className("ctr-p"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByCLASS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByLINK_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.linkText("Gmail"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByLINK_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test"),5));
	}
		
	@Test
	public void verifyPresenceVisibilityByNAME_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.name("f"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByNAME_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.name("test"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByTAG_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.tagName("div"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByTAG_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.tagName("test"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByXPATH_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByXPATH_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.xpath("//*[@id='test']"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByCSS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.cssSelector(".hp.vasq"),5));
	}
	
	@Test
	public void verifyPresenceVisibilityByCSS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.cssSelector(".test"),5));
	}
}
