package testPages;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProfilePrivacyForm;

public class ProfilePrivacyTest extends BaseClass{
	
	@Test(priority = 3)
	public void testProfilePrivacy() throws InterruptedException{
		ProfilePrivacyForm pForm = new ProfilePrivacyForm(driver);
		pForm.clickPrivacyField();
		Thread.sleep(1000);
		pForm.clickProfileVisibility();
		Thread.sleep(1000);
		pForm.clickButtonSave();
	}
}
