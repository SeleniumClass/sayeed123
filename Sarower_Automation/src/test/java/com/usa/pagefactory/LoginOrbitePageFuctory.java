package com.usa.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginOrbitePageFuctory {
	
	

    
    @FindBy (how=How.XPATH,using =("//*[@id=\"header-account-menu\"])"))
     private WebElement Account;
     
    @FindBy (how=How.XPATH,using =("//*[@id=\"header-account-signin-button\"]"))
     private WebElement Sinin;
    
    @FindBy (how=How.XPATH,using="//*[@id=\"signin-loginid\"]")
     private WebElement email;
    
   @FindBy (how=How.XPATH,using=("//*[@id=\"signin-password\"]"))
     private WebElement password;

private WebElement getAccount() {
	return Account;
}

private WebElement getSinin() {
	return Sinin;
}

private WebElement getEmail() {
	return email;
}

private WebElement getPassword() {
	return password;
}

}	


