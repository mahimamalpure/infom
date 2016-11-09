package com.infoMatrix.locators;

import org.openqa.selenium.By;

import com.infoMatrix.locatorvalues.ContactsLocatorValues;

public interface ContactsLocators 
{
	public static final By CONTACT_US_TITLE_LTR = By.xpath(ContactsLocatorValues.CONTACT_US_TITLE_VAL);
	public static final By CONTACT_NAME_INPUT_LTR = By.xpath(ContactsLocatorValues.CONTACT_NAME_INPUT_VAL);
	public static final By CONTACT_EMAIL_INPUT_LTR = By.xpath(ContactsLocatorValues.CONTACT_EMAIL_INPUT_VAL);
	public static final By CONTACT_SUBJECT_INPUT_LTR = By.xpath(ContactsLocatorValues.CONTACT_SUBJECT_INPUT_VAL);
	public static final By CONTACT_MESSAGE_INPUT_LTR = By.xpath(ContactsLocatorValues.CONTACT_MESSAGE_INPUT_VAL);
	public static final By CONTACT_SUBMIT_BTN_LTR = By.xpath(ContactsLocatorValues.CONTACT_SUBMIT_BTN_VAL);
	public static final By CONTACT_SUBMISSION_SUCCESS_MESSAGE_LTR = By.xpath(ContactsLocatorValues.CONTACT_SUBMISSION_SUCCESS_MESSAGE);
	public static final By CONTACT_SUBMISSION_ERROR_MESSAGE_LTR = By.xpath(ContactsLocatorValues.CONTACT_SUBMISSION_ERROR_MESSAGE);
}
