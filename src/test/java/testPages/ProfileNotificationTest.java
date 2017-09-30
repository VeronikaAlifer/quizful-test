package testPages;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProfileNotificationsForm;

public class ProfileNotificationTest extends BaseClass {

	@Test
	public void verifyNotification() {
		ProfileNotificationsForm pForm = new ProfileNotificationsForm(driver);
		pForm.clickOnNotification();
		pForm.clickOnDeliveryEnabled();
		pForm.clickOnNotificationEnable();
		pForm.clickOnSaveButton();
	}
}
