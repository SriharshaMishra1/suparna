package com.acttime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(20000);
		String expage="amazon Sign";
		String actPage=driver.getTitle();
		if(expage.contains(actPage))
		{
			System.out.println("login page is verified==>PASS");
		}
		else
		{
			System.out.println("login page is not verified==>FAIL");
		}
		
		driver.findElement(By.id("identifierId")).sendKeys("sriharshamishra.eee");
				
		WebElement wnxt=driver.findElement(By.id("continue"));
		                wnxt.click();
		  Thread.sleep(5000);
		      driver.findElement(By.id("signINsubmit")).sendKeys("8512027132");
		      Thread.sleep(20000);
		      String exhomepage="your Amazon";
		      String acthomepage=driver.getTitle(); 
		      
		      if(exhomepage.contains(acthomepage))
		      {
		    	  System.out.println("login page is verified==>PASS");
		      }
		      else
		      {
		    	  System.out.println("login page is not verified==>fail");
		      }
		      driver.findElement(By.xpath("//span[@class='nav-line.2']")).click();
		      Thread.sleep(20000);
		      driver.findElement(By.id("nav-text")).click();
		      
		      
		      
		      
		
	}

}
