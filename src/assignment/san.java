package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class san 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Html%20source/demo1.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
		ele1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		
    	WebElement ele3 = driver.findElement(By.xpath("//input[@id='a3']"));
		Thread.sleep(2000);
		ele3.sendKeys(Keys.CONTROL+"v");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[id='a2']"));
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"v");
		
	}

}
