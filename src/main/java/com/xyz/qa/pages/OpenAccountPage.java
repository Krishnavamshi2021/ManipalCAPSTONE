package com.xyz.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class OpenAccountPage extends TestBase{
	
	@FindBy(xpath="//select[@id='userSelect']")
	WebElement custnamedd;
	
	@FindBy(xpath="//option[contains(text(),'Harry Potter')]")
	WebElement selectnamefrmdd;
	
	
	@FindBy(xpath="//select[@id='currency']")
	WebElement currencydd;
	
	@FindBy(xpath="//option[contains(text(),'Rupee')]")
	WebElement selectcurdd;
	
	@FindBy(xpath="//button[contains(text(),'Process')]")
	WebElement processbtn;
	
	@FindBy(xpath ="//button[contains(text(),'Home')]")
	WebElement hombtn;
	
	@FindBy(xpath ="//button[contains(text(),'Bank Manager Login')]")
	WebElement astcheck2;
	
public OpenAccountPage(){
		
		PageFactory.initElements(driver, this);
		
	}
public void senddata(){
	
	custnamedd.click();
	selectnamefrmdd.click();
	currencydd.click();
	selectcurdd.click();
	processbtn.click();
	Alert alt2 = driver.switchTo().alert();
	alt2.accept();
	hombtn.click();
	
}
public boolean astcheck(){
	return astcheck2.isDisplayed();
 }
	
}