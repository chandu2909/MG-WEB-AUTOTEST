package com.moneyGaming.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	
	
	public static WebDriver startApp(WebDriver driver, String browserName,String siteURL)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		else if(browserName.equals("firefox"))
		{
			//firefox driver details
		}
		else if(browserName.equals("edge"))
		{
		    //Edge driver details
		}
		else
		{
			System.out.println("We are not supporting this browser");
		}
		
		driver.manage().window().maximize();
		driver.get(siteURL);
		
		return driver;

	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
