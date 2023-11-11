package checkboxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Html%20source/checkboxes.html");
		//List<WebElement> cbox = driver.findElements(By.xpath("(//input)"));

	}

}
