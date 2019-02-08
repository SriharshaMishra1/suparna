package Pravakar;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Search_quote_using_createFilters_samecolumns {
		public static void main(String[] args) throws Throwable {
			
		
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();

	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
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

	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("tiger");
	Thread.sleep(6000);

	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(3000);
	
	
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
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
	Thread.sleep(3000);
	
	//driver.findElement(By.name("column2"));
	WebElement wb1= driver.findElement(By.id("column7"));
	driver.findElement(By.xpath("//input[@name='viewName']")).sendKeys("Toshiba");
	
	Select sei=new Select(wb1);/////////////importan///////////////
	sei.selectByVisibleText("Carrier");
	
	// Duplicate Carrier taken due to showing error message
	WebElement wb2= driver.findElement(By.id("column8"));/////////////importan///////////////
	Select sei1=new Select(wb2);
	sei1.selectByVisibleText("Carrier");
	
	//Handling error message
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	Thread.sleep(2000);
	
	
	String r1="Carrier";
	boolean flag=false;
	WebElement d5=driver.findElement(By.id("column8"));
	Select T1=new Select(d5);
	List<WebElement> k=T1.getOptions();
	for(int i=0;i<k.size();i++)
	{
		String a1=k.get(i).getText();
		if(r1.equals(a1))
		{
			T1.selectByVisibleText(r1);
			flag=true;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println("Error msg created successfully");
	}
	else
	{
		System.out.println("Error msg not created");
	}
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();

	
	String str4="Columns cannot be duplicated";
	String str6=alt.getText();
	if(str4.equals(str6))
		
	
	
	/*	String str5="Columns cannot be duplicated";
	WebElement wb5=driver.findElement(By.xpath("//select[@name='column8']"));
	String find=wb5.getText();
	System.out.println(find);
	if(str5.equals(wb5))
	{
		System.out.println("Error msg is successfully showing");
	}
	else
	{
		System.out.println("Error msg is showing");
	}*/
	
	

	/*String str9="Columns cannot be duplicated";
	String str10=alt.getText();
	
	if(str9.equals(str10))
	{
		System.out.println("Error msg is successfully showing");
	}
	else
	{
		System.out.println("Error msg is showing");
	}
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	//Alert alt1=driver.switchTo().alert();
	//System.out.println(alt1.getText());
	//alt.accept();
	
	  /*String d1="Columns cannot be duplicated";
	WebElement r=driver.findElement(By.id("column8"));
	String d2=r.getText();
	System.out.println(d2);
	if(d1.equals(d2))
	{
		System.out.println("Error msg is successfully showing");
	}
	else
	{
		System.out.println("Error msg is showing");
	}*/
	
	
	

	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		
}
		}
