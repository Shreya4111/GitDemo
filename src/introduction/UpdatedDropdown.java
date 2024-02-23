package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
// TestNg is one of the testing framework 
public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//updated dropdown concepts covered here and handling the checkbox  and to find how many checkboxs existed
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		//driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_Unmr']")).click(); 2 time we cant click 
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//*-----enable concept----- when we selecct the round trip date will get enabled  *
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		
	
		
		

		  
		 Thread.sleep(2000);
		 //int i=1;
		// while(i<5) {
			 
		 
		// driver.findElement(By.id("hrefIncAdt")).click();
		// i++;
	//}    this is by using the while loop
		 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.findElement(By.id("divpaxinfo")).click();
		 for (int i=1;i<5;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adults");
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		 
		 
		 

	}

}
