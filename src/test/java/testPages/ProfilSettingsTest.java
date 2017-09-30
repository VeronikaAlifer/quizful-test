package testPages;


import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProfilePersonalForm;

public class ProfilSettingsTest extends BaseClass {

	@Test
	public void testPrifilePersonalForm() {
		ProfilePersonalForm pForm = new ProfilePersonalForm(driver);
		pForm.typeName("Laura");
		pForm.typeSurname("Palmer");
		pForm.typeBirthyear("1987");
		pForm.typeCompanyName("Ledy");
		pForm.typeSiteName("http://www.quizful.net");
		pForm.chooseCountry();
		pForm.chooseCity();
		pForm.chooseZone();
		pForm.downloadAvatar();
		pForm.writePersonalInformation("I have a cat!!");
		pForm.clickOnSaveButton();
	}
	
	

	// @Test
	// public void testPrivacy() {
	// Privacy privacy = new Privacy(driver);
	// privacy.clickPrivacyField();
	// privacy.clickProfileVisibility();
	// }
	//
	// @Test
	// public void testProfileNotificationsForm() throws InterruptedException {
	// ProfileNotificationsForm pNotificationsForm = new
	// ProfileNotificationsForm(driver);
	// pNotificationsForm.clickOnNotification();
	//
	// Thread.sleep(1000);
	// pNotificationsForm.clickOnNotificationEnable();
	// pNotificationsForm.clickOnDeliveryEnabled();
	// pNotificationsForm.clickOnSaveButton();
	// }
}
