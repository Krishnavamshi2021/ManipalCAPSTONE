package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerLoginPage;
import com.xyz.qa.util.TestUtil;

public class CustomerLoginPageTest extends TestBase {
	CustomerLoginPage customerloginpage;
	TestUtil testutil;

	public CustomerLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerloginpage = new CustomerLoginPage();
	}

//XYZ-T1//
	@Test(priority = 1)
	public void customerloginpagetest() {
      // Customer Login Page Check//
		customerloginpage = customerloginpage.navigatetocustomerselection();
		Assert.assertTrue(customerloginpage.navigatetocustomerhomepage());

	}

//	@Test(priority = 2)
//	public void customeraccountpagetest() {
//		customerloginpage.navigatetocustomerselection();
//		Assert.assertTrue(customerloginpage.navigatetocustomerhomepage());
//	}
//	
//	@Test(priority = 2)
//	public void customerpagetitletest() {
//		String title = customerloginpage.validateLoginPageTitle();
//		Assert.assertEquals(title, "XYZ Bank");
//	}

//	@AfterMethod
//	public void tearDown(){
//		driver.close();
//	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}