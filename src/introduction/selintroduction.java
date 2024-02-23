package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class selintroduction    {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking the browser 
		//chrome-> ChromeDriver-> Methods 
		//firefox -> FirefoxDriver ->Methods  close get 
		//safari -> SafariDrver-Methods like close get 
		// WebDriver behave like principle  technicaly webdriver is an interface 
		//web driver methods and internal class method 
		
		//chromeDriver.exe  -> chrome browser (invoke the browser for us)
		//steps to invoke the chrome driver 
		//selenium manager returns library to to invoke to the chrome browser if not automatical it create the 
		//chrome driver for us 
		//chromedriver.exe->chrome browser 
		//System.setProperty("webdriver.chrome.driver","/Users/Admin/Documents/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","/Users/Admin/Documents/geckodriver.exe");
		//System.setProperty("webdriver.edge.driver","/Users/Admin/Documents/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		//webdriver.chrome.driver -> value of path
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();//close the current window 
		driver.quit ();// all the windows associated by selenium 
		
	}

}
