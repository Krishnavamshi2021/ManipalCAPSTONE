package com.xyz.qa.testcases;

	import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.xyz.qa.base.TestBase;
	import com.xyz.qa.pages.AddCustomerPage;
	import com.xyz.qa.pages.BankManagerLoginPage;
	import com.xyz.qa.util.TestUtil;

	public class AddCustomerPageTestnegative extends TestBase{
		
		BankManagerLoginPage bankmanagerloginpage;
		AddCustomerPage addcustomerpage;
		TestUtil testutil;
		
		public AddCustomerPageTestnegative() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			bankmanagerloginpage = new BankManagerLoginPage();
			bankmanagerloginpage = bankmanagerloginpage.navigatetobankmanagerhome();
			addcustomerpage =bankmanagerloginpage.navigatetoaddcustomer();
		}
		
		//XYZ-T8//
		@Test(priority = 1)
		public void addcustomerttest() {
			// Adding customer invalid data//
			addcustomerpage.invaliddata();
			Assert.assertFalse(addcustomerpage.astcheck());

		}
		@AfterMethod
		public void tearDown(){
			driver.close();
		}

	} 

