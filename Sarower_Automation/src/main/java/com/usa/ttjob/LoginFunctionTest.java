package com.usa.ttjob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionTest {
	
	public  WebDriver login(WebDriver driver) throws Throwable{

		System.setProperty("webdriver.driver.chrome","\\Users\\Srpat\\eclipse\\Sarowar_Automationnew\\Driver\\chromedriver.exe."); 
		 driver=new ChromeDriver();
        driver.manage().window().maximize(); 
         
         
        driver.get("https://www.google.com/search?q=www+gcrit.com%2Fbuild3&oq=ww&aqs=chrome.0.69i59j69i60l4j69i57.2520j0j7&sourceid=chrome&ie=UTF-8");

        driver.findElement(By.className("ui-button-text")).click();
        
       // WebElement myaccountBtn=findelEment(By.xpath("ui-button-text"));
         //JavascriptExecutor object = (JavascriptExecutor) driver; 
		driver.findElement(By.xpath("//*[@type='text'])[2]")).click();
        driver.findElement(By.xpath("//*[@type='text'])[2]")).click();
	    driver.findElement(By.xpath("//*[type='password']);[1]"));
	    driver.findElement(By.xpath("//*[@clss=//*[@id=\"tdb5\"]/span[2]"));
		return driver;
	    
	    
	    //validation
	  //  Assert.assertEquals().equalIgnoreCase("GCR shop")){
	    	//varification
	    	//if (driver.getTitle().)
	    }
	   	
	

}
