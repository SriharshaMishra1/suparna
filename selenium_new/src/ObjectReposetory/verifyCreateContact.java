package ObjectReposetory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.FileUtils;

public class verifyCreateContact extends BaseClass {
   @Test
   
   public void CreateContact() throws Throwable
   {
	   //read the test script data
	   FileUtils flib=new FileUtils();
	   String LastName =flib.getExcelData("Sheet1",7,1);
	

	   
	   //Home Page:
	 HomePage hpcontact=PageFactory.initElements(driver, HomePage.class);
	hpcontact.SelectContacts();
	//navigate
	 navigateToContacts nv=PageFactory.initElements(driver, navigateToContacts.class);
	   nv.navigatecontact();
	   //create contact
	   CreateContactsPage cp=PageFactory.initElements(driver, CreateContactsPage.class);
	   cp.ContactsPage(LastName);
	  
	   cp.savebutton();
	   
	   
	   //verify
	   verifyingcontactinformationPage  cip=PageFactory.initElements(driver, verifyingcontactinformationPage .class);
	   cip.verifyingresult();

   }
}
