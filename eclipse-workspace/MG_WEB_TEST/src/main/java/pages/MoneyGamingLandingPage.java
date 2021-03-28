package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import moneyGaming.utility

public class MoneyGamingLandingPage {

	WebDriver driver;
	
	static By signUp = By.cssSelector("a[href*='sign-up.shtml']");
	
	public MoneyGamingLandingPage(WebDriver driver)
	{
		this.driver=driver;
	}


	public void  clickOnSignUp()
	{
		 driver.findElement(signUp).click();
	}
	
	

}
