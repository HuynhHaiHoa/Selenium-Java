package Initialization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Init {
	public static WebDriver driver = null;
	
	public static void Setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Java\\chromedriver.exe");
		//set thời gian chờ cho element trong 10s
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//setup thời gian chờ để load page
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//maximize browser cua minh
		driver.manage().window().maximize();
	}
	
	public static void CleanUp() {
		driver.quit();
	}
}
