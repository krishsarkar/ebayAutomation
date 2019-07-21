package com.ebay.steps;

import java.util.Random;

import com.ebay.pages.CategoryPage;

public class CategoryPageSteps {
	
	CategoryPage categoryPage;
	
	public String searchProductOnEbay() {
		categoryPage=new CategoryPage();
		return categoryPage.getTextOfAnySubCatagory();
	}
	public void searchBySubCategory(String subCategory ) {
		categoryPage.typeTextIntoSearchTextbox(subCategory);
		categoryPage.clickOnSearchBtn();
		categoryPage.clickRandomlyOnAnyProduct();
		}

}
