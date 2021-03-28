package StepDefinitions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.moneyGaming.utility.BrowserFactory;

import io.cucumber.java.en.*;
import pages.MoneyGamingLandingPage;
import pages.SignUpPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

public class RegistrationSteps {

	WebDriver driver;

	MoneyGamingLandingPage landingPage = PageFactory.initElements(driver, MoneyGamingLandingPage.class);
	SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

	@Given("User on homePage")
	public void user_on_home_page() throws IOException {

		BrowserFactory.startApp(driver, "chrome", "https://moneygaming.qa.gameaccount.com/");
	}

	@When("user click on Join Now button")
	public void user_click_on_join_now_button() {
		landingPage.clickOnSignUp();
	}

	@When("signup with title {string} firstname {string} surname {string}")
	public void signup_with_title_firstname_surname(String title, String fname, String sname) {
		signUpPage.fillFormWithOutDob(title, fname, sname);
	}

	@When("click the tickbox to accept terms and conditions")
	public void click_the_tickbox_to_accept_terms_and_conditions() {
		signUpPage.clickOnCheckBox();
	}

	@When("sumbit the form by clikcing the JOIN NOW button")
	public void sumbit_the_form_by_clikcing_the_join_now_button() {
		signUpPage.clickOnJoinNowButton();
	}

	@Then("Validation message {string} appears under the date of birth box")
	public void validation_message_appears_under_the_date_of_birth_box(String expectedErrorMessage) {
		String actualErrorMessage = signUpPage.getDobValidationMessage();
		assertEquals(actualErrorMessage, expectedErrorMessage, "validatdDobmessageSuccessfully");
	}

}
