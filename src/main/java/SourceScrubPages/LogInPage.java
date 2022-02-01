package SourceScrubPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
import com.sorcescrub.base.BasePageObject;

public class LogInPage extends BasePageObject {

	private By userNameLocator = By.id("Username");
	private By passwordLocator = By.id("Password");
	private By buttonLocator = By.tagName("button");
	private By buttonLinkLocator = By.xpath("//a[@href='https://dev.sourcescrub.com/home']");
	private By errorMessage = By
			.xpath("//div[@class='danger validation-summary-errors']/ul/li[.='Invalid username or password']");

	public LogInPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public SecureAreaPage logIn(String username, String password) {
		log.info("Executing LogIn with username [" + username + "] and password [" + password + "]");
		type(username, userNameLocator);
		type(password, passwordLocator);
		click(buttonLocator);
		click(buttonLinkLocator);
		return new SecureAreaPage(driver, log);
	}

	public void negativeLogIn(String username, String password) {
		log.info("Executing Negative LogIn with username [" + username + "] and password [" + password + "]");
		type(username, userNameLocator);
		type(password, passwordLocator);
		click(buttonLocator);

	}

	/** Wait for error message to be visible on the page */
	public void waitForErrorMessage() {
		waitForVisibilityOf(errorMessage, 5);
	}

	public String getErrorMessageText() {
		return find(errorMessage).getText();
	}

}
