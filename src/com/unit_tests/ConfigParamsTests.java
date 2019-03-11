package com.unit_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;

import com.general.ConfigParams;

import org.junit.jupiter.api.Test;

class ConfigParamsTests {

	@BeforeClass
	//public void beforeClass() {
		
	//}
	
	@Test
	void defaultValues() {
		ConfigParams cp = new ConfigParams();
		String[] params = cp.setDefaultValues();
		assertEquals(params[0].toLowerCase(),"chrome");
		assertEquals(params[1].toLowerCase(),"https://www.google.com.mx/");
	}
	
	@Test
	void getParam() {
		ConfigParams cp = new ConfigParams();
		assertEquals(cp.getParam("test"), "test");
	}

}
