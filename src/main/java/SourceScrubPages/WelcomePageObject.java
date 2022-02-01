package SourceScrubPages;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

import com.sorcescrub.base.BasePageObject;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl = "https://identity.dev.sourcescrub.com/";

	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public LogInPage openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
		return new LogInPage(driver, log);
	}

}
