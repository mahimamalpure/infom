package com.infoMatrix.getters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.infoMatrix.locators.HomeLocators;

public class HomeGetters 
{
	public static WebElement getContactsTab(WebDriver driver)
	{
		return driver.findElement(HomeLocators.CONTACT_TAB_LTR);
	}
}
