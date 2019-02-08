package com.acttime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACTITIME_test {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	driver.manage().window().maximize();
	String str=driver.getTitle();
    System.out.println(str);
    String str1="actiTIME - Login";
    Thread.sleep(8000);
    if(str.equals(str1))
    {
    	System.out.println("actitime-login-->pass");
    }
    else
    {
    	System.out.println("actitime-login-->pass");
    }
    driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
   driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
}
}
