package com.ebay.steps;

import java.util.Random;

import com.ebay.pages.HomePage;

public class HomePageSteps {

	 HomePage homePage;
	 
	 public void clickRandomlyOnCatagory() {
	     homePage=new HomePage();
		 homePage.clickRandomlyOnAnyCatagory();
	 }
}
