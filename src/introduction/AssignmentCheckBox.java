package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		driver.findElement(By.id("checkBoxOption1")).click();



		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


		
		

	}

}
