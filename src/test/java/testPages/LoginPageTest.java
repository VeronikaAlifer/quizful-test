package testPages;

import org.testng.annotations.Test;
import base.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@Test(priority = 0)
	public void testLogin() throws InterruptedException {
		new LoginPage(driver).login("VeronikaAlifer", "isohad90");
		WebElement userNameElement = driver.findElement(By.cssSelector("#user-panel a"));
		Assert.assertEquals(userNameElement.getText(), "VeronikaAlifer");	
	}
	
	@Override
	@Test(enabled = false)
	public void chooseEditProfile() throws InterruptedException {
		System.out.println("chooseEditProfile");
	} 
}
