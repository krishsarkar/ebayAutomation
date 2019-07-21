package com.ebay.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {
	
	public void clickOnLoginBtn() {
		$(Selectors.byXpath("//span[@id='gh-ug']/a")).click();
	}
	public void typeUsername(String userName) {
		$("#userid").val(userName);
	}
	public void typePassword(String passWord) {
		 $("#pass").val(passWord);
	}
	public void clickOnSigninBtn() {
		$("#sgnBt").click();
	}

//import com.codeborne.selenide.Selectors;
//import com.codeborne.selenide.SelenideElement;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Condition.*;

}
