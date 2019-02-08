package ObjectReposetory;
/**
 * 
 */
/**
 * @author sriharsha
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class login {
 
	
	//Initialization
	
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	

	
	@FindBy(id="submitButton")
	private WebElement submitBtn;
	
	
	//utilization through getters
	public WebElement getuserNameEdt()
	{
		return userNameEdt;
	}
	
    public WebElement getpassword()
	{
		return passwordEdt;
	}
		
	
	
	//utilization through Business Libraries method
	
	public void loginToApp(String username,String Password)
	{
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(Password);
		submitBtn.click();
	}

}
