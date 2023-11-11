package LaunchingYtUsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchYtUsingXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.youtube.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kannoram kannoram song");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[2]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]/yt-formatted-string[1]")).click();
	  Thread.sleep(60000);
	  
	  driver.close();
	}

}
