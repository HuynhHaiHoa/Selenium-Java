package Automation;

import Initialization.*;



public class firstSelenium extends Init{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setup();
		driver.navigate().to("https://ums.husc.edu.vn/");
		CleanUp();
		
	}

}
