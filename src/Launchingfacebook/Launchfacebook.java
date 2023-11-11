package Launchingfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchfacebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //Launching the browser
		 driver.get("https://www.facebook.com");
		 
		 Thread.sleep(2000);
		 //passing input to username
		 driver.findElement(By.id("email")).sendKeys("sanjay");
		 Thread.sleep(2000);
		 
		//passing input to password
		 driver.findElement(By.id("pass")).sendKeys("sanjay");
		 Thread.sleep(2000);
		 
		//use click action to use forgot password	 
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 
		 Thread.sleep(6000);
		 
		 driver.close();
	}

}
