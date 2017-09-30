package testPages;

import org.testng.annotations.Test;

import base.BaseClass;

import org.testng.Assert;

import pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@Override
	@Test
	public void testLogin() throws InterruptedException {
		new LoginPage(driver).login("VeronikaAlifer", "isohad90");
		String expectedTitle = "Quizful - тесты онлайн";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
}
