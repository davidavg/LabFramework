package com.sample_tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.general.ITestTemplate;
import com.general.Navigation;

@Listeners(com.general.TestNGListeners.class)
public class CreateOrder extends Navigation implements ITestTemplate {
	
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
	public void createOrder01() {
		login("david", "1234");
		navigateCreateOrder(null);
		System.out.println("--> CreateOrder --> Happy path test");
	}
	
	@Test
	public void createOrder02() {
		login("david", "1234");
		navigateCreateOrder(null);
		System.out.println("--> CreateOrder --> Negative test01");
	}
	
	@Test
	public void createOrder03() {
		login("david", "1234");
		navigateCreateOrder(null);
		System.out.println("--> CreateOrder --> Negative test02");
	}
}
