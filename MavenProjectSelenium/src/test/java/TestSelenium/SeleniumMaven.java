package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMaven {
	
	public static void main(String args[]) throws InterruptedException {
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://runer-prueba.grupoquick.com.co/home/");
		Thread.sleep(5000);
		driver.close();	
	
	}

}
