package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage{
		WebDriver driver;
	
	    public LoginPage(WebDriver driver)
	    {
	        this.driver=driver;
	    }
		By StudentPage = By.xpath("//a[normalize-space()='TRANG SINH VIÊN']");
		By User = By.xpath("//input[@id='loginID']");
		By Pass = By.xpath("//input[@id='password']");
		By Submit = By.xpath("//button[@type='submit']");
		By studentName = By.xpath("//h5[contains(text(),'Huỳnh Hải Hòa')]");
		By logout = By.xpath("//a[@id='link_userLogout']");
		public void clickStudentPage() {
			driver.findElement(StudentPage).click();
			System.out.println("click Student Page - Success");
		}
		public void inputUser(String user) {
			driver.findElement(User).clear();
			driver.findElement(User).sendKeys(user);
			System.out.println("Input User - Success");
		}
		
		public void inputPass(String pass) {
			driver.findElement(Pass).clear();
			driver.findElement(Pass).sendKeys(pass);
			System.out.println("Input Password - Success");
		}
		
		public void submit() {
			driver.findElement(Submit).click();
			System.out.println(" Click Login - Success");
		}
		
		public void verifyLogin() {
			boolean veri = driver.findElement(studentName).isDisplayed();
			if(veri) {
				System.out.println("Login Successfully");
			}else {
				System.out.println("Login failed");
			}
		}
		
		public void Login(String user, String pwd) {
			inputUser(user);
			inputPass(pwd);
			submit();
			verifyLogin();
		}
		public void Logout() {
			driver.findElement(logout).click();
			System.out.println(" Click Logout - Success");
			driver.switchTo().alert().accept();
			boolean input = driver.findElement(User).isEnabled();
			if(input) {
				System.out.println("Logout Successfully");
			}else {
				System.out.println("Logout failed");
			}
		}
}
