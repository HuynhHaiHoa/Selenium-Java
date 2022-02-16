package Project_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import PageObject.*;
public class AutomationTestNG{

  public WebDriver driver = null;	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//set wait for element is 10 seconds 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//setup wait for load page
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//maximize browser
		driver.manage().window().maximize();
  }

  @Test
  public void TC1() {
	  String user = "17T1021094";
	  String pass = "haihoahuynh5139";
	  LoginPage login= PageFactory.initElements(driver, LoginPage.class);
	  driver.navigate().to("https://ums.husc.edu.vn/");
	  login.clickStudentPage();
	  login.Login(user, pass);
	  login.Logout();
  }
  @Test
  public void TC2() {
	  driver.navigate().to("https://www.facebook.com/watch/?ref=tab");
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
