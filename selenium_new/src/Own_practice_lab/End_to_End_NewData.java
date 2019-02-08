package Own_practice_lab;
	import java.util.List;
	/**
	 * 
	 * @author sriharsha
	 * 
	 */

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class End_to_End_NewData {
		public static void main(String[] args) throws InterruptedException
		{
			String Username="admin";
			String Password="tiger";
			String Orgarganization="HDFC34";
			String Product="smart_watch";
			String ContactFirstName="SRIHARSHA";
			String ContactLastName="MISHRA";
			
			//current page:login page
			WebDriver driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("http://localhost:8888/index.php?action=Login&module=Users");
			String str=driver.getTitle();
		    //System.out.println(str);
			//user id
			driver.findElement(By.name("user_name")).sendKeys("admin");
			//password
			driver.findElement(By.name("user_password")).sendKeys("tiger");
			Thread.sleep(2000);
			
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
	     
			//Organization creataion:
			driver.findElement(By.xpath("//a[text()='Organizations' and @href='index.php?module=Accounts&action=index']")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("HDFC37");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("BANGALORE");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("ODISHA");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("customer is Original");
			Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='crmbutton small save'  and @type='button']")).click();;
			Thread.sleep(1000);
			
			//creation of Product:
			driver.findElement(By.linkText("Products")).click();;
			//lookup img
			driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
			Thread.sleep(100);
			
			driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("smart_watch");
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
			
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SRIHARSHA");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("MISHRA");
		Thread.sleep(500);
		driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@name='account_id']/following-sibling::img[contains(@src,'themes/softed/images/select.gif')]")).click();
	     Thread.sleep(10000);
	     driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Customer Contact Created");
	     Thread.sleep(500);
	     //save
	     driver.findElement(By.xpath("//input[@class='crmbutton small save'and @title='Save [Alt+S]']")).click();
	     
	     //Quote Creation
	     driver.findElement(By.linkText("More")).click();
	     driver.findElement(By.linkText("Quotes")).click();
	     driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
	     Thread.sleep(500);
	     driver.findElement(By.xpath(" //input[@name='subject']")).sendKeys("BRAND");
	     driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@name='contact_name']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
	     Thread.sleep(8000);
	   driver.findElement(By.xpath("//td[@class='dvtCellInfo']/input[@id='single_accountid']/following-sibling::input[@name='account_id']/following-sibling::img[@src='themes/softed/images/select.gif']")).click();
	   Thread.sleep(8000);
	   driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
	   Thread.sleep(8000);
	   driver.findElement(By.xpath("//input[@class='crmbutton small save'and@title='Save [Alt+S]']")).click();
	   Thread.sleep(7000);
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
	  Thread.sleep(7000);
	  //signout:
	   
	   driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();   
	   
	}
	}



