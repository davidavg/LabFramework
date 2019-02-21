package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import general.ITestTemplate;
import general.Navigation;

@Listeners(general.TestNGListeners.class)
public class Account extends Navigation implements ITestTemplate {
	
	@Override
	@BeforeClass
	public void beforeClass() {
		openBroswer();
		
	}

	@Override
	@BeforeMethod
	public void beforeMethod() {
		navigateTo("Google URL");
		
	}

	@Override
	@AfterClass
	public void afterClass() {
		closeBroswer();
		
	}
	
	@Test
	public void verifyInfo() {
		login("david", "1234");
		navigateAccount(null);
		System.out.println("--> Account --> Verify info. test");
	}
	
	@Test
	public void editInfo01() {
		login("david", "1234");
		navigateAccount(null);
		System.out.println("--> Account --> Edit info test01");
	}
	
	@Test
	public void editInfo02() {
		login("david", "1234");
		navigateAccount(null);
		System.out.println("--> Account --> Edit info test02");
	}
}
