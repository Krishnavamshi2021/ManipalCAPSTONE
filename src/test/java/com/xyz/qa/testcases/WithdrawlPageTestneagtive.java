package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerLoginPage;
import com.xyz.qa.pages.DepositPage;
import com.xyz.qa.pages.WithdrawlPage;
import com.xyz.qa.util.TestUtil;

public class WithdrawlPageTestneagtive extends TestBase {

	WithdrawlPage withdrawlpage;
	TestUtil testutil;
	CustomerLoginPage customerloginpage;
	DepositPage depositpage;


	public WithdrawlPageTestneagtive() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

		customerloginpage = new CustomerLoginPage();
		customerloginpage = customerloginpage.navigatetocustomerselection();
		depositpage = customerloginpage.navigatetodeposit();
		withdrawlpage = new WithdrawlPage();
	

	}

//	@Test(priority = 1)
//	public void deposittest() {
//
//		depositpage.depositamt();
//		depositpage.amttodeposit();
//		Assert.assertTrue(depositpage.msgtodisplay());
//		
//	}
	
	//@Test(priority = 2)
//	public void withdrawtest() {
//		depositpage.depositamt();
//		customerloginpage.navigatetowithdrawl();
//		withdrawlpage.amttowhitdrawl();
//		Assert.assertTrue(withdrawlpage.msgtodisplay2());
//		withdrawlpage.lout();
//	
//	}
	//XYZ-T10//
	@Test(priority = 3)
	public void withdrawtestinvalidamount() {
			// withdrawl test invalid amount//
			depositpage.depositamt();
			customerloginpage.navigatetowithdrawl();
			withdrawlpage.amttowhitdrawlinvalid();
			Assert.assertTrue(withdrawlpage.msgtodisplay2());
			withdrawlpage.lout();
		

	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}


}
