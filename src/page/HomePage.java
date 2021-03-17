package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	Actions action;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement submit;

	@FindBy(xpath = "//span[contains(text(),'Willful Smart Watch for Android Phones and iOS Pho')]")
	WebElement selectWatch;

	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")
	WebElement hover;

	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
	WebElement signIn;

	public HomePage() {
		init();
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	public void searchTab(String un) throws InterruptedException {
		search.sendKeys(un);
		
		Thread.sleep(1000);
	}

	public void clickBtn() throws InterruptedException {
		submit.click();
		Thread.sleep(1000);
	}

	public void selectwatch() throws InterruptedException {
		selectWatch.click();
		Thread.sleep(1000);
	}

	public void hoverTab() {
		action.moveToElement(hover).perform();
	}

	public void signin() throws InterruptedException {
		signIn.click();
		Thread.sleep(1000);
	}

	public String gettitle() {
		return driver.getTitle();
	}

}
