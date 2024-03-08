package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class CustomerLoginPage extends TestBase{
		
		//Page Factory - OR:
		@FindBy(xpath="//button[contains(text(),'Customer Login')]")
		WebElement customerloginbutton;
		
		@FindBy(xpath="//select[@id='userSelect']")
		WebElement dropdown;
		
		@FindBy(xpath="//option[contains(text(),'Harry Potter')]")
		WebElement name;
		
		@FindBy(xpath="//button[contains(text(),'Login')]")
		WebElement Loginbutton;
		
		@FindBy(xpath="//span[contains(text(),'Harry Potter')]")
		WebElement message;
		
		@FindBy(xpath="//button[@ng-click='deposit()']")
		WebElement deposit;
		
		@FindBy(xpath="//button[@ng-click='withdrawl()']")
		WebElement withdrawl;
		
		@FindBy(xpath="//button[@ng-click='transactions()']")
		WebElement Transactions;
		
//		@FindBy(xpath="//button[@class='btn btn-lg tab'])[2]")
//		WebElement Depositclick;
//		
//	@FindBy(xpath="//button[@class='btn btn-lg tab'])[3]")
//	WebElement withdrawlclick;
//		
		
		
		
		
		//Initializing the Page Objects:
		public CustomerLoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public CustomerLoginPage navigatetocustomerselection() {
		customerloginbutton.click();
		dropdown.click();
		name.click();
		Loginbutton.click();
		return new CustomerLoginPage();
		}
		public boolean navigatetocustomerhomepage() {
		return message.isDisplayed();
		}
	
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public DepositPage navigatetodeposit() {
			deposit.click();
			return new DepositPage();
			
		}
		
		public WithdrawlPage navigatetowithdrawl(){
			withdrawl.click();
			return new WithdrawlPage();
		}
	
		public TransactionPage navigatetotransactions() {
			Transactions.click();
			return new TransactionPage();
			
		}

	

	
}
		
	
	
