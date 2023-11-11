package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecomm 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("boat smartwatch");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    driver.findElement(By.xpath("(//a[@class='IRpwTa'])[7]")).click();

	}

}
