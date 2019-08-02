package com.qa.pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test10 {
  @Test
public void Gmail() throws InterruptedException
  {
  
	// Mozilla firefox driver initialization or installation
		
		System.setProperty("webdriver.gecko.driver","C:\\AutomationSoftwares\\BrowserDrivers\\geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
              driver.manage().window().maximize();
              String URL="https://www.Gmail.com/";
      		
	               driver.get(URL);
	               
	               WebElement element=driver.findElement(By.id("identifierId"));
     		       element.sendKeys("appstech76@gmail.com");
     				       		
     		      driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
     		      Thread.sleep(1000);
 		
     		      driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("prasad@123");
//     		      		       		
     		   driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
     		    Thread.sleep(1000);
//		       driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
//		       
//		       driver.findElement(By.xpath("//span[@class='gb_Aa gbii']")).click();
//		       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//
//		        driver.findElement(By.partialLinkText("Sign out")).click();
//
//		        System.out.println("Sign out");
  
	  
	  
  }
  
}
