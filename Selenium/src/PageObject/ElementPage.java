package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementPage {
	WebDriver driver;
	
    public ElementPage(WebDriver driver)
    {
        this.driver=driver;
    }
    
    By ElementPage = By.xpath("//h5[contains(text(),'Elements')]");
	By Button = By.xpath("//span[text()='Buttons']"); 
	By verify = By.xpath("//p[@id='doubleClickMessage']");
	public void clickElementPage() {
		driver.findElement(ElementPage).click();
		System.out.println("click Element Page - Success");
	}
	
	public void clickButton() {
		driver.findElement(Button).click();
		System.out.println("click Button - Success");
	}
	
	public void DoubleClick() {		
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(link).perform();
		if(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).isDisplayed()) {
			System.out.println("Double click button - Success");
		}else {
			System.out.println("Double click button - Fail");
		}
		
	}
}
