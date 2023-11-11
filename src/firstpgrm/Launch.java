package firstpgrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 //driver.get("https://www.youtube.com");
		 driver.navigate().to("https://www.youtube.com");
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();	 
		 Thread.sleep(6000);
		 
		 driver.close();

	}

}
