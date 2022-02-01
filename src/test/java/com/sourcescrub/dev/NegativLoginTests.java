package com.sourcescrub.dev;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sorcescrub.base.TestUtilities;

import SourceScrubPages.LogInPage;
import SourceScrubPages.WelcomePageObject;

public class NegativLoginTests extends TestUtilities {
	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)

	public void negativeLogIn(@Optional("geobmx540") String username, @Optional("prescott11") String password,
			@Optional("Invalid username or password") String expectedErrorMessage) {
		log.info("Starting incorect password test");

		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();

		LogInPage loginPage = welcomePage.openPage();

		loginPage.negativeLogIn(username, password);

		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();

		Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");

	}

}
