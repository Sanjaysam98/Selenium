package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Html%20source/singlecheckbox.html");
		WebElement ele = driver.findElement(By.id("a3"));
		boolean disply = ele.isSelected();
		
		if(disply)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
			
		}
		
		WebElement ele2 = driver.findElement(By.id("a2"));
		boolean enab = ele2.isEnabled();
		
		if(enab)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is not enabled");
			
		}
		
		
		WebElement ele1 = driver.findElement(By.id("a1"));
		boolean sele = ele1.isSelected();
		
		if(sele)
		{
			System.out.println("Element is checked");
		}
		else
		{
			System.out.println("Element is not checked");
			
		}
		
		driver.quit();
	}

}
