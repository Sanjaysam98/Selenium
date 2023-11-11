package handlingButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingbutton 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		 Point ele = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		 int x = ele.getX();
		 int y = ele.getY();
		System.out.println("location of X "+ x);
		System.out.println("location of Y "+y);
		
		driver.quit();
	}
}
