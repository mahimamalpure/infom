package com.infoMatrix.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.infoMatrix.getters.HomeGetters;

public class HomeActions 
{
	public static void clickContactsTab(WebDriver driver)
	{
		WebElement webelement = HomeGetters.getContactsTab(driver);
		webelement.click();
	}
}
