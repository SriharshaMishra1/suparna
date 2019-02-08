package Pravakar;

	import java.util.List;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


	public class MahindraDropdownTest 
	{

		
		@Test
		public void Secondcase() throws InterruptedException, Exception 
		{
			
			
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.mahindrafirstchoice.com/sell");
			
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"select_your_city_modal\"]/div/div/div/ul/li[3]/a")).click();
			//WebElement dwb=driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]"));
			
			driver.findElement(By.xpath("//div[@id='ManufacturingYearId_chosen']/a")).click();
			//rahul xpath
			//driver.findElement(By.xpath("//li[text()='2017']")).click();
			//sriharsha xpath
			driver.findElement(By.xpath("//ul[@class='chosen-results']/li[text()='2017']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='MakeId_chosen']/a/span")).click();
			driver.findElement(By.xpath("//li[text()='AUDI']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='ModelId_chosen']/a/span")).click();
			driver.findElement(By.xpath("//li[text()='A4']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@id='next']")).click();
	/*		//dropdown
			String expoption="BMW";
			boolean flag=false;
			WebElement dwb1=driver.findElement(By.xpath("//div[@id='ManufacturingYearId_chosen']/a"));
			dwb1.click();
			//create object to select class
		Select sel=new Select(dwb1);
		//capture all the option-webelement in dynamic drop down
		List<WebElement>lst=sel.getOptions();
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++) {
			String actoption=lst.get(i).getText();
			if(expoption.equals(actoption))
			{
				sel.selectByIndex(3);
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(expoption+"== option is available");
		}
		else
		{
			System.out.println(expoption+"==option is not available");
		}     */

}
	}
