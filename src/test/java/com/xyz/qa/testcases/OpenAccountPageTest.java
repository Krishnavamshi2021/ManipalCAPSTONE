package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerLoginPage;
import com.xyz.qa.pages.OpenAccountPage;
import com.xyz.qa.util.TestUtil;

public class OpenAccountPageTest extends TestBase {
	
	BankManagerLoginPage bankmanagerloginpage;
	OpenAccountPage openaccountpage;
	TestUtil testutil;
	
	public OpenAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		bankmanagerloginpage = new BankManagerLoginPage();
		bankmanagerloginpage = bankmanagerloginpage.navigatetobankmanagerhome();
		openaccountpage = bankmanagerloginpage.navigatetoopenacctpage();
	}
	//XYZ-T6//
	@Test(priority = 1)
	public void addcustomerttest() {
		
//	Opening Account//
//		bankmanagerloginpage.navigatetobankmanagerhome();
//		bankmanagerloginpage.navigatetoopenacctpage();
		openaccountpage.senddata();
		 Assert.assertTrue(openaccountpage.astcheck());
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}


	}
