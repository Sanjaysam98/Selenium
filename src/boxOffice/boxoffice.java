package boxOffice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class boxoffice 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Jawaan(Hindi)')]")).click();
	
		Thread.sleep(6000);
		driver.close();
		Thread.sleep(9000);
		driver.quit();

	}

}
