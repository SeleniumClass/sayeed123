package com.usa.ttjob;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GrcShop {
	@FindBy(how=How.XPATH,using=("//*[@id=\"columnLeft\"]/div[1]/div[1]"))
	private WebElement categroies;
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"columnRight\"]/div/div[1]/a"))
	
	private WebElement	ShoppingCart;
	
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"columnRight\"]/div/div[2]"))
	private WebElement Items;
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"tdb5\"]/span[2]"))
	private WebElement Continue;
	
	@FindBy(how=How.XPATH,using= ("//*[@id=\"tdb4\"]/span"))
	
	private WebElement SignOut;

	private WebElement getCategroies() {
		return categroies;
	}

	private WebElement getShoppingCart() {
		return ShoppingCart;
	}

	private WebElement getItems() {
		return Items;
	}

	private WebElement getContinue() {
		return Continue;
	}

	private WebElement getSignOut() {
		return SignOut;
	}
	
	
	
	
}
