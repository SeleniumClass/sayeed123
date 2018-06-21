package com.usa.ttjob;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aspose.pdf.Operator.BT;

public class PHPtravel {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		
		PHPtravelpagefactory btn = new PHPtravelpagefactory(driver);
		
		btn.getMyAccount().click();
		btn.getLogin().click();
        btn.getEmail().sendKeys("bakulmiahit@email.com");
        btn.getPassword().sendKeys("BmQg273CnDS");
        
        
//        btn.getArrivele();
//        btn.getAirportName();
//        btn.getDepartues();
      
//        btn
//        
//        
        
        
        
	}

}
