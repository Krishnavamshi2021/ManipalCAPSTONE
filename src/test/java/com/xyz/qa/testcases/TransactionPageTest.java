package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerLoginPage;
import com.xyz.qa.pages.DepositPage;
import com.xyz.qa.pages.TransactionPage;
import com.xyz.qa.pages.WithdrawlPage;
import com.xyz.qa.util.TestUtil;

public class TransactionPageTest extends TestBase {
	
	TestUtil testutil;
	CustomerLoginPage customerloginpage;
	DepositPage depositpage;
	TransactionPage transactionpage;
	WithdrawlPage withdrawlpage;
	
	public TransactionPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		
		customerloginpage = new CustomerLoginPage();
		depositpage = new DepositPage();
		withdrawlpage = new WithdrawlPage();
		transactionpage = new TransactionPage();
	}
	
	//XYZ-T4//
		@Test(priority = 1)
		public void transactionpagetest(){
			 
			customerloginpage.navigatetocustomerselection();
			customerloginpage.navigatetodeposit();
			
		
			depositpage.amttodeposit();
			depositpage.depositamt();
			customerloginpage.navigatetowithdrawl();
			withdrawlpage.amttowhitdrawl();
			Assert.assertTrue(depositpage.msgtodisplay());
			//Transactions Checking//
			customerloginpage.navigatetotransactions();
			transactionpage.seedata();
			transactionpage.reseting();
 
		
	}
		@AfterMethod
		public void tearDown(){
			driver.close();
		}

}
