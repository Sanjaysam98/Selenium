package fetchingTextFromLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchText 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		Thread.sleep(2000);
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String text = link.getText();
			System.out.println(text);
		}
			
		driver.quit();


	}

}
