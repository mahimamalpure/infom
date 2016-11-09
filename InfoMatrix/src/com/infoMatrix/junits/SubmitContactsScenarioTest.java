package com.infoMatrix.junits;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import com.infoMatrix.actions.ContactsActions;
import com.infoMatrix.actions.HomeActions;
import com.infoMatrix.utils.Utils;
import com.infoMatrix.config.*;

public class SubmitContactsScenarioTest 
{
	private WebDriver driver;
    @Rule public TestName testName = new TestName();


	@Before
	public void launchBrowser()
	{
		System.out.println("***************** " + testName.getMethodName() + " is started ***********************");
		driver = Utils.launchSelectedBrowser(Configurations.BROWSER_NAME);
	}
	
	@After
	public void tearDown()
	{
		System.out.println("***************** " + testName.getMethodName() + " is finished ***********************");
		driver.close();
	}
	
	@Test
	public void TestScenario1() throws InterruptedException, AWTException
	{
		HomeActions.clickContactsTab(driver);
		
		boolean isContactsTabDisplayed = ContactsActions.validateContactsTab(driver);
		
		Assert.assertTrue(isContactsTabDisplayed);
		
		Utils.getScreenShot(driver, "BlankContactForm of " + testName.getMethodName());
		
		ContactsActions.populateContactDetails(driver, "abc", "abc@gmail.com", "General Enquiry", "General Enquiry message");
		
		Utils.getScreenShot(driver, "FilledContactForm of " + testName.getMethodName());
		
		ContactsActions.waitForSubmission(driver);
		
		ContactsActions.submitContacts(driver);
		
		boolean isContactsSubmitted = ContactsActions.ValidateSuccessfulSubmission(driver, testName.getMethodName());
		
		Assert.assertTrue(isContactsSubmitted);
	}
	
	@Test
	public void TestScenario2() throws InterruptedException, AWTException
	{
		HomeActions.clickContactsTab(driver);
		
		boolean isContactsTabDisplayed = ContactsActions.validateContactsTab(driver);
		
		Assert.assertTrue(isContactsTabDisplayed);
		
		Utils.getScreenShot(driver, "BlankContactForm of " + testName.getMethodName());
		
		ContactsActions.populateContactDetails(driver, "", "", "", "");
		
		Utils.getScreenShot(driver, "FilledContactForm of " + testName.getMethodName());
		
		ContactsActions.waitForSubmission(driver);
		
		ContactsActions.submitContacts(driver);
		
		boolean isContactsSubmitted = ContactsActions.ValidateUnsuccessfulSubmission(driver, testName.getMethodName());
		
		Assert.assertTrue(isContactsSubmitted);
	}

}
