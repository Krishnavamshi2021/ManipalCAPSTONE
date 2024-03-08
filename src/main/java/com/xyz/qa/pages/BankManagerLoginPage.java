package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class BankManagerLoginPage extends TestBase {
	
	@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
	WebElement mngloginbtn;
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement AddCust;
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	WebElement OpenAccnt;
	
	@FindBy(xpath="//button[@ng-click='showCust()']")
	WebElement showcust;

	@FindBy(xpath="//button[contains(text(),'Home')]")
	WebElement Homebutton;
	

	//Initializing the Page Objects:
	public BankManagerLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public BankManagerLoginPage navigatetobankmanagerhome() {
		mngloginbtn.click();
		return new BankManagerLoginPage();
		}
	
	public String validateBankManagerLoginPageTitle() {
		return driver.getTitle();
	}
	
	public AddCustomerPage navigatetoaddcustomer() {
		AddCust.click();
		return new AddCustomerPage();
		
	}
	
	public OpenAccountPage navigatetoopenacctpage(){
		OpenAccnt.click();
		return new OpenAccountPage();
	}

	public CustomersPage navigatetocustomers() {
		showcust.click();
		return new CustomersPage();
		
	}
	
}
