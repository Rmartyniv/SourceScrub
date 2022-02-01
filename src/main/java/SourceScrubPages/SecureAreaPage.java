package SourceScrubPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sorcescrub.base.BasePageObject;

public class SecureAreaPage extends BasePageObject {

	private String pageUrl = "https://identity.dev.sourcescrub.com/Account/Logout";
	private By logOutButton = By.xpath("//a[@href='/Account/Logout']");

	public SecureAreaPage(WebDriver driver, Logger log) {
		super(driver, log);

	}

	/** Get URL variable from PageObject */
	public String getPageUrl() {
		return pageUrl;
	}

	/** Verification if logOutButton is visible on the page */
	public boolean isLogOutButtonVisible() {
		return find(logOutButton).isDisplayed();
	}

}
