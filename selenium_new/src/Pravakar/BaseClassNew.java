package Pravakar;
/*

import java.awt.print.Pageable;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectrepositorylib.Home;
import com.vtiger.objectrepositorylib.login;

import inbuild.FileUtils;

public class BaseClassNew {
	public static WebDriver driver;
	public FileUtils fLib=new FileUtils();
	
	@BeforeMethod
	
		public void configBM()
		{
			System.out.println("login");
		}
	FileUtils flib=new FileUtils();
	Properties pobj=flib.getpropertyFileobject();
	String URL=pobj.getProperty("URL");
	login lp=PageFactory.initElements(driver,login.class);
	//lp.loginToApp(pobj.getproperty("username"),pobj.getproperty
			
}
@AfterMethod
public void configAM()
{
	System.out.println("logout");
	Home hp=PageFactory.initElements(driver, Home.class);
}

@BeforeClass
public void configBc() throws Throwable
{
System.out.println("==========================Launch Browser=================");
Properties pobj=fLib.getpropertyFileobject();
String browserName=pobj.getProperty("browser");
if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","./resource/chromedriver.exe");
	driver=new ChromeDriver();
}
else if(browserName.equals("firefox"))
{
	driver=new FirefoxDriver();
}
else if(browserName.equals("ie"))
{
	System.setProperty("webdriver.ie.driver","./resource/IEDriverServer.exe");
	
	driver=new InternetExplorerDriver();
}
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@AfterClass
public void configAC()
{
	System.out.println("===================================close Browser==============================");
	driver.close();
}

/*@BeforeSuite
public void configBS()
{
	System.out.println(".....connect to DB....Before suite....");
}

@AfterSuite
public void configAS()
{
	System.out.println(".....Disconnect from DB....After suite......");
	String cDate=new Date().toString().replace(" ","_").replace(":","_");   */
	
	
	
	
	

//}








	
	

