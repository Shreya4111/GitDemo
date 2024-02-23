package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	//driver.findElement(By.xpath("//a[@value='BLR']")).click();
   driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA']) [2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	
	
	//*-- calender date pic for the current date ---* 
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	
	
	

	}

}
