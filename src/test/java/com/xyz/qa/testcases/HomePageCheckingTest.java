package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerLoginPage;
import com.xyz.qa.pages.CustomerLoginPage;
import com.xyz.qa.pages.HomePageChecking;
import com.xyz.qa.util.TestUtil;

public class HomePageCheckingTest extends TestBase {

	HomePageChecking homepagechecking;
	TestUtil testutil;
	CustomerLoginPage customerloginpage;
	BankManagerLoginPage bankmanagerloginpage;

	public HomePageCheckingTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepagechecking = new HomePageChecking();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = homepagechecking.validateLoginPageTitle();
		Assert.assertEquals(title, "XYZ Bank");

	}

	@Test(priority = 2)
	public void customerloginpage() {

		homepagechecking.navigatetocustomerlogin();
		Assert.assertTrue(homepagechecking.verifycustomerlogin());

	}

	// XYZ-T14
	@Test(priority = 3)
	public void bankmanagerloginpage() {
		//Home Page Checking//
		homepagechecking.navigatetobankmanagerlogin();
		Assert.assertTrue(homepagechecking.verifybankmanagerlogin());

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
