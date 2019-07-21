package com.ebay.steps;

import com.codeborne.selenide.SelenideElement;
import com.ebay.pages.ProductPage;

public class ProductPageSteps {
	
	ProductPage productPage;
	
	public SelenideElement getProductMissingElement() {
		ProductPage productPage =new ProductPage();
		return productPage.getProductMissingElement();
	}
	
	public void goToHomepage() {
		productPage=new ProductPage(); 
		productPage.clickOnGoToHomepageBtn();
	}
	
	public SelenideElement getBuyNowButton() {
		productPage=new ProductPage();
		return productPage.getBuyNowBtnElement();
	}
	

}
