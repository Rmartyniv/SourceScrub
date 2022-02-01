package com.sourcescrub.dev;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.sorcescrub.base.TestUtilities;

import SourceScrubPages.LogInPage;
import SourceScrubPages.SecureAreaPage;
import SourceScrubPages.UserMenu;
import SourceScrubPages.WelcomePageObject;

public class LoginTestOne extends TestUtilities {

	@Test
	public void loginTestPositive() {

		log.info("Starting Login Test");
		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();

		LogInPage loginPage = welcomePage.openPage();

		// execute log in

		SecureAreaPage secureAreaPage = loginPage.logIn("geobmx540", "prescott1");

		var userMenu = new UserMenu(driver, log);

		userMenu.ClickUserMenu();

		userMenu.ClickFirmAdmin();

		sleep(2000);
		String expectedURL2 = "https://dev.sourcescrub.com/firms/1/users";
		String actualUrl2 = driver.getCurrentUrl();
		AssertJUnit.assertEquals(actualUrl2, expectedURL2);

		userMenu.ClickUserMenu();

		userMenu.ClickLogoutButton();

	}
}
