package Pravakar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_all_customer_Checkbox {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");;
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");;
	}

}
