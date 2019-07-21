package com.ebay.steps;

import com.ebay.pages.LoginPage;

public class LoginPageSteps {
	
	LoginPage loginPage;
	
	public void loginIntoEbay(String userName, String passWord) {
		loginPage=new LoginPage();
		loginPage.clickOnLoginBtn();
		loginPage.typeUsername(userName);
		loginPage.typePassword(passWord);
		loginPage.clickOnSigninBtn();
	}

}
