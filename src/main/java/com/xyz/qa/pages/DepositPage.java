package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xyz.qa.base.TestBase;


public class DepositPage extends TestBase {
	
	@FindBy(xpath="//select[@id='accountSelect']")
	WebElement accountselection;
	
	@FindBy(xpath="//option[contains(text(),'1005')]")
	WebElement newaccountselect;
	
	@FindBy(xpath="//strong[contains(text(),'1005')]")
	WebElement actcheck;
	
	@FindBy(xpath="(//strong[@class='ng-binding'])[2]")
	WebElement balcheck;
	
	@FindBy(xpath="(//strong[@class='ng-binding'])[3]")
	WebElement currencycheck;
	
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement enteramt;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement depositbutton;
	
	@FindBy(xpath="//span[@class='fontBig ng-binding']")
	WebElement name;
	
	@FindBy(xpath="//span[contains(text(),'Deposit Successful')]")
	WebElement message1;
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	WebElement logout;
	
	
	public DepositPage(){
		
		PageFactory.initElements(driver, this);
		
	}	
	
	public void depositamt(){
		
		accountselection.click();
		newaccountselect.click();

	}
	
	public boolean verifyAccountNumber() {
		name.click();
		String beforeaccn = actcheck.getText();
		String afteraccn = accountselection.getText();
		return beforeaccn.equalsIgnoreCase(afteraccn);

	}
	
	public void verifybalandcur() {
		String balamt = balcheck.getText();
		System.out.println(balamt);
		
		String curamt= currencycheck.getText();
		System.out.println(curamt);

	}
	
	public void amttodeposit()
	{
		enteramt.sendKeys("5000");
		depositbutton.click();
		
	}
	
	public void invalidamttodeposit()
	{
		enteramt.sendKeys("-500");
		depositbutton.click();
		
	}
	
	public boolean msgtodisplay()
	
	{
		return message1.isDisplayed();
		
	}
	
	public void updatedbal() {
		String balamt = balcheck.getText();
		System.out.println(balamt);
		
		String curamt= currencycheck.getText();
		System.out.println(curamt);

	}
	
	public void lgt() {
		
		logout.click();
		
	}
	
}
