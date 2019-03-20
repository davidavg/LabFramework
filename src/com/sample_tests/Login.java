package com.sample_tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.general.ITestTemplate;
import com.general.Navigation;

import io.qameta.allure.Step;

import com.general.ExcelUtil;

@Listeners(com.general.TestNGListeners.class)
public class Login extends Navigation implements ITestTemplate {
	
	String CREDENTIALS_PATH = "src/data/testfile.xlsx", CREDENTIALS_SHEET = "Sheet1";
	
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
	
	@Step
	@DataProvider
	public Object[][] credentials(){
		ExcelUtil excel = new ExcelUtil();
		Object[][] testArray = excel.myInputTest(CREDENTIALS_PATH, CREDENTIALS_SHEET);
		return testArray;
	}
	
	@Test(dataProvider="credentials", enabled = true, description="This is a sample Login test")
	public void loginTest01(String user, String password) {
		System.out.println("--> Login --> Happy path test");
		login(user, password);
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}
	
	@Test(enabled = true)
	public void loginTest02() {
		System.out.println("--> Login --> Negative Test01");
	}
	
	@Test(enabled = true)
	public void loginTest03() {
		System.out.println("--> Login --> Negative Test02");
	}
	
}
