package com.usa.ttjob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PHPtravelpagefactory {
	
		WebDriver driver;
		public PHPtravelpagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
				}
	
	
	
	@FindBy(how=How.XPATH,using = "(//*[@id=\"li_myaccount\"]/a)[2]")
	private WebElement MyAccount;
	
	
	@FindBy(how=How.XPATH,using=("(//*[@id=\"li_myaccount\"]/ul/li[1]/a)[2]"))
	private WebElement Login;
	
	

	@FindBy(how=How.XPATH,using=("//*input[*class='from-control padding-10']"))
	private WebElement Email;
	

	@FindBy(how=How.XPATH,using=("//input[*class='from-control padding-10']"))
	private WebElement Password;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"headersignupform\"]/div[3]/input"))
	private WebElement firstName;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"headersignupform\"]/div[4]/input"))
	private WebElement LastName;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"headersignupform\"]/div[5]/input"))
	private WebElement MobileNumber;

	@FindBy(how=How.XPATH,using=("//*[@id=\"headersignupform\"]/div[6]/input"))
	private WebElement Email2;
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"headersignupform\"]/div[7]/input"))
	private WebElement Password2;
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"headersignupform\"]/div[8]/input"))
	private WebElement confirmPassword;
	
     
	@FindBy(how=How.XPATH,using=("//*[@id=\"select2-drop\"]/div/input"))
	private WebElement AirportName;
	
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"select2-drop\"]/div/input"))
	private WebElement  jfk;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"select2-drop\"]/div/input"))
	private WebElement mumias;


	@FindBy(how=How.XPATH,using=("//*[@id=\"flights\"]/form/div[3]/div/input"))
	private WebElement departues;
	
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"flights\"]/form/div[9]/div[2]/div/label"))
	private WebElement roundtrip;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"flights\"]/form/div[4]/div/input"))
	private WebElement arrivele;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"flights\"]/form/div[5]/div/i"))
	private WebElement pasnger;
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"flights\"]/form/div[5]/div/i"))
	private WebElement first;
	
	

	@FindBy(how=How.XPATH,using=("//*[@id=\"flights\"]/form/div[5]/div/i"))
	private WebElement search;
	
	
	@FindBy(how=How.XPATH,using=(""))
	private WebElement delta;
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMyAccount() {
		return MyAccount;
	}


	public WebElement getLogin() {
		return Login;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getMobileNumber() {
		return MobileNumber;
	}


	public WebElement getEmail2() {
		return Email2;
	}


	public WebElement getPassword2() {
		return Password2;
	}


	public WebElement getConfirmPassword() {
		return confirmPassword;
	}


	public WebElement getAirportName() {
		return AirportName;
	}


	public WebElement getJfk() {
		return jfk;
	}


	public WebElement getMumias() {
		return mumias;
	}


	public WebElement getDepartues() {
		return departues;
	}


	public WebElement getRoundtrip() {
		return roundtrip;
	}


	public WebElement getArrivele() {
		return arrivele;
	}


	public WebElement getPasnger() {
		return pasnger;
	}


	public WebElement getFirst() {
		return first;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getDelta() {
		return delta;
	}

	
}
