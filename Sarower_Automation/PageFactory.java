package com.usa.ttjob;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class  PageFactory {

	
	
	@FindBy(how=How.XPATH,using="(//*[contains(text(),'Sing in')])[2]")
private WebElement singinbtn;

	private WebElement getSinginbtn() {
		return singinbtn;
	}

	private void setSinginbtn(WebElement singinbtn) {
		this.singinbtn = singinbtn;
	}
}


