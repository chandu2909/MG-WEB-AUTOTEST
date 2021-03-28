package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//import moneyGaming.utility.Base;

public class SignUpPage {
 
	WebDriver driver;
 
 public SignUpPage(WebDriver driver)
 {
	 this.driver =driver;
 }
 
	
//static By selectTitleValue = By.id("title");
//By firstName = By.id("forename");
//By surName = By.name("map(lastName)");
//By checkBox = By.id("checkbox");
//By joinNowButton = By.id("form");
//By dobErrorMessage = By.xpath("//*[@id=\"signupForm\"]/fieldset[1]/label[8]");
@FindBy(id="forename") WebElement firstName;
@FindBy(id="map(lastName)") WebElement surName;
@FindBy(id="checkbox") WebElement checkBox;
@FindBy(xpath="//*[@id=\"signupForm\"]/fieldset[1]/label[8]") WebElement dobErrorMessage;
@FindBy(id="form") WebElement joinNowButton;
@FindBy(id="title") WebElement selectTitleValue;

public void selectTitle(String titleValue)
	{
	
    Select selectTitleObj = new Select(driver.findElement(By.id("title")));
    selectTitleObj.selectByValue(titleValue);
	
	
   }

	
	public void fillFormWithOutDob(String titlevalue,String fname, String sname)
	{
		
		Select titlevaluedrobdown= new Select(selectTitleValue);
		titlevaluedrobdown.selectByValue(titlevalue);
		firstName.sendKeys(fname);
		surName.sendKeys(sname);
	}
	
	public void clickOnCheckBox()
	{
		checkBox.click();
	}
	
	public void clickOnJoinNowButton()
	{
		joinNowButton.click();
	}
	
	public String getDobValidationMessage() 
	{
		String dobValidationMessage =dobErrorMessage.getText();
		return dobValidationMessage;
	}

}
