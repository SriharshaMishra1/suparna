package com.acttime.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	Thread.sleep(3000);
	String pTitle=driver.getTitle();
	System.out.println(pTitle);
	if(pTitle.equals("Gmail"))
	{
		System.out.println("login page is displayed==>pass");	
	}
	else
	{
		System.out.println("login page is displayed==>false");
	}
	String pageURL=driver.getCurrentUrl();
	System.out.println(pageURL);
	//System.out.println(driver.getPageSource());
	//driver.close();
}
}
