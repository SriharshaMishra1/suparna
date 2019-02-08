package ObjectReposetory;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.FileUtils;

public class verifyQuoteTestPage extends BaseClass{
	
@Test
public void createQuote() throws Throwable
{
	
	FileUtils flib=new FileUtils();
    String subject        =flib.getExcelData("Sheet2", 0, 1);
    String shipping       =flib.getExcelData("Sheet2", 1, 1);
    String listPrice1     =flib.getExcelData("Sheet2", 2, 1);
    String qty1           =flib.getExcelData("Sheet2", 3, 1);
    String productName    =flib.getExcelData("Sheet1", 5, 1);
    String LastName       =flib.getExcelData("Sheet1", 7, 1);
    String organisationName1       =flib.getExcelData("Sheet1", 1, 1);
    //home page
    HomePage Hq=PageFactory.initElements(driver, HomePage.class);
    Hq.selectmore();
    Hq.selectQuote();
    //nevigateToQuote page
    NavigateToQuote NQ=PageFactory.initElements(driver,  NavigateToQuote.class );
    NQ.selectlookupimage();
    //create quote
    CreatingNewQuotePage qp=PageFactory.initElements(driver, CreatingNewQuotePage.class);
    qp.subject(subject, shipping, listPrice1, qty1);
    qp.product(productName);
    qp.selectorg(LastName);
    qp.selectorganization(organisationName1);
    
    
    
}
}
