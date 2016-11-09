package com.infoMatrix.getters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.infoMatrix.locators.ContactsLocators;

public class ContactsGetters 
{
	public static WebElement getContactUsTitle(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_US_TITLE_LTR);
	}
	
	public static WebElement getContactEMailTextField(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_EMAIL_INPUT_LTR);
	}
	
	public static WebElement getContactSubjectTextField(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_SUBJECT_INPUT_LTR);
	}
	
	public static WebElement getContactMessageTextField(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_MESSAGE_INPUT_LTR);
	}
	
	public static WebElement getContactNameTextField(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_NAME_INPUT_LTR);
	}
	
	public static WebElement getSubmitContactBtn(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_SUBMIT_BTN_LTR);
	}
	
	public static WebElement getSubmissionSuccessMsg(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_SUBMISSION_SUCCESS_MESSAGE_LTR);
	}
	
	public static WebElement getSubmissionErrorMsg(WebDriver driver)
	{
		return driver.findElement(ContactsLocators.CONTACT_SUBMISSION_ERROR_MESSAGE_LTR);
	}
}