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

public class WithdrawlPageTest extends TestBase{
	
	WithdrawlPage withdrawlpage;
	TestUtil testutil;
	CustomerLoginPage customerloginpage;
	DepositPage depositpage;

	
	public WithdrawlPageTest() {
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
	
	@Test(priority = 1)
	public void deposittest() {
		depositpage.depositamt();
		depositpage.amttodeposit();
		Assert.assertTrue(depositpage.msgtodisplay());
	}
	
	
	//XYZ-T3//

	@Test(priority = 2)
	public void withdrawtest() {
		// Withdrawl Test//
		depositpage.depositamt();
		customerloginpage.navigatetowithdrawl();
		withdrawlpage.amttowhitdrawl();
		Assert.assertTrue(withdrawlpage.msgtodisplay());
		withdrawlpage.lout();
	
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
