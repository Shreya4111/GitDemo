package introduction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeepDiveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// main goal is to get the cart of cucumber
		// in general web findElements comes under the WebElement 
		// we have the many elements so we have to use the list 
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));// having 30 similar element 
		for(int i =0;i<products.size();i++)    // need to execute the for loop 
		{
			String name =products.get(i).getText(); // then assign it to string name  
			if(name.contains("Cucumber")) // if the name contain cucumber 
			{
				// click on add to cart 
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //click on the cucumber 
				
				break;
				
			}
		}
		
				

	}

}
