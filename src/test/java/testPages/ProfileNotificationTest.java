package testPages;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProfileNotificationsForm;

public class ProfileNotificationTest extends BaseClass {

	@Test(priority = 2)
	public void testProfileNotification() {
		ProfileNotificationsForm pForm = new ProfileNotificationsForm(driver);
		pForm.clickNotification();
		pForm.clickDeliveryEnabled();
		pForm.clickNotificationEnable();
		pForm.clickSaveButton();
	}
}
