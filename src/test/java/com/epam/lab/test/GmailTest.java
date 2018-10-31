package com.epam.lab.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.epam.lab.bo.GmailLoginBO;
import com.epam.lab.utils.Constants;

public class GmailTest {

	@Test
	public void verifyLoginGmail(){
		GmailLoginBO gmailLoginBO = new GmailLoginBO();
		gmailLoginBO.clickMainPage();
		gmailLoginBO.clickAnotherAddress();
		gmailLoginBO.driverWait();
		gmailLoginBO.clickAccountSetUp();
		gmailLoginBO.clickLogin();
		gmailLoginBO.inputLogin(Constants.MAIL);
		gmailLoginBO.clickEmptyField();
		gmailLoginBO.clickLoginNext();
		gmailLoginBO.clickPassword();
		gmailLoginBO.inputPassword(Constants.PASSWORD);
		gmailLoginBO.clickEmptyField();
		gmailLoginBO.clickPasswordNext();
		Assert.assertTrue(gmailLoginBO.isLoggined(),"User is not logined");
		gmailLoginBO.closeDriver();
	}
}
