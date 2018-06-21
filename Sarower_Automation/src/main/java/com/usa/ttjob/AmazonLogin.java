package com.usa.ttjob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver","\\Users\\Srpat\\eclipse\\Sarowar_Automationnew\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='nav-line-2'][7]"));


	driver.findElement(By.xpath("//a[@id='nav-your-amazan']"));

	    driver.findElements(By.xpath("//a[@class='nav-a'][3]"));
	    
	    
	    driver.findElements(By.xpath("//a[@class='nav-a'][4]"));
	    
	   
	    
	    driver.findElements(By.xpath("(//a[@class='nav-a'])[6]"));
	    
	   
	    
	    driver.findElements(By.xpath("(//a[@class='nav-a'])[7]"));
	    
	    
	    
	    driver.findElements(By.xpath("(//a[@class='nav-a'])[8]"));
	    	
	    
	    
	    driver.findElements(By.xpath("(//a[@class='nav-a'])[9]"));
	    
	    
	    
	    driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
	    
	   
	    
	    driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a[7]"));
	    
	   
	    
	    driver.findElements(By.xpath("//*[@id=\"ap_email\"]"));
	    
	    
	    
	    

		}

}
