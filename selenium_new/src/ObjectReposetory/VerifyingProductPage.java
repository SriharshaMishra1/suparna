package ObjectReposetory;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class VerifyingProductPage extends BaseClass{
	
	//initialization (Stores all WebElement Using @findBy)
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement verifyingproducts;
	
	
	public void verifyingproducts()
	{
		boolean b3=verifyingproducts.isDisplayed();
				assertTrue(b3);
	}
	
	
}
