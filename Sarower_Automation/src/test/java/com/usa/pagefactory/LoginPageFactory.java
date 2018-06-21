 package com.usa.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"tdb3\"]/span[2]"))
			private WebElement Myaccount; 
	
	@FindBy(how=How.XPATH,using="(//*[@class='ui-button-text'])[3]")
			
	private WebElement Sinin;
	
	
	@FindBy(how=How.XPATH,using="(//*[@class='ui-button-text'])[2]")
	private WebElement checkout;

	@FindBy(how=How.XPATH,using="//*[@id=\"bodyContent\"]/div[2]/div/form/table/tbody/tr[1]/td[2]/input")
	private WebElement email;

	@FindBy(how=How.XPATH,using="//*[@id=\"bodyContent\"]/div[2]/div/form/table/tbody/tr[2]/td[2]/input")
	private WebElement password;

	@FindBy(how=How.XPATH,using="//*[@id=\"tdb5\"]/span[1]")
	private WebElement singinbtn;

	private WebElement getMyAccount() {
		return Myaccount;
	}

	private WebElement getCheckout() {
		return checkout;
	}

	private WebElement getEmail() {
		return email;
	}

	private WebElement getPassword() {
		return password;
	}

	private WebElement getSinginbtn() {
		return singinbtn;
	}



	



	}

	
	

