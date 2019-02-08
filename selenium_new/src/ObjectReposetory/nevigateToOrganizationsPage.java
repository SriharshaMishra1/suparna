package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class nevigateToOrganizationsPage extends BaseClass {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement Lookupimagae;
	

	
	public void nevigateToOrganizationsPage()
	{
		Lookupimagae.click();
	}

}
