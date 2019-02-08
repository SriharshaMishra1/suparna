package ObjectReposetory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class verifyingcontactinformationPage extends BaseClass{
	//initialization (Stores all WebElement Using @findBy)
	
	@FindBy(xpath="//span[contains(text(),'Contact Information')]")
	private WebElement verifyingresult;
	
	
	public void verifyingresult()
	{
		boolean b1=verifyingresult.isDisplayed();
		
		assertTrue(b1);
		
	}
	
	
	

}
