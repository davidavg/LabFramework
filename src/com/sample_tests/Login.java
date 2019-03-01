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
import com.general.ExcelUtil;

@Listeners(com.general.TestNGListeners.class)
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
	
	@DataProvider
	public Object[][] credentials(){
		Object[][] testArray = ExcelUtil.myInputTest("C:\\Users\\David Avalos\\Documents\\eclipse\\frameworkLabortory\\src\\data\\testfile.xlsx", "Sheet1");
		return testArray;
	}
	
	@Test(dataProvider="credentials",enabled = true)
	public void loginTest01(String user, String password) {
		System.out.println("--> Login --> Happy path test");
		login(user, password);
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
