package com.epam.lab.bo;

import com.epam.lab.page.GmailLoginPO;

public class GmailLoginBO extends GmailLoginPO{
	
	private GmailLoginPO gmailLoginPO;

	public GmailLoginBO() {
		gmailLoginPO = new GmailLoginPO();
	}

	public GmailLoginPO clickMainPage(){
		return gmailLoginPO.clickMainPage();
	}
	
	public GmailLoginPO clickAnotherAddress(){
		return gmailLoginPO.clickAnotherAddress();
	}
	
	public GmailLoginPO clickAccountSetUp(){
		return gmailLoginPO.clickAccountSetUp();
	}
	
	public GmailLoginPO clickLogin(){
		return gmailLoginPO.clickLogin();
	}
	
	public GmailLoginPO inputLogin(String mail){
		return gmailLoginPO.inputLogin(mail);
	}
	
	public GmailLoginPO clickPassword(){
		return gmailLoginPO.clickPassword();
	}
	
	public GmailLoginPO inputPassword(String pswrd){
		return gmailLoginPO.inputPassword(pswrd);
	}
	
	public GmailLoginPO clickLoginNext(){
		return gmailLoginPO.clickLoginNext();
	}
	
	public GmailLoginPO clickPasswordNext(){
		return gmailLoginPO.clickPasswordNext();
	}
	
	public GmailLoginPO clickEmptyField(){
		return gmailLoginPO.clickEmptyField();
	}

	public boolean isLoggined()  {
		return gmailLoginPO.isLoggined();
	}
	
	public void closeDriver(){
		gmailLoginPO.closeDriver();
	}
	
	public void driverWait(){
		gmailLoginPO.waitDriver();
	}
	
}
