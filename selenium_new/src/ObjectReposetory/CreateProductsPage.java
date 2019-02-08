package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class CreateProductsPage extends BaseClass {
	//initialization (Stores all WebElement Using @findBy)
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productnameInfo;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	//utilisation through Business Library/Methods
	public void productnameInfo(String productName)
	{
		productnameInfo.sendKeys(productName);
	}	
	public void SaveButton()
	{
		SaveButton.click();
	}

}
