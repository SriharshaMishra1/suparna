package com.acttime.customer;

import java.io.FileInputStream;
import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import com.sun.javafx.scene.control.Properties;

public class Search_quote_using_createFilters_samecolumns {
	public static void main(String[] args) throws Throwable {
		 
		 
		
	
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();

driver.get("URL");
String str=driver.getTitle();

String str1=driver.getTitle();
String str2="vtiger CRM 5 - Commercial Open Source CRM";
if(str1.equals(str2))
{
	System.out.println("LOGIN_page Display");
}
else
{
	System.out.println("LOGIN_page Not Display");
}

driver.findElement(By.name("user_name")).sendKeys("USERNAME");
driver.findElement(By.name("user_password")).sendKeys("PASSWORD");
Thread.sleep(2000);
String r4=driver.getCurrentUrl();
String r5="http://localhost:8888/index.php?action=index&module=Home";
if(r5.equals(r4))
{
	System.out.println("Home page Display");
}
else
{
	System.out.println("Home_page Not Display");
}

driver.findElement(By.id("submitButton")).click();
Thread.sleep(2000);


WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
Actions act=new Actions(driver);
act.moveToElement(wb).perform();
driver.findElement(By.xpath("//a[text()='Quotes']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
Thread.sleep(3000);
//driver.findElement(By.name("column2"));
WebElement wb1= driver.findElement(By.id("column7"));
//select[@id='column7']

Select sei=new Select(wb1);
sei.selectByVisibleText("Carrier");
WebElement wb2= driver.findElement(By.id("column8"));
Select sei1=new Select(wb2);
sei1.selectByVisibleText("Carrier");


//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();




}
}
