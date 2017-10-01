package testPages;


import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProfilePersonalForm;

public class ProfilSettingsTest extends BaseClass {

	@Test(priority = 1)
	public void testProfileSettingsForm() {
		ProfilePersonalForm pForm = new ProfilePersonalForm(driver);
		pForm.typeName("Laura");
		pForm.typeSurname("Palmer");
		pForm.typeBirthYear("1987");
		pForm.typeCompanyName("Ledy");
		pForm.typeSiteName("http://www.quizful.net");
		pForm.chooseCountry();
		pForm.chooseCity();
		pForm.chooseZone();
		pForm.uploadAvatar();
		pForm.typePersonalInformation("I have a cat!!");
		pForm.clickSaveButton();
	}
}
