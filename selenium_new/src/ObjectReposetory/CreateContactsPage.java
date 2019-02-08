package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactsPage {
	//initialization (Stores all WebElement Using @findBy)
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname;
	
	@FindBy(xpath="//tbody/tr[1]/td/div/input[@accesskey='S']")
	private WebElement saveButton;
	
	
	public void ContactsPage(String LastName)
	{
		Lastname.sendKeys(LastName);
	}
	public void savebutton()
	{
		saveButton.click();
	}
}
