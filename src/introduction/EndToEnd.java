package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 //select from and to destination
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		//select the current date 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		// making sure that return date is dessabled 
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its disabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		// select the 3 adult pasangers 
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		 for(int i=1;i<4;i++)
		 {
			 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		 }
			
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		 driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 //driver.findElement(By.cssSelector("input[value='submit'")).click();

	}

}
