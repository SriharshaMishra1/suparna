package End_to_End;
import java.util.Iterator;
/**
 * 
 * @author sriharsha
 * 
 */
import java.util.List;
/**
 * 
 * @author sriharsha
 * 
 */
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genericlib.FileUtils;

public class Login {
	 @Test
	 public static void  EndtoEnd_CreationTest() throws Throwable
	{
		 FileUtils flib=new FileUtils();

		//properties data:
		Properties pobj=flib.getpropertyFileobject();
		String URL=pobj.getProperty("URL");
		String USERNAME=pobj.getProperty("USERNAME");
		String PASSWORD=pobj.getProperty("PASSWORD");
		Random num=new Random();
		
		//Excel data:
		String organisationName1=flib.getExcelData("Sheet1",1 , 1)+"_"+num.nextInt(200);
		String BillingAddress     =flib.getExcelData("Sheet1", 2, 1);
		String ShippingAddress    =flib.getExcelData("Sheet1", 3, 1);
        String description        = flib.getExcelData("Sheet1", 4, 1)+"_"+num.nextInt(100);                                 
 		String productName        =flib.getExcelData("Sheet1", 5, 1)+"_"+num.nextInt(100);
        String FirstName          =flib.getExcelData("Sheet1", 6, 1)+"_"+num.nextInt(100);
        String LastName           =flib.getExcelData("Sheet1", 7, 1)+"_"+num.nextInt(100);
        String description1       =flib.getExcelData("Sheet1", 8, 1)+"_"+num.nextInt(100);
        String QuoteSubject       =flib.getExcelData("Sheet1", 9, 1)+"_"+num.nextInt(100);
       // String Qty                =flib.getExcelData("Sheet1", 10, 1);
 		 
              WebDriver driver=new FirefoxDriver(); 
	     
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.get(URL);
	     
	      
		
		//user id
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		Thread.sleep(4000);
		driver.findElement(By.id("submitButton")).click();
      
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
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(description);
		Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='crmbutton small save'  and @type='button']")).click();;
		Thread.sleep(1000);
		
		//creation of Product:
		driver.findElement(By.linkText("Products")).click();;
		//lookup img
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(productName);
		Thread.sleep(100);
		//set date
		driver.findElement(By.xpath("//img[@id='jscal_trigger_sales_start_date']")).click();
		Thread.sleep(100);
	/*	int monthcount=0;
		while(monthcount<12)
		{
			try
		}
		String x="//td[@data-year='2019'and @data-month='1']/input[text()='13']";
					driver.findElement(By.xpath(x)).click();
					break;
	}
	catch(Throwable t)
	{
		
	}
	*/
		
		WebElement er=driver.findElement(By.xpath("//input[@id='unit_price']"));
		er.clear();
		er.sendKeys("4000");
		driver.findElement(By.xpath("//input[@id='tax1_check']")).click();
		driver.findElement(By.xpath("//input[@id='tax2_check']")).click();
		driver.findElement(By.xpath("//input[@id='tax3_check']")).click();
		
		//save
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(1000);
		//create Contact
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		Thread.sleep(1000);
		String str7="Mr.";
		boolean flag=false;
		WebElement b=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		//driver.findElement(By.xpath("//option[@value='Mr.']"));
		Select sel=new Select(b);
		//sel.selectByIndex(2);
		List<WebElement>lst=sel.getOptions();
		for(int i=0;i<=lst.size();i++)
		{
			String bv=lst.get(i).getText();
			if(str7.equals(bv))
			{
				sel.selectByVisibleText(str7);
				flag=true;
				break;
			}
		}
		
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
	Thread.sleep(500);
	driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@name='account_id']/following-sibling::img[contains(@src,'themes/softed/images/select.gif')]")).click();
	Thread.sleep(2000);
	Set<String>set=driver.getWindowHandles();
	 Iterator<String>it=set.iterator();
	 String parentwindow=it.next();
	 String childwindow=it.next(); 
	 driver.switchTo().window(childwindow);
	 System.out.println("after clicking on + contact1");
	 driver.findElement(By.xpath("//a[contains(text(),'"+organisationName1+"')]")).click();
	 System.out.println("after clicking on ");
	  Thread.sleep(2000);
	driver.switchTo().window(parentwindow);
	 
     driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(description1);
     Thread.sleep(500);
     //save
     driver.findElement(By.xpath("//input[@class='crmbutton small save'and @title='Save [Alt+S]']")).click();
     
     //Quote Creation
     driver.findElement(By.linkText("More")).click();
     driver.findElement(By.linkText("Quotes")).click();
     driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
     Thread.sleep(500);
     driver.findElement(By.xpath(" //input[@name='subject']")).sendKeys(QuoteSubject);
     
     //contactName lookup Handle
     driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@name='contact_name']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
     Thread.sleep(8000);

		 Set<String>set1=driver.getWindowHandles();
		 
		 Iterator<String>it1=set1.iterator();
		 String parentwindow1=it1.next();
		 String childwindow1=it1.next();
		 
		 driver.switchTo().window(childwindow1);
		 System.out.println("after clicking on + contact2");
		 driver.findElement(By.xpath("//a[contains(text(),'"+LastName+"')]")).click();
		 System.out.println("after clicking on "); 
		 Thread.sleep(2000);
		
		 driver.switchTo().window(parentwindow1);
		 	     
     
		  //Organisation Name:
 driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@id='single_accountid']/following-sibling::input[@name='account_id']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
   Thread.sleep(5000);
      Set<String>set2=driver.getWindowHandles();
	 
	 Iterator<String>it2=set2.iterator();
	 String parentwindow2=it2.next();
	 String childwindow2=it2.next();
	 
	 driver.switchTo().window(childwindow2);
	 System.out.println("after clicking on + contact3");
	 driver.findElement(By.xpath("//a[contains(text(),'"+organisationName1+"')]")).click();
	 System.out.println("after clicking on ");
	  driver.switchTo().window(parentwindow2);
	 	     Thread.sleep(2000);
	 	    driver.switchTo().window(parentwindow2);  
   
   
	 	 //iteam details:  	     
   driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
   Thread.sleep(3000);
   Set<String>set3=driver.getWindowHandles();
	 
	 Iterator<String>it3=set3.iterator();
	 String parentwindow3=it3.next();
	 String childwindow3=it3.next();
	 
	 driver.switchTo().window(childwindow3);
	 System.out.println("after clicking on + contact4");
	 driver.findElement(By.xpath("//a[contains(text(),'"+organisationName1+"')]")).click();
	 System.out.println("after clicking on ");
	  driver.switchTo().window(parentwindow3);
	 	     Thread.sleep(2000);
	 	    driver.switchTo().window(parentwindow3);
   
   //save
   driver.findElement(By.xpath("//input[@class='crmbutton small save'and@title='Save [Alt+S]']")).click();
   Thread.sleep(2000);
   
	 	    
	 	  
	 		 	    
	 	   driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("2");
	 	   Thread.sleep(5000);
 
  // validation
   WebElement ee=driver.findElement(By.xpath("//span[@class='lvtHeaderText']"));
   ee.getText();
  String exresult="BRAND - Editing Quote Information";
  String actresult="BRAND - Editing Quote Information";
  if(exresult.contains(actresult))
  {
  	System.out.println(ee.getText() + " created sucessfully");
  }
  else
  {
  	System.out.println("quote not created");
  }  
  Thread.sleep(3000);
  //signout:
   driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();   
   
}
}
