package stepdef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class TestStepDef {

	HomePage home;

	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		home = new HomePage();
	}

	@When("user enters {string}")
	public void user_enters(String string) throws InterruptedException {
		home.searchTab(string);
	}

	@When("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		home.clickBtn();
		Thread.sleep(1000);
		home.selectwatch();
	}

	@Then("user is on watch tab")
	public void user_is_on_watch_tab() {
		
		
	}

	@Then("user clicks on sign in")
	public void user_clicks_on_sign_in() throws InterruptedException {
		home.hoverTab();
		home.signin();
		home.gettitle();
		Assert.assertTrue(home.gettitle().contains("Amazon Sign-In"));
		Thread.sleep(1000);

	}

}
