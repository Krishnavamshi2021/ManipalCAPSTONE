package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class CustomersPage extends TestBase {

	@FindBy(xpath ="//input[@placeholder='Search Customer']")
	WebElement Srch;
	
	@FindBy(xpath ="//tbody/tr[3]/td[5]/button[1]")
	WebElement deldata;
	
	
	@FindBy(xpath ="//tbody/tr[3]/td[5]/button[1]")
	WebElement delbtn;
	
	@FindBy(xpath ="//button[contains(text(),'Home')]")
	WebElement hombtn;
	
public CustomersPage(){
		
		PageFactory.initElements(driver, this);
		
	}

public void performact(){
	
	Srch.click();
	deldata.click();
	delbtn.click();
	hombtn.click();
	
}

}
