package com.acttime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonweb {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		String str1=driver.getTitle();
		System.out.println(str1);
		String str2="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Thread.sleep(2000);
		if(str1.equals(str2))
		{
			System.out.println("home page ==>pass");
		}
		else
		{
			System.out.println("home page not display ==>fail");
		}
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("sriharshamishra.eee@gmail.com");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ap_password")).sendKeys("8512027132");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(10000);
		String str3="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String str4=driver.getTitle();
		if(str3.equals(str4))
		{
			System.out.println("login home page ==>pass");
		}
		else
		{
			System.out.println("login home page not display ==>fail");
		}
	
	    driver.findElement(By.xpath("//span[text()='Sign Out']")).click();   
	driver.close();
}
}
