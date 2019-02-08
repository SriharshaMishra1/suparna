package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class CreateOrganizationsPage extends BaseClass {

	//initialization (Stores all WebElement Using @findBy)
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrganizationName;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private  WebElement billingInformation;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement ShippingInformation;
	
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionInfo;
	
	@FindBy(xpath="//input[@class='crmbutton small save'  and @type='button']")
	private WebElement saveButton;
	
	
	
	
	public void ShippingInformation(String ShippingAddress,String organisationName1,String BillingAddress,
			String description)
	{
		ShippingInformation.sendKeys(ShippingAddress);
		OrganizationName.sendKeys(organisationName1);
		 billingInformation.sendKeys(BillingAddress);
		 descriptionInfo.sendKeys(description);
		 
	}
	public void saveButton()
	{
		 saveButton.click();
	}
	
	
	
}
