package Pravakar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement go=driver.findElement(By.xpath("//a[text()='Gmail']"));
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	act.contextClick(go).sendKeys("T").build().perform();
}
}
