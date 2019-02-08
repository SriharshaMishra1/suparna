package com.acttime.customer;
	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.By.ById;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	/*
	 * 
	 * @author Sriharsha
	 * 
	 */
      	public class Actitime_assignment2 {
		private static Object ooo;

		public static void main(String[] args) throws Throwable {
			String username="admin";
			String password="manager";
			String pname="ring";
			String customerName="HDFC_148";
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(3000);
			String str1=driver.getTitle();
			String str2="actiTIME - Login";
			if(str1.equals(str2))
			{
				System.out.println("LOGIN_page Display==>true");
			}
			else
			{
				System.out.println("LOGIN_page Not Display==>False");
			}
			System.out.println(str1);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
			String str3=driver.getTitle();
			String str4="actiTIME - Enter Time-Track";
			if(str3.equals(str4))
			{
				System.out.println("HOME_page display==>True");
			}
			else
			{
				System.out.println("HOME_page is not display==>False");
			}
			System.out.println(str3);
			driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")).click();
			//System.out.println("Task Display in Home page");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
			//System.out.println("customer page display");
			driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys(customerName);
			
			//driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).click();
			//String ww1=driver.findElement(By.id("customerLightBox_nameField")).getAttribute("placeholder");
			//System.out.println(ww1);
			//System.out.println(cn);
			
			Thread.sleep(4000);
			driver.findElement(By.xpath(".//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			//String expmsg1=" has been successfully created";
			String expmsg="Customer "+'"'+customerName+'"'+" has been successfully created.";
			WebElement errwb=driver.findElement(By.xpath("//span[@class='successmsg']"));
			String actmsg=errwb.getText();
			System.out.println(actmsg);
			System.out.println(expmsg);
			if(actmsg.equals(expmsg))
			{
				System.out.println(" project name pass");
			}
			else
			{
				System.out.println(" project name fail");
		   } 
			if(actmsg.contains(customerName))
			{
				System.out.println("new customer created successfully");
			}
			else
			
			{
				System.out.println("new customer creation failed");
			}
			 Select dropdown = new Select(driver.findElement(By.name("selectedCustomer")));
			 dropdown.selectByVisibleText("ring");
			 driver.findElement(By.xpath("//input[@class='showCustomersButton']")).click();
			 List<WebElement>lst=dropdown.getOptions();
			 System.out.println(lst.size());
			 for(int i=0;i<lst.size();i++)
			 {
				 String ooo=lst.get(i).getText();
			 }
			 if(pname.equals(ooo))
			 {
				 System.out.println("customer name showing");
			 }
			 else
			 {
				 System.out.println("create a new customer");
			 }
			 driver.findElement(By.xpath("//input[@class='showCustomersButton']")).click();
			 
			 /*String actm="";
			 WebElement ppp=driver.findElement(By.name("selectedCustomer"));
			 actm=((WebElement) dropdown).getText();
			 String expt="ring";
			 if(actm.equals(expt))
			 {
				 System.out.println("customer page ring project display");
			 }
			 else
			 {
				 System.out.println("customer page ring project not display");
			 }  */
			 
			
			
			 
			 
		    
			
		}
}
			