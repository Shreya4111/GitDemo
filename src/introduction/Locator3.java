package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty(webdriver.gecko.driver,"/Users/Admin/Documents/geckodriver.exe");
	    WebDriver driver =new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(1000);
	    //Sibling transverse - child to parent traverse 
	    // ex : //header we can write 
	    //another way of writng :from the root you are traversing the child element they we can use absolute x path
	    // we can write as html/body/header
	    //when we say the relative xpath that means we can to the middle of the program and we can execute (relatively pointing to the position 
	    //that time we should use //
	    //people will suggest to use the reltive xpath  ex :  //header/div/button[2]
	    //syntax of both parent to child traverse as well as sinbling to sibling traverse 
	    //ex : //header/div/button[1]/following-sibling::button[1]
	    System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	    
	    
	    
	}

}
