package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class TransactionPage extends TestBase{
	
	@FindBy(xpath = "//thead/tr[1]/td[1]")
	WebElement history;
	
	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	WebElement resetbt;
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	WebElement logout;
	
	


public TransactionPage() {

	PageFactory.initElements(driver, this);

}

public void seedata() {
	String msg = history.getText();
	boolean result = msg.equalsIgnoreCase("Date-Time");
	if (result = true) {
		System.out.println("Data is Present");
	}

}
 public void reseting() {
	  resetbt.click();
	  System.out.println("No Transaction Data Present");
	 
 }

// public void lgt() {
//	 logout.click();
// }
// 

}

