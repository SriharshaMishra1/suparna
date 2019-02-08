package com.acttime.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Search_quote_using_In_dropdown {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("tiger");
		Thread.sleep(6000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		
		WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[text()='Quotes']")).click();
		//driver.findElement(By.xpath("//a[text()='Quotes']")).click();
		
		
		WebElement we=driver.findElement(By.xpath(".//*[@id='bas_searchfield']"));
		Select sai=new Select(we);
		sai.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
