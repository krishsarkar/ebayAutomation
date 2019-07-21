package com.ebay.tests;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Exist;
import com.ebay.configs.ApplicationData;
import com.ebay.steps.CategoryPageSteps;
import com.ebay.steps.HomePageSteps;
import com.ebay.steps.LoginPageSteps;
import com.ebay.steps.ProductPageSteps;

public class Test {

	private LoginPageSteps loginPageSteps =new LoginPageSteps();
	private HomePageSteps homePageSteps =new HomePageSteps();
	private CategoryPageSteps categoryPageSteps=new CategoryPageSteps();
	private ProductPageSteps productPageSteps=new ProductPageSteps();
	private ApplicationData applicationData=new ApplicationData();
	
	private String userName=applicationData.getEbayUsername();
	private String passWord=applicationData.getEbayPassword();
	
	private String subCategory;
	private SelenideElement missingProductElement;
	private SelenideElement buyNowButton;
	
	@org.testng.annotations.Test(description="Search Product in Ebay")
	public void test_SearchProductInEbay() throws Exception {
		
		open(applicationData.getEbayURL());
		Thread.sleep(1000);
		loginPageSteps.loginIntoEbay(userName, passWord);
		Thread.sleep(5000);
		for(int i=0;;i++) {
		homePageSteps.clickRandomlyOnCatagory();
		subCategory=categoryPageSteps.searchProductOnEbay();
		categoryPageSteps.searchBySubCategory(subCategory);
		missingProductElement=productPageSteps.getProductMissingElement();
		if(missingProductElement.exists()) {
			productPageSteps.goToHomepage();
		 }
		else {
			break;
		}
		}
		buyNowButton=productPageSteps.getBuyNowButton();
		buyNowButton.shouldBe(visible);
	}


}
