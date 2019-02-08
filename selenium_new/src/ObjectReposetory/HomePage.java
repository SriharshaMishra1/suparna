package ObjectReposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
//contact
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement SelectContact;
//organization
	@FindBy(xpath="//a[text()='Organizations' and @href='index.php?module=Accounts&action=index']")
	private WebElement selectOrganisation;
//product
	@FindBy(linkText="Products")
	private WebElement SelectProducts;
//quote
	@FindBy(linkText="More")
	private WebElement selectmore;
	@FindBy(linkText="Quotes")
	private WebElement selectQuote;
//Logout
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement nevigatetoSignOut;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement selectToSignOut;
//Utilization through Business Library/method
			public void SelectContacts() {
			SelectContact.click();}
			
			public void selectOrganisation() {
			selectOrganisation.click();}
			
			public void SelectProducts() {
			SelectProducts.click();}
		    
			public void selectmore() {
			selectmore.click();}
			
			public void selectQuote() {
			selectQuote.click();}
			
			
			
			
			
			
			public void nevigatetoSignOut()
			{
				nevigatetoSignOut.click();
			}
			public void selectToSignOut()
			{
				selectToSignOut.click();
		    }

}
