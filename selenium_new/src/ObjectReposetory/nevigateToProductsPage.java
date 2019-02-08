package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class nevigateToProductsPage extends BaseClass {
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement selectlookupimage;
	
	
	public WebElement getlookupimage()
	{
		return selectlookupimage;
	}
	
	//utilization through Business Library/methood
	public void selectlookupimage()
	{
		selectlookupimage.click();
	}
	

}
	


