package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class navigateToContacts {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement selectlookupimage;
	
	//utilization through Business Library/methood
	
	public void navigatecontact()
	{
		selectlookupimage.click();
	}

}
