package com.infoMatrix.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infoMatrix.getters.ContactsGetters;
import com.infoMatrix.locators.ContactsLocators;
import com.infoMatrix.utils.Utils;

/**
 * 
 * @author Mahima
 * modified y Mahima
 *
 */
public class ContactsActions 
{
	public static boolean validateContactsTab(WebDriver driver)
	{
		WebElement webElement = ContactsGetters.getContactUsTitle(driver);

		if(webElement.isDisplayed())
		{
			return true;
		}
		
		return false;
	}
	
	public static void populateContactDetails(WebDriver driver, String name, String email, String subject, String message)
	{
		WebElement nameElement = ContactsGetters.getContactNameTextField(driver);
		nameElement.sendKeys(name);
		
		WebElement emailElement = ContactsGetters.getContactEMailTextField(driver);
		emailElement.sendKeys(email);
		
		WebElement subjectElement = ContactsGetters.getContactSubjectTextField(driver);
		subjectElement.sendKeys(subject);
		
		WebElement messageElement = ContactsGetters.getContactMessageTextField(driver);
		messageElement.sendKeys(message);
	}
	
	public static void submitContacts(WebDriver driver)
	{
		WebElement btnElement = ContactsGetters.getSubmitContactBtn(driver);
		btnElement.click();
	}
	
	public static void waitForSubmission(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(ContactsLocators.CONTACT_SUBMIT_BTN_LTR));

	}
	
	public static boolean ValidateSuccessfulSubmission(WebDriver driver , String testName) throws AWTException, InterruptedException
	{
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(ContactsLocators.CONTACT_SUBMISSION_SUCCESS_MESSAGE_LTR));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		WebElement submittedText = ContactsGetters.getSubmissionSuccessMsg(driver);
		
		if(submittedText.isDisplayed())
		{
			status = true;
			System.out.println("Form is submitted Successfully");
			Utils.getScreenShot(driver, "submittedForm of " + testName);
		}
		
		return status;
		
	}
	
	public static boolean ValidateUnsuccessfulSubmission(WebDriver driver , String testName) throws AWTException, InterruptedException
	{
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(ContactsLocators.CONTACT_SUBMISSION_ERROR_MESSAGE_LTR));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		WebElement submittedText = ContactsGetters.getSubmissionErrorMsg(driver);
		
		if(submittedText.isDisplayed())
		{
			status = true;
			System.out.println("Form is blank");
			Utils.getScreenShot(driver, "submittedForm of " + testName);
		}
		
		return status;
		
	}
}