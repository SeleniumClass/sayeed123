package com.usa.ttjob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrbite {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Srpat\\eclipse\\Sarowar_Automationnew\\Driver\\chromedriver.exe");
		
			
        WebDriver driver =new ChromeDriver();
         driver.get("https://www.orbitz.com/");
        driver.manage().window().maximize();
        
        
       WebElement account =driver.findElement(By.xpath("//*[@id=\"header-account-menu\"]"));
        
       WebElement signin  =  driver.findElement(By.xpath("//*[@id=\"header-account-signin-button\"]"));
        
       WebElement email   = driver.findElement(By.xpath("//*[@id=\"signin-loginid\"]"));
        
       WebElement password= driver.findElement(By.xpath("//*[@id=\"signin-password\"]"));
        
   
	}
}
