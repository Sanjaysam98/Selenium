package launchyoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchyoutube 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("jujubee jailer song");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(4000);
		
		 driver.findElement(By.cssSelector("a[class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
		 Thread.sleep(9000);
		
		driver.close();
	}

}
