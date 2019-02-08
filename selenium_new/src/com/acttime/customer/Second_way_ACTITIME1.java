package com.acttime.customer;
	import java.io.File;
	import java.sql.Driver;
	import java.util.List;
	import java.util.Random;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	import org.openqa.selenium.support.ui.Select;
	public class Second_way_ACTITIME1 {
	
	static boolean flag=false;
	 
	static String customer="ICICI0";





		public static void main(String[] args) throws InterruptedException {
			
			
			FirefoxProfile profile = new FirefoxProfile();
		//	FirefoxBinary bin = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
			
			WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(3000);
		Select se=new Select(driver.findElement(By.xpath("//select[@name='selectedCustomer']")));
		
		List <WebElement> eb=se.getOptions();
	      System.out.println(eb.size());
	    
	      for(int i=0;i<eb.size();i++) {
	    	  String str=eb.get(i).getText();
	    	  System.out.println(str);
	    	 
	    	  if(str.equals(customer)) { 
	    		  se.selectByVisibleText(str);
	    		  System.out.println(se);
	    		  
	    		  flag=true;
	    		  System.out.println(customer+"===>already present");
	    		  break;}}

	    	   
	    	        driver.findElement(By.xpath(".//*[@id='ext-comp-1002']/span")).click();
	    	        
	    	      
	    	    	int i=0;
	    			while(i< 5) {
	    				 Random num=new Random();
	    				  String cusname="ICICI"+num.nextInt(20);
	        			 driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).clear();Thread.sleep(3000);
	    				driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).sendKeys(cusname);
	        	    	driver.findElement(By.xpath(".//*[@id='customerLightBox_commitBtn']")).click();i++;
	        	    	
	    				WebElement actError= driver.findElement(By.xpath(".//*[@id='customerLightBox_nameDuplicateError']"));
	        	        String str5=actError.getCssValue("color");
	        	        System.out.println(str5);
	        			String str10="rgba(206, 1, 0, 1)";
	        			
	        			i++;
	        			driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).clear();Thread.sleep(1000);	
	        			
	    	    	driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).sendKeys(cusname);
	    	    	driver.findElement(By.xpath(".//*[@id='customerLightBox_commitBtn']")).click();
	    	    	Thread.sleep(1000);
	    	    	
	    	    	
	    	    	
	    	    	
	    	    	
	    				
	  		    		  
	  		    	}
	    	    	
	    			
	    	    	}

	    				
	    	    }
	    
	    	  
	    	    
	    	    
	    	  
	      
	      
	      
	      
	     
		




