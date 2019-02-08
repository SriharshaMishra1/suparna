package com.vtiger.genericlib;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {


	public static WebDriver driver;
	public static FileUtils flib=new FileUtils();
	@BeforeClass
	public void configBc() throws Throwable
	{
	System.out.println("===============Launch Browser===============");
	Properties pobj=flib.getpropertyFileobject();
	String browserName=pobj.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./resource/chrome.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{	System.setProperty("webdriver.chrome.driver","./Resource/firefox.exe");
		driver=new FirefoxDriver();
	}
	else if(browserName.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver","./resource/iexplore.exe");
		
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void configBM() throws Throwable
	{
		System.out.println("login");
		Properties pobj=flib.getpropertyFileobject();
		driver.get(pobj.getProperty("URL"));
		
		driver.findElement(By.name("user_name")).sendKeys(pobj.getProperty("USERNAME"));
		
		driver.findElement(By.name("user_password")).sendKeys(pobj.getProperty("PASSWORD"));
		Thread.sleep(4000);
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}
	@AfterClass
	public void configAC()
	{
		System.out.println("===================================close Browser==============================");
		driver.close();
		
	
	}
	}
	
