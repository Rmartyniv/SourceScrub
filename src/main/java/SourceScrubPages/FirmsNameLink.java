package SourceScrubPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sorcescrub.base.BasePageObject;

public class FirmsNameLink extends BasePageObject {

	private By userFirmNameLocator = By.xpath("//a[@href='/firms/1']");

	public FirmsNameLink(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void openSSFirmPage() {

		log.info("Executing Firm link test");

		click(userFirmNameLocator);

	}

}
