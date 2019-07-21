package com.ebay.pages;

import static com.codeborne.selenide.Selenide.*;

import java.util.Random;

import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;

public class HomePage {

	public void clickRandomlyOnAnyCatagory() {
		Random random = new Random();
		int randomIndex = random.nextInt(3);
		$$(Selectors.byXpath("//li[@class='hl-cat-nav__js-tab']/a")).get(randomIndex).click();
	}

}
