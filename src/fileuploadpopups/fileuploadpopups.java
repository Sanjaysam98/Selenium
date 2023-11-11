package fileuploadpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopups 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Html%20source/fileupload.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("C:\\Users\\Administrator\\Desktop\\chech.html");
	}

}
