package ObjectReposetory;

import static org.testng.Assert.assertTrue; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class verifyingOrganisationPage extends BaseClass {
	
	//initialization (Stores all WebElement Using @findBy)
	
	@FindBy(xpath="//span[contains(text(),'Organization Information')]")
	private WebElement verifyingOrg;
	
	public void  verifyingOrg()
	{
		boolean b2= verifyingOrg.isDisplayed();
		assertTrue(b2);
		System.out.println(b2);
		//System.out.println("[ ACC135 ] Aspider -  Organization Information");
		
				
	}
	

}
