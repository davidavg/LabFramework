package com.unit_tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.general.BasicFunctions;

public class waitForPresentVisibleElement {

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
	void verifyPresenceVisibilityByID_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.id("hplogo")));
	}
	
	@Test
	void verifyPresenceVisibilityByID_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.id("test")));
	}
	
	@Test
	void verifyPresenceVisibilityByCLASS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.className("ctr-p")));
	}
	
	@Test
	void verifyPresenceVisibilityByCLASS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test")));
	}
	
	@Test
	void verifyPresenceVisibilityByLINK_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.linkText("Gmail")));
	}
	
	@Test
	void verifyPresenceVisibilityByLINK_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test")));
	}
		
	@Test
	void verifyPresenceVisibilityByNAME_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.name("f")));
	}
	
	@Test
	void verifyPresenceVisibilityByNAME_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.name("test")));
	}
	
	@Test
	void verifyPresenceVisibilityByTAG_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.tagName("div")));
	}
	
	@Test
	void verifyPresenceVisibilityByTAG_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.tagName("test")));
	}
	
	@Test
	void verifyPresenceVisibilityByXPATH_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")));
	}
	
	@Test
	void verifyPresenceVisibilityByXPATH_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.xpath("//*[@id='test']")));
	}
	
	@Test
	void verifyPresenceVisibilityByCSS_objectFound_notimeOutSet() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.cssSelector(".hp.vasq")));
	}
	
	@Test
	void verifyPresenceVisibilityByCSS_objectNotfound_notimeOutSet() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.cssSelector(".test")));
	}
	
	
	@Test
	void verifyPresenceVisibilityByID_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.id("hplogo"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByID_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.id("test"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByCLASS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.className("ctr-p"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByCLASS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByLINK_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.linkText("Gmail"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByLINK_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.className("test"),5));
	}
		
	@Test
	void verifyPresenceVisibilityByNAME_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.name("f"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByNAME_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.name("test"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByTAG_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.tagName("div"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByTAG_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.tagName("test"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByXPATH_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByXPATH_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.xpath("//*[@id='test']"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByCSS_objectFound_timeOutset() {
		Assert.assertTrue(basic.verifyPresenceAndVisibility(By.cssSelector(".hp.vasq"),5));
	}
	
	@Test
	void verifyPresenceVisibilityByCSS_objectNotfound_timeOutset() {
		Assert.assertFalse(basic.verifyPresenceAndVisibility(By.cssSelector(".test"),5));
	}
}
