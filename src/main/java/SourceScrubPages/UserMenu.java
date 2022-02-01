package SourceScrubPages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sorcescrub.base.BasePageObject;

public class UserMenu extends BasePageObject {

	private By userMenuLocator = By.cssSelector("app-user-menu mat-icon[role='img'");

	private By firmAdminPageLocator = By.cssSelector("div#mat-menu-panel-0 > div > a:nth-of-type(1)");
	private By reaserchResquestPageLocator = By.xpath("//a[@href='/research/researchdashboard/1283']");
	private By manageTagsPageLocator = By.xpath("//a[@href='/tags/manage']");
	private By sourcePageLocator = By.xpath("//a[@href='/source/index']");
	private By companiesPageLocator = By.xpath("//div[@id='top-section']/div[@class='top-menu-btns']/a[4]");
	private By investmentCompaniesPageLocator = By.xpath("//a[@href='/investmentcompany/list']");
	private By peopelPageLocator = By.xpath("//a[@href='/people']");
	private By profilePageLocator = By.xpath("//a[@href='/profile/']");
	private By systemSetingsPageLocator = By.xpath("//a[@href='/system/settings/']");
	private By deafaultPermisionsPageLocator = By.xpath("//a[@href='/system/permissions']");
	private By logoutButtonLocator = By.xpath("//a[contains(text(),'Logout')]");

	public UserMenu(WebDriver driver, Logger log) {
		super(driver, log);

	}

	public void ClickUserMenu() {
		waitForVisibilityOf(userMenuLocator);
		var userMenu = driver.findElement(userMenuLocator);
		userMenu.click();
	}

	public void ClickFirmAdmin() {
		waitForVisibilityOf(firmAdminPageLocator);
		var firmAdmin = driver.findElement(firmAdminPageLocator);
		firmAdmin.click();
	}

	public void ClickReaserchResquest() {
		var reaserchResques = driver.findElement(reaserchResquestPageLocator);
		waitForVisibilityOf(reaserchResquestPageLocator, 5);
		reaserchResques.click();
	}

	public void ClickManageTags() {
		var manageTags = driver.findElement(manageTagsPageLocator);
		waitForVisibilityOf(manageTagsPageLocator, 5);
		manageTags.click();
	}

	public void ClickSource() {
		var investmentTab = driver.findElement(sourcePageLocator);
		waitForVisibilityOf(sourcePageLocator, 5);
		investmentTab.click();
	}

	public void ClickCompanies() {
		var companiesPage = driver.findElement(companiesPageLocator);
		waitForVisibilityOf(companiesPageLocator, 5);
		companiesPage.click();

	}

	public void ClickInvestmentCompanies() {
		var investmentCompaniesPage = driver.findElement(investmentCompaniesPageLocator);
		waitForVisibilityOf(investmentCompaniesPageLocator, 5);
		investmentCompaniesPage.click();
	}

	public void ClickPeopel() {
		var peopelPage = driver.findElement(peopelPageLocator);
		waitForVisibilityOf(peopelPageLocator, 5);
		peopelPage.click();

	}

	public void ClickProfiler() {
		var profilePage = driver.findElement(profilePageLocator);
		waitForVisibilityOf(profilePageLocator, 5);
		profilePage.click();

	}

	public void ClicksyStemSetings() {
		var systemSetingsPage = driver.findElement(systemSetingsPageLocator);
		waitForVisibilityOf(systemSetingsPageLocator, 5);
		systemSetingsPage.click();

	}

	public void ClickDeafaultPermisionsPage() {
		var deafaultPermisionsPage = driver.findElement(deafaultPermisionsPageLocator);
		waitForVisibilityOf(deafaultPermisionsPageLocator, 5);
		deafaultPermisionsPage.click();

	}

	public void ClickLogoutButton() {
		var logoutButton = driver.findElement(logoutButtonLocator);
		waitForVisibilityOf(logoutButtonLocator, 5);
		logoutButton.click();
	}

}
