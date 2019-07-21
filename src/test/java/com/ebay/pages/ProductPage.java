package com.ebay.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ProductPage {
	
 public SelenideElement getProductMissingElement() {
	return $(Selectors.byXpath("//p[@class='error-header__headline']"));
 }
 public void clickOnGoToHomepageBtn() {
	 $(".fake-btn").click();
 }
 
 public SelenideElement getBuyNowBtnElement() {
	 return $("#binBtn_btn");
 }
}
