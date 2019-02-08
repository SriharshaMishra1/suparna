package com.acttime.customer;
    
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class facebook {

		public static void main(String[] args) throws Throwable {
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Baby\\workspace1\\mytest\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("t.s.shoraff@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("sunil"); //clicking on firstname box
			
			driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click(); //clicking on Forgotten account?
			
			driver.navigate().back();
			
			Select day = new Select(driver.findElement(By.xpath("//*[@id='day']"))); //selecting day
			day.selectByVisibleText("5");
			
			Select month = new Select(driver.findElement(By.xpath("//*[@id='month']"))); //selecting month
			month.selectByValue("3");
			
			Select year = new Select(driver.findElement(By.xpath("//*[@id='year']"))); //selecting year
			year.selectByValue("1993");
			
			driver.findElement(By.xpath("//*[@id='u_0_z']/span[2]/label")).click(); //clicking on radio button
			
			driver.findElement(By.xpath("//*[@id='u_0_11']")).click(); //clicking on submit
			
			driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click(); //clicking on create page
			
			driver.navigate().back();
			
			driver.quit();
			
			
		}

}
