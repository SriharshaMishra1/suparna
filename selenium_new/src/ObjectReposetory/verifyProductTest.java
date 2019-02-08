package ObjectReposetory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.FileUtils;

public class verifyProductTest extends BaseClass {
	@Test
	public void createproduct() throws Throwable
	{
		
		
	
		FileUtils flib=new FileUtils();
		String productName        =flib.getExcelData("Sheet1", 5, 1);
		//home page
		HomePage HPP=PageFactory.initElements(driver, HomePage.class);
				HPP.SelectProducts();
				//navigateToProduct
				
				nevigateToProductsPage npp=PageFactory.initElements(driver,nevigateToProductsPage.class);
				npp.selectlookupimage();
				
				//create product
				
				CreateProductsPage cpp=PageFactory.initElements(driver,CreateProductsPage.class);
				cpp.productnameInfo(productName);
				cpp.SaveButton();
				
				//verify product information page
				VerifyingProductPage pi=PageFactory.initElements(driver,VerifyingProductPage.class);
				pi.verifyingproducts();
				
	}

}
