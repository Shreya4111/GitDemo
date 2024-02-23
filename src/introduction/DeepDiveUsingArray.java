package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeepDiveUsingArray {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();// get firfox browser
		String[] itemneeded = { "Cucumber", "Brocolli", "Beetroot" ,"Carrot"};// need to create the string array
		int j = 0;// j start from
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");// get URL
		Thread.sleep(3000);// to lead the page
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));// we get 30 similar element
		for (int i = 0; i < products.size(); i++)// when we are using array need use for loop
		{
			// String name=products.get(i).getText(); // assigning element to the name
			// string
			String[] name = products.get(i).getText().split("-");// name contain Cucumber - 1KG when we apply split on -
																	// then word will get splitted in to 2 parts
			// name[0]= Cucumber (space incluede )
			// name [1]= 1 Kg
			String formattedname = name[0].trim();// trim method will be used to trim the space in left and right side
													// of the string

			List itemNeededList = Arrays.asList(itemneeded); // convert array to array list
			if (itemNeededList.contains(formattedname)) // if needed list contains array name
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); // parent child
																										// traversal is
																										// achived //
																										// then it will
																										// click on the
																										// add to cart
				// here break will be not used because program will get terminated
				// using the text is bad practice in locator when the text changes dynamicaly it
				// wont support
				// so we have to change to locator
				// if we use the break then if supose it will try for Brocolli it will take
				// brocolli when it will reach break it will come out of the loop
				// if we not use the break it will execute the for loop
				if (j == itemneeded.length)// this condition is used to execute only 3 times// this will take the length
											// of the array insted of hardcode we can use this method
				{
					break;
				}
			}

		}

	}

}
