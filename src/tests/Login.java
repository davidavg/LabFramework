package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import general.ITestTemplate;
import general.Navigation;

@Listeners(general.TestNGListeners.class)
public class Login extends Navigation implements ITestTemplate {
	
	@Override
	@BeforeClass
	public void beforeClass() {
		openBroswer();
	}

	@Override
	@BeforeMethod
	public void beforeMethod() {
		navigateTo();
		
	}

	@Override
	@AfterClass
	public void afterClass() {
		closeBroswer();
		
	}
	
	@Test(enabled = true)
	public void loginTest01() {
		System.out.println("--> Login --> Happy path test");
		login("david", "1234");
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}
	
	@Test(enabled = false)
	public void loginTest02() {
		System.out.println("--> Login --> Negative Test01");
	}
	
	@Test(enabled = false)
	public void loginTest03() {
		System.out.println("--> Login --> Negative Test02");
	}
	
}
