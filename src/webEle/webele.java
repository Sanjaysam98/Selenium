package webEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webele 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("file:///C:/Users/Administrator/Desktop/chech.html");
	    Thread.sleep(2000);
	    
	       WebElement san = driver.findElement(By.id("a1"));
	       san.isDisplayed();
	       
	       
	}

}
