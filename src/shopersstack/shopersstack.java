package shopersstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopersstack 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@id='electronics']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[@data-aos-easing='ease']/div[@id='root']/div/div/div/div[@class='cat_box__FUszw']/div[1]/div[3]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.close();
	
	}

}
