package handlingButtonsUsingSize;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetSize 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		Thread.sleep(2000);
		Dimension size = ele.getSize();
		System.out.println(size);
		
		// To find width and height
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Height = "+ height);
		System.out.println("Width = "+ width);
		
		driver.quit();
	}
	

}
