package com.ebay.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Selenide.*;

import java.util.Random;

import static com.codeborne.selenide.Condition.*;

public class CategoryPage {
	
	public String getTextOfAnySubCatagory() {
		Random random =new Random();
		int randomIndex=random.nextInt($$(".b-visualnav__title").size());
		return $$(".b-visualnav__title").get(randomIndex).getText();
	}
	public void typeTextIntoSearchTextbox(String subCatagory) {
		$("#gh-ac").val(subCatagory);
	}
	public void clickOnSearchBtn() {
		$("#gh-btn").click();
	}
	public void clickRandomlyOnAnyProduct() {
		Random random =new Random();
		int randomIndex=random.nextInt(5);
		$$(Selectors.byXpath("//h3[@class='s-item__title']")).get(randomIndex).click();
	}
}
