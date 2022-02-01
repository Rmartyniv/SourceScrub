package com.sorcescrub.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject extends TestUtilities {

	protected WebDriver driver;
	protected Logger log;

	public BasePageObject(WebDriver driver, Logger log) {
		this.driver = driver;
		this.log = log;
	}

	protected void openUrl(String url) {
		driver.get(url);
	}

	protected WebElement find(By locator) {
		waitForVisibilityOf(locator);
		return driver.findElement(locator);
	}

	protected void click(By locator) {
		waitForVisibilityOf(locator);
		find(locator).click();
	}

	protected void type(String text, By locator) {
		waitForVisibilityOf(locator);
		find(locator).sendKeys(text);
	}

	public String getCurentUrl() {
		return driver.getCurrentUrl();
	}

	protected void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
		timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(condition);
	}

	protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
		int attempts = 0;
		while (attempts < 2) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
						(timeOutInSeconds.length > 10 ? timeOutInSeconds[10] : null));
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
	}
}
