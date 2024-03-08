package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerLoginPage;
import com.xyz.qa.pages.DepositPage;
import com.xyz.qa.util.TestUtil;

public class DepositPageTestnegative extends TestBase {

		DepositPage depositpage;
		TestUtil testutil;
		CustomerLoginPage customerloginpage;
		
		
		public DepositPageTestnegative() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			
			customerloginpage = new CustomerLoginPage();
			depositpage = new DepositPage();
		}
		
		
		//XYZ-T19//
		@Test(priority = 1)
		public void cuslgn() {
			
			customerloginpage.navigatetocustomerselection();
		}
		
		@Test(priority = 2)
		public void invaliddeposittets() {
			//Depositing amount Invalid//
			customerloginpage.navigatetocustomerselection();
			depositpage.depositamt();
			depositpage.verifyAccountNumber();
			depositpage.verifybalandcur();
			customerloginpage.navigatetodeposit();
			depositpage.invalidamttodeposit();
			depositpage.updatedbal();
			Assert.assertTrue(depositpage.msgtodisplay());
			
		}
		@AfterMethod
		public void tearDown(){
			driver.close();
		}

	}

