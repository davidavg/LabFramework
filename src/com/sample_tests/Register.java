package com.sample_tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.general.ITestTemplate;
import com.general.Navigation;

@Listeners(com.general.TestNGListeners.class)
public class Register extends Navigation implements ITestTemplate {

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
	public void registerTest01() {
		System.out.println("--> Register --> Happy path register");
	}
	
	@Test
	public void registerTest02() {
		System.out.println("--> Register --> Negative test01");
	}
	
	@Test
	public void registerTest03() {
		System.out.println("--> Register --> Negative test02");
	}


}
