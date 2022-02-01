package com.sourcescrub.dev;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SsFirmPage {

	private WebDriver driver;
	private By userFirmNameLocator = By.xpath("//a[@href='/firms/1']");

	public SsFirmPage(WebDriver driver, Logger log) {
		super();

	}

	public void openFirmPage() {
		var linkButton = driver.findElement(userFirmNameLocator);
		linkButton.click();

	}

}
