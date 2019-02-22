package com.sample_tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.general.ITestTemplate;
import com.general.Navigation;

@Listeners(com.general.TestNGListeners.class)
public class MyOrders extends Navigation implements ITestTemplate {
	
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
	public void editOrder() {
		login("david", "1234");
		navigateMyOrders(null);
		System.out.println("--> MyOrders --> Edit order test");
	}
	
	@Test
	public void cancelOrder() {
		login("david", "1234");
		navigateMyOrders(null);
		System.out.println("--> MyOrders --> Cancel order test");
	}
}
