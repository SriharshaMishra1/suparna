package com.acttime.customer;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericlib.FileUtils;




public class Search_quote_using_createFilters_editandcancel{
	
		 @Test
		 public static void  editandcancel_CreationTest() throws Throwable
		{
			 FileUtils flib=new FileUtils();

			//properties data:
			Properties pobj=flib.getpropertyFileobject();
			String URL=pobj.getProperty("URL");
			String USERNAME=pobj.getProperty("USERNAME");
			String PASSWORD=pobj.getProperty("PASSWORD");
			Random num=new Random();
			
			//Excel data:
			String organisationName1=flib.getExcelData("Sheet1",1 , 1);
			String BillingAddress     =flib.getExcelData("Sheet1", 2, 1);
			String ShippingAddress    =flib.getExcelData("Sheet1", 3, 1);
	        String description        = flib.getExcelData("Sheet1", 4, 1)+"_"+num.nextInt(100);                                 
	 		String productName        =flib.getExcelData("Sheet1", 5, 1)+"_"+num.nextInt(100);
	        String FirstName          =flib.getExcelData("Sheet1", 6, 1)+"_"+num.nextInt(100);
	        String LastName           =flib.getExcelData("Sheet1", 7, 1);
	        String description1       =flib.getExcelData("Sheet1", 8, 1)+"_"+num.nextInt(100);
	        String QuoteSubject       =flib.getExcelData("Sheet1", 9, 1)+"_"+num.nextInt(100);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		String str=driver.getTitle();
	    //System.out.println(str);
		
		//user id
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		//password
		driver.findElement(By.name("user_password")).sendKeys("tiger");
		Thread.sleep(6000);
		
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
		
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		
		
		//matching the current url
		String r1=driver.getCurrentUrl();
	     //System.out.println(r1);
		String r2="http://localhost:8888/index.php?action=index&module=Home";
		if(r1.equals(r2))
		{
			System.out.println("Home page Display");
		}
		else
		{
			System.out.println("Home_page Not Display");
		}
		

		//Organization creataion:
		driver.findElement(By.xpath("//a[text()='Organizations' and @href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(organisationName1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(BillingAddress);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys(ShippingAddress);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(description );
		Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='crmbutton small save'  and @type='button']")).click();
	   Thread.sleep(5000);    
	
	   
	   
		
		 //Quote Creation
	     driver.findElement(By.linkText("More")).click();
	     driver.findElement(By.linkText("Quotes")).click();
	     driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
	     //Thread.sleep(500);
	     //driver.findElement(By.xpath(" //input[@name='subject']")).sendKeys("smart_key");
	    
	     driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@name='contact_name']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
	     Thread.sleep(1000);
			 Set<String>set1=driver.getWindowHandles(); 
			 Iterator<String>it1=set1.iterator();
			 String parentwindow1=it1.next();                  
			 String childwindow1=it1.next();
			 driver.switchTo().window(childwindow1);
			 System.out.println("after clicking on + contact2");
			 Thread.sleep(4000);
			 driver.findElement(By.id("search_txt")).sendKeys(LastName);
			 driver.findElement(By.xpath("html/body/table/tbody/tr/td/table[2]/tbody/tr/td/form/table/tbody/tr[1]/td[4]/input")).click();
			 Thread.sleep(8000);
			 System.out.println("check this");
			// driver.findElement(By.xpath("//a[contains(text(),'"+LastName+"')]")).click();
			 driver.findElement(By.xpath("//a[text()='sriharsha mishra']")).click();
			 Thread.sleep(8000);
			 driver.switchTo().alert().accept();
			 System.out.println("after clicking on "); 
			 Thread.sleep(2000);
			
			 driver.switchTo().window(parentwindow1);   
			 
			 
			  //Organisation Name:
			 System.out.println("comes to organisation lookup img");
			 //driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@id='single_accountid']/following-sibling::input[@name='account_id']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
			 driver.findElement(By.xpath("//table[@class='small']/tbody/tr[7]/td[4]/img")).click();
			   Thread.sleep(2000);
			     Set<String>set2=driver.getWindowHandles();
				 
				 Iterator<String>it2=set2.iterator();
				 String parentwindow2=it2.next();
				 String childwindow2=it2.next();
				 driver.switchTo().window(childwindow2);
				 
				 System.out.println("after clicking on + contact3");
				 
				 driver.findElement(By.id("search_txt")).sendKeys(organisationName1);
				 driver.findElement(By.xpath("//input[@name='search']")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'"+organisationName1+"')]")).click();
				 System.out.println("after clicking on ");
				  driver.switchTo().window(parentwindow2);
				 	     Thread.sleep(2000);
				 	    driver.switchTo().window(parentwindow2);  
				 	   System.out.println("comes to organisation lookup img but not Handle");
			   
				 	 //iteam details:  	     
			   driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
			   Thread.sleep(3000);
			   Set<String>set3=driver.getWindowHandles();
				 
				 Iterator<String>it3=set3.iterator();
				 String parentwindow3=it3.next();
				 String childwindow3=it3.next();
				 
				 driver.switchTo().window(childwindow3);
				 System.out.println("after clicking on + contact4");
				 driver.findElement(By.id("search_txt")).sendKeys(productName);
				 driver.findElement(By.xpath("//input[@name='search']")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]")).click();
				 
				 System.out.println("after clicking on ");
				  driver.switchTo().window(parentwindow3);
				 	     Thread.sleep(2000);
				 	    driver.switchTo().window(parentwindow3);
			   
			 	     	
			 	     
	/*	//go to more option and click Quote
		WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[text()='Quotes']")).click();
		Thread.sleep(3000);    */
		
		//verification
		driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
		WebElement wb9=driver.findElement(By.xpath("//input[contains(@onblur,'this.className')]"));
		wb9.sendKeys("Brand_shoe");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	     //drop down to select Brand_shoe
	     String str4="Brand_shoe";
		boolean flag=false;
		driver.findElement(By.id("viewname")).click();	
		WebElement wb2=driver.findElement(By.xpath("//select[@name='viewname']"));
		Select ver=new Select(wb2);
		List<WebElement> lst=ver.getOptions();
		//System.out.println(lst);
		for(int i=0;i<=lst.size();i++)
		{
			String str5=lst.get(i).getText();
			if(str4.equals(str5))
			{
				ver.selectByVisibleText(str4);
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Open Quotes Available");
		}
		else
		{
			System.out.println("Open Quotes Not Available");
		}
		//ver.selectByIndex(3);
		Thread.sleep(2000);
		
		
		//drop down to  select sub Total 
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(3000);
		String ram="Sub Total";
		boolean flag1=false;
	WebElement wb3=driver.findElement(By.xpath("//select[@name='column6']"));
		//Actions grn=new Actions(driver);
	Select grn1=new Select (wb3);
	//grn1.moveToElement(driver.findElement(By.xpath("//select[@name='column6']"))).perform();
	//grn1.selectByVisibleText("Sub Total");///////////////
	List<WebElement>fst=grn1.getOptions();
	for(int i=0;i<fst.size();i++)
	{
		String a=fst.get(i).getText();
		if(ram.equals(a))
		{
			grn1.selectByVisibleText(ram);
			flag1=true;
			break;
		}
	}
	if(flag1==true)
	{
		System.out.println("Sub Total is Available");
	}
	else
	{
		System.out.println("Sub Total is not Available");
	}
	Thread.sleep(2000);
	
	//verification after edit
	WebElement wb11=driver.findElement(By.xpath("//input[contains(@onblur,'this.className')]"));
	wb11.clear();
	WebElement wb10=driver.findElement(By.xpath("//input[contains(@onblur,'this.className')]"));
	wb10.sendKeys("Brand_Laptop");
	
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	Thread.sleep(4000);
	
// editable result in drop down	
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
	System.out.println("Brand_Lapton successfully edited");
}
else
{
	System.out.println("Brand_Lapton Not successfully edited");
}     

	
//  Sign out//	
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	
	
	
	//Thread.sleep(4000);
	//grn1.click(wb3).perform();
	//WebElement wr=driver.findElement(By.xpath("//select[@id='column6']"));
	//Select guu=new Select(wr);
	//guu.selectByVisibleText("Carrier");
	//Thread.sleep(2000);
	//Alert alert=driver.switchTo().alert();           
	}

}
