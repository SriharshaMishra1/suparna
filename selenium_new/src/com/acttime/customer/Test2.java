package com.acttime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		WebElement wbE=driver.findElement(By.id("identifierId"));
		wbE.sendKeys("sriharsha1964@gmail.com");
		WebElement wbB=driver.findElement(By.xpath("//span[text()='Next']"));
		wbB.click();
		Thread.sleep(2000);
		WebElement wbp=driver.findElement(By.name("password"));
		wbp.sendKeys("85120271322");
		WebElement wbn2=driver.findElement(By.xpath("//content[@class='CwaK9']"));
		wbn2.click();
		Thread.sleep(9000);
		WebElement wbimg=driver.findElement(By.xpath("//span[@class='gb_ab gbii']"));
		wbimg.click();
		Thread.sleep(2000);
		WebElement wbButton=driver.findElement(By.id("gb_71"));
		wbButton.click();
		driver.close();
	
		
	}

}
