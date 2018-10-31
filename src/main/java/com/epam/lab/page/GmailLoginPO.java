package com.epam.lab.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.epam.lab.utils.SelenServer;

public class GmailLoginPO {
	private static final Logger LOG = Logger.getLogger(GmailLoginPO.class);
	
	@FindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
	private WebElement mainPage;

	@FindBy(id = "com.google.android.gm:id/setup_addresses_add_another")
	private WebElement anotherAddress;

	@FindBy(id = "com.google.android.gm:id/account_setup_label']")
	private WebElement accountSetUp;

	@FindBy(id = "identifierId")
	private WebElement login;

	@FindBy(className = "android.webkit.WebView")
	private WebElement emptyField;

	@FindBy(id = "identifierNext")
	private WebElement loginNext;

	@FindBy(xpath = "//android.widget.EditText[@password='true']")
	private WebElement pssword;

	@FindBy(id = "passwordNext")
	private WebElement psswordNext;

	@FindBy(id = "views")
	private WebElement views;

	private SelenServer server;

	public GmailLoginPO() {
		server = new SelenServer();
	}

	public GmailLoginPO clickMainPage() {
		mainPage.click();
		return this;
	}

	public GmailLoginPO clickAnotherAddress() {
		anotherAddress.click();
		return this;
	}

	public GmailLoginPO clickAccountSetUp() {
		accountSetUp.click();
		return this;
	}

	public GmailLoginPO clickLogin() {
		login.click();
		return this;
	}

	public GmailLoginPO inputLogin(String mail) {
		login.sendKeys(mail);
		return this;
	}

	public GmailLoginPO clickPassword() {
		pssword.click();
		return this;
	}

	public GmailLoginPO inputPassword(String pswrd) {
		pssword.sendKeys(pswrd);
		return this;
	}

	public GmailLoginPO clickLoginNext() {
		loginNext.click();
		return this;
	}

	public GmailLoginPO clickPasswordNext() {
		psswordNext.click();
		return this;
	}

	public GmailLoginPO clickEmptyField() {
		emptyField.click();
		return this;
	}

	public boolean isLoggined() {
		return views.isDisplayed();
	}

	public WebElement getAnotherAddress() {
		return anotherAddress;
	}

	public void closeDriver() {
		 server.closeDriver();
	}
	
	public void waitDriver(){
		try {
			new WebDriverWait(server.init(), 20)
			.until(ExpectedConditions.visibilityOf(getAnotherAddress()));
		} catch (Exception e) {
			LOG.error("Cannot set driver wait");
		}
	}

}
