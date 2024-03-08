package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class WithdrawlPage extends TestBase {

	@FindBy(xpath ="//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
	WebElement entramt;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement withdrawlbutn;

	@FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
	WebElement message;
	
	@FindBy(xpath = "//span[contains(text(),'Transaction Failed. You can not withdraw amount mo')]")
	WebElement message2;
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	WebElement logout;
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	WebElement withdrawl;

	public WithdrawlPage() {

		PageFactory.initElements(driver, this);

	}
	

	public void amttowhitdrawl() {
		entramt.click();
		entramt.sendKeys("100");
		withdrawlbutn.click();
	}

	public void amttowhitdrawlinvalid() {
		entramt.click();
		entramt.sendKeys("-200");
		withdrawlbutn.click();
	}
	

	public boolean msgtodisplay()

	{
		return message2.isDisplayed();

	}
	
	public boolean msgtodisplay2()

	{
		return message2.isDisplayed();

	}
	
	
	
	public void lout() {
		
		logout.click();
		
	}
}