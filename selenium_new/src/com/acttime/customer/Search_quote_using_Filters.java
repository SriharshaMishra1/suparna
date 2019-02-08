package com.acttime.customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Search_quote_using_Filters {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("tiger");
	Thread.sleep(1000);
	//matching the title
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
			Thread.sleep(6000);
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(2000);
	
	//Home page url
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

	
	WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
	Actions act=new Actions(driver);
	act.moveToElement(wb).perform();
	driver.findElement(By.xpath("//a[text()='Quotes']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
	
	 String shyam="Brand_Laptop";
		boolean flag5=false;
	WebElement wb5=driver.findElement(By.xpath("//select[@name='viewname']"));
		//Actions great1=new Actions(driver);
	Select great=new Select (wb5);
	//grn1.moveToElement(driver.findElement(By.xpath("//select[@name='column6']"))).perform();
	//grn1.selectByVisibleText("Sub Total");///////////////
	List<WebElement>last=great.getOptions();
	for(int i=0;i<last.size();i++)
	{
		String b=last.get(i).getText();
		if(shyam.equals(b))
		{
			great.selectByVisibleText(shyam);
			flag5=true;
			break;
		}
	}
	if(flag5==true)
	{
		System.out.println("Brand_Laptop successfully created");
	}
	else
	{
		System.out.println("Brand_Laptop Not successfully created");
	}     

	
  WebElement wc=driver.findElement(By.xpath("//select[@name='viewname']"));
   Select sai1=new Select(wc);
   sai1.selectByIndex(3);
  Thread.sleep(5000);

  
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

}

}
