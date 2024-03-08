package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.xyz.qa.base.TestBase;



public class HomePageChecking extends TestBase{
	
	@FindBy(xpath="//button[contains(text(),'Customer Login')]")
	WebElement customerlogin;
	
	@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
	WebElement BankManagerLogin ;
	
	@FindBy(xpath="//button[contains(text(),'Home')]")
	WebElement Homebutton;
	
	@FindBy(xpath="//strong[contains(text(),'XYZ Bank')]")
	WebElement Title;
	
	@FindBy(xpath="//label[contains(text(),'Your Name :')]")
	WebElement yourname;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]")
	WebElement heading;
	
	public HomePageChecking(){
		
		PageFactory.initElements(driver, this);
		
	}	
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public CustomerLoginPage navigatetocustomerlogin(){
		
		customerlogin.click();
		return new CustomerLoginPage();
	}
	
	public BankManagerLoginPage navigatetobankmanagerlogin() {
		
		BankManagerLogin.click();
		return new BankManagerLoginPage();
		
	}
	
	public void homebutton (){
		Homebutton.click();
		String name = yourname.getText();
		
	}
	
	public boolean verifycustomerlogin() {
		return yourname.isDisplayed();
	}
	
	public boolean verifybankmanagerlogin() {
		return heading.isDisplayed();
	}
}