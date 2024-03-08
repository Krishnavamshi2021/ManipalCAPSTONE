package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerLoginPage;
import com.xyz.qa.pages.DepositPage;
import com.xyz.qa.util.TestUtil;

public class DepositPageTest extends TestBase{
	DepositPage depositpage;
	TestUtil testutil;
	CustomerLoginPage customerloginpage;
	
	
	public DepositPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		customerloginpage = new CustomerLoginPage();
		depositpage = new DepositPage();
	}
	//XYZ-T2//
	@Test(priority = 1)
	public void cuslgn() {
		
		customerloginpage.navigatetocustomerselection();
	}
	
	@Test(priority = 2)
	public void deposittets() {
		// Depositing Amount //
		customerloginpage.navigatetocustomerselection();
		depositpage.depositamt();
		depositpage.verifyAccountNumber();
		depositpage.verifybalandcur();
		customerloginpage.navigatetodeposit();
		depositpage.amttodeposit();
		depositpage. updatedbal();
		Assert.assertTrue(depositpage.msgtodisplay());
		
		
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
