package com.acttime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktest{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys(Keys.chord("amazon",Keys.ENTER));
		
		
		Thread.sleep(3000);
		//partialLinktext();
	//	driver.findElement(By.partialLinkText("Amazon")).click();
		//linkText()
		driver.findElement(By.partialLinkText("Amazon.com (@amazon) · Twitter")).click();
	}

}
