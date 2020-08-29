package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMavenTest {
	
	@Test
	public void ejecutaTest() throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://runer-prueba.grupoquick.com.co/home/pidete-un-runer/");
		Thread.sleep(5000);
		
		////*[@id="split_right-menu"]/li[1]/a/span/span/span[1]
		
		driver.findElement(By.name("split_right-menu")).click();
		
		
		driver.close();
	}

}
