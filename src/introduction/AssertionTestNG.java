package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class AssertionTestNG {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
			//updated dropdown concepts covered here and handling the checkbox  and to find how many checkboxs existed
		
		//In the assertion we are expecting false but we are getting the input true that time it will display the error 
			 WebDriver driver = new FirefoxDriver();
			 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			 Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
			 driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
			 Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
			 driver.findElement(By.id("divpaxinfo")).click();
			 Thread.sleep(2000);
			 
			 
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 
			 for (int i=1;i<5;i++)
			 {
				 driver.findElement(By.id("hrefIncAdt")).click();
			 }
			 driver.findElement(By.id("btnclosepaxoption")).click();
			 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 
			 
			 

		}

	

			 
			 
	}


