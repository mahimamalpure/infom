package com.infoMatrix.locatorvalues;

public interface ContactsLocatorValues 
{
	public static final String CONTACT_US_TITLE_VAL  = "//div[@class='wpb_wrapper']/h3[contains(text(),'CONTACT US')]";
	public static final String CONTACT_NAME_INPUT_VAL = "//p/span/input[@name='your-name']";
	public static final String CONTACT_EMAIL_INPUT_VAL = "//p/span/input[@name='your-email']";
	public static final String CONTACT_SUBJECT_INPUT_VAL = "//p/span/input[@name='your-subject']";
	public static final String CONTACT_MESSAGE_INPUT_VAL = "//p/span/textarea";
	public static final String CONTACT_SUBMIT_BTN_VAL = "//p/input[@type='submit']";
	public static final String CONTACT_NAME = "";
	public static final String CONTACT_SUBMISSION_SUCCESS_MESSAGE = "//div[contains(@class,'wpcf7-response-output') and contains(text(),'sent')]";
	public static final String CONTACT_SUBMISSION_ERROR_MESSAGE = "//div[contains(@class,'wpcf7-response-output') and contains(text(),'error')]";
}
