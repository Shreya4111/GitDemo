package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;





public class Locators {
	public static void main(String args[]) throws InterruptedException
	{
		// implicit wait 2 seconds 
		String name="rakesh";
		//System.setProperty("webdriver.gecko.driver", "/Users/Admin/Documents/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// if something is not showing in the page we ask selenium atleast 5 seconds to render 
		// it will resume and continue after 5 seconds and globally applicable for all the steps  we will add this in beginning that will
		// take care of syncronyzation issue.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);// using id
		driver.findElement(By.name("inputPassword")).sendKeys("shreya334"); // by name 
		
		driver.findElement(By.className("signInBtn")).click();// by using class name 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());// by using css selector
		driver.findElement(By.linkText("Forgot your password?")).click();// by LinkText
		Thread.sleep(10000);//pausing the scripts for 1 sec to solve the error or something to get in stable state 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sharath");// x path
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shreyaknak408@gmail.com");// 1st way of writing the css selector 
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();//x path
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("shreyaknaik@outlook.com");// 2nd differnt way of writing the css selector
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8988998893");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();// parent child traversal
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);//by using cssselector id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");// by using css selector partial text 
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000); // if you want to wait for next page to show that time thread will be healpfull
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");// by using the tagname compairing 
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()); // x path (//div[@class='login-container'])[h2]
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();//artial text in css selector 
		// Css selector using class by removing the space adding the ".
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); by using cssselector using class

	} 
		
	}


