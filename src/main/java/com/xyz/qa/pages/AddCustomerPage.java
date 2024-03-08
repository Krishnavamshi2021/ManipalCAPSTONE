package com.xyz.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class AddCustomerPage  extends TestBase {
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement PostalCode;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement submit;
	
	@FindBy(xpath="//label[contains(text(),'First Name :')]")
	WebElement chechking;	

public AddCustomerPage(){
		
		PageFactory.initElements(driver, this);
		
	}	
public void adddata(){
	
	FirstName.sendKeys("Krishna");
	LastName.sendKeys("Vamshi");
	PostalCode.sendKeys("518003");
	submit.click();
	Alert alt1 = driver.switchTo().alert();
	 alt1.accept();
	
}

 public void invaliddata() {
	 
	 FirstName.sendKeys("Krish12na");
		LastName.sendKeys("Vam123shi");
		PostalCode.sendKeys("518003");
		submit.click();
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
 }
 
 public boolean astcheck(){
	return chechking.isDisplayed();
 }
 
 }
 
 




