package com.xyz.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.BankManagerLoginPage;
import com.xyz.qa.pages.CustomersPage;


import com.xyz.qa.util.TestUtil;

public class CustomersPageTest extends TestBase{

	BankManagerLoginPage bankmanagerloginpage;
	CustomersPage customerpage;
	TestUtil testutil;
	
	public CustomersPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		bankmanagerloginpage = new BankManagerLoginPage();
		bankmanagerloginpage = bankmanagerloginpage.navigatetobankmanagerhome();
		customerpage = bankmanagerloginpage.navigatetocustomers();
	
	}

	//XYZ-T7//
	@Test(priority = 1)
	public void addcustomerttest() {
		
		//Chechking Cutomers Actions in Bank Manager Login//
	
//		bankmanagerloginpage.navigatetobankmanagerhome();
//		bankmanagerloginpage.navigatetocustomers();
		customerpage.performact();

	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}
