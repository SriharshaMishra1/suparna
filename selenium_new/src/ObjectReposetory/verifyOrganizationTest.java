package ObjectReposetory;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.FileUtils;

public class verifyOrganizationTest extends BaseClass{
	
@Test
public void createOrganization() throws Throwable
{	FileUtils flib=new FileUtils();
	
	
	//Excel data:
			String organisationName1=flib.getExcelData("Sheet1",1 , 1);
			String BillingAddress     =flib.getExcelData("Sheet1", 2, 1);
			String ShippingAddress    =flib.getExcelData("Sheet1", 3, 1);
	        String description        = flib.getExcelData("Sheet1", 4, 1);                                 
	 		

	
	HomePage hp=PageFactory.initElements(driver, HomePage.class);
        hp.selectOrganisation();
        //navigate to Organisation
        nevigateToOrganizationsPage np=PageFactory.initElements(driver,nevigateToOrganizationsPage.class);
        np.nevigateToOrganizationsPage();
        //create Organizationname
        CreateOrganizationsPage cp=PageFactory.initElements(driver, CreateOrganizationsPage.class);
        cp.ShippingInformation(ShippingAddress, organisationName1, BillingAddress, description);
        cp.saveButton();
        //verify
        verifyingOrganisationPage oip=PageFactory.initElements(driver, verifyingOrganisationPage.class);
        oip.verifyingOrg();
        System.out.println(oip);
        String str="xpath=\"//span[contains(text(),'Organization Information')]";
	    String str1="[ ACC135 ] Aspider -  Organization Information";
}
}