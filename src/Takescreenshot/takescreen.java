package Takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreen {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		 File temp = tss.getScreenshotAs(OutputType.FILE);
		 File part = new File("./D_photos/");
		 FileHandler.copy(temp, part);
		 
		 	Thread.sleep(2000);
		 	driver.quit();
	}

}
