package ObjectReposetory;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.vtiger.genericlib.BaseClass;

public class CreatingNewQuotePage extends BaseClass{
	//initialization (Stores all WebElement Using @findBy)
	@FindBy(xpath=" //input[@name='subject']")
	private WebElement Subject;
	@FindBy(id="shipping")
	private WebElement shipping;
	@FindBy(xpath="//input[contains(@onclick,'return copyAddressLeft')]")
	private WebElement RadiobtncopyBillingAdddress;
	 @FindBy(xpath="//input[@id='listPrice1']")
	private WebElement ListPriceBox;
	@FindBy(xpath="//input[@id='qty1']")
	private WebElement QtyBox;

	//utilisation through Business Library/Methods
	public void subject(String subject,String shipping,String listPrice1, String qty1) {
	Subject.sendKeys(subject,shipping,listPrice1,qty1);}
	
//LookUp image Contact 
	@FindBy(xpath="//tbody/tr[5]/td[4]/img")
	private WebElement lookupContactNamePage;
	
	public void selectorg(String LastName) {
		lookupContactNamePage.click();
	 Set<String>set1=driver.getWindowHandles();
	 Iterator<String>it1=set1.iterator();
	 String parentwindow1=it1.next();
	 String childwindow1=it1.next();
	 driver.switchTo().window(childwindow1);
	 System.out.println("after clicking on + contact2");
	 driver.findElement(By.xpath("//a[contains(text(),'"+LastName+"')]")).click();
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
     driver.switchTo().window(parentwindow1);
	}
	
//LookUp image OrganizatinPage
		@FindBy(xpath="//tbody/tr[7]/td[4]/img")
		private WebElement lookupOrgpage;
		public void selectorganization(String organisationName1 ) {
			lookupOrgpage.click();
		 Set<String>set2=driver.getWindowHandles();
		 Iterator<String>it2=set2.iterator();
		 String parentwindow2=it2.next();
		 String childwindow2=it2.next();
		 driver.switchTo().window(childwindow2);
		 driver.findElement(By.xpath("//a[contains(text(),'"+organisationName1+"')]")).click();
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 driver.switchTo().window(parentwindow2);
		  
		}
		 	    
   //select product iteam
		@FindBy(id="searchIcon1")
		private WebElement selectproduct;
		public void product(String productName ) {
			selectproduct.click();
			 Set<String>set2=driver.getWindowHandles();
			 Iterator<String>it2=set2.iterator();
			 String parentwindow2=it2.next();
			 String childwindow2=it2.next();
			 driver.switchTo().window(childwindow2);
			 driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]")).click();
			driver.switchTo().window(parentwindow2);  
			}


	
	


	
	
}
