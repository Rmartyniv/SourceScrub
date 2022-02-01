package SourceScrubPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sorcescrub.base.BasePageObject;

public class HeaderNavigation extends BasePageObject {

	private By mydashbordTabLocator = By.cssSelector(".mat-tab-links [href='\\/dashboard']");
	private By sourceTabLocator = By.xpath("//div[@id='top-section']/div[@class='top-menu-btns']/a[2]");
	private By companiesTabLocator = By.xpath("//div[@id='top-section']/div[@class='top-menu-btns']/a[3]");
	private By peopelTabLocator = By.xpath("//div[@id='top-section']/div[@class='top-menu-btns']/a[4]");
	private By investmentTabLocator = By.id("investments-tab");
	private By searchFieldLocator = By
			.xpath("//nav[@id='topnav']/div[@class='global-search ng-scope']//input[@type='text']");
	private By notificationIconsLocator = By.xpath(
			"//nav[@id='topnav']/div[@class='ng-scope notifications-section']/div/section[1]/i[@class='fa fa-bell']");

	public HeaderNavigation(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void ClickMydashboard() {
		var mydashbordTab = driver.findElement(mydashbordTabLocator);
		mydashbordTab.click();
	}

	public void ClickSource() {
		var sourceTab = driver.findElement(sourceTabLocator);
		sourceTab.click();
	}

	public void ClickCompanies() {
		var companiesTab = driver.findElement(companiesTabLocator);
		companiesTab.click();
	}

	public void ClickPeople() {
		var peopleTab = driver.findElement(peopelTabLocator);
		peopleTab.click();
	}

	public void ClickInvestment() {
		var investmentTab = driver.findElement(investmentTabLocator);
		investmentTab.click();
	}

	public void SearchField(String text) {
		var searchField = driver.findElement(searchFieldLocator);
		searchField.sendKeys(text);

	}

	public void ClickNotification() {
		var notificationTab = driver.findElement(notificationIconsLocator);
		notificationTab.click();
	}
}
