package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class NavigateToQuote extends BaseClass {
	@FindBy(xpath="//img[@title='Create Quote...']")
	private WebElement lookupimage;
	
	//utilization through Business Library/methood
	public void selectlookupimage()
	{
		lookupimage.click();
	}
	

}
