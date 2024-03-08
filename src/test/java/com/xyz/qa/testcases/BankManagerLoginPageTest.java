package com.xyz.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerLoginPage;

import com.xyz.qa.util.TestUtil;

public class BankManagerLoginPageTest extends TestBase{
	
	BankManagerLoginPage bankmanagerloginpage;
	TestUtil testutil;
	
	

	public BankManagerLoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		bankmanagerloginpage = new BankManagerLoginPage();
	}
	

	@Test(priority = 1)
	public void bankmanagerloginpagetest() {
		
	//Checking for bank manager Login//
		bankmanagerloginpage = bankmanagerloginpage.navigatetobankmanagerhome();
		Assert.assertEquals(bankmanagerloginpage.validateBankManagerLoginPageTitle(),"XYZ Bank");

	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
