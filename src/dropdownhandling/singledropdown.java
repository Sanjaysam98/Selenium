package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Html%20source/select.html");
		WebElement dd = driver.findElement(By.id("maruthi"));
	         Select sel = new Select(dd);
	        sel.selectByVisibleText("Biryani");
	        Thread.sleep(8000);
	        sel.deselectAll();
	        
	}

}
