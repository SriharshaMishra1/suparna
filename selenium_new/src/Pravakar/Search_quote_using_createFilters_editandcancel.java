package Pravakar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Search_quote_using_createFilters_editandcancel {
	
	public static void main(String[] args) throws Throwable {
		//Test Data
		String username="admin";
		String password="tiger";
				
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		String str=driver.getTitle();
	    //System.out.println(str);
		
		//user id
		driver.findElement(By.name("user_name")).sendKeys(username);
		
		//password
		driver.findElement(By.name("user_password")).sendKeys(password);
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
				//driver.findElement(By.linkText("QUOTES")).click();
				WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
				Actions act=new Actions(driver);
				act.moveToElement(wb).perform();
				//driver.findElement(By.linkText("QUOTES")).click();
				driver.findElement(By.xpath("//a[text()='Quotes']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
				
				driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Thomson");
				//driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']/preceding-sibling::input[@name='potential_id']")).click();
				driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']/preceding-sibling::input[@id='single_accountid']/following-sibling::img[@align='absmiddle']")).click();
				Thread.sleep(20000);
				//driver.findElement(By.linkText("Nspider")).click();
				//Select sel=new Select(driver.findElement(By.name("Nspider")));
				//sel.selectByVisibleText("Nspider");
				driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				Thread.sleep(4000);
				//driver.findElement(By.name("viewname")).click();
				
				//WebElement wb1=driver.findElement(By.xpath("//a[text()='More']"));
				//WebElement wb1=driver.findElement(By.linkText("More"));
				//Actions act1=new Actions(driver);
				//act1.moveToElement(wb1).perform();
				//driver.findElement(By.linkText("Quotes")).click();
				//driver.findElement(By.xpath("//a[text()='Quotes']")).click();
				driver.findElement(By.xpath("//a[@href='index.php?module=Quotes&action=index']")).click();;
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
				
				
					
				
}

	
	}


