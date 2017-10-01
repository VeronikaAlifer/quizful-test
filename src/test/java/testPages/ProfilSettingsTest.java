package testPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
		List<WebElement> elements = driver.findElements(By.cssSelector("dl#personal-contacts dd"));
		WebElement element = elements.get(1);
		Assert.assertEquals(element.getText(), "Laura Palmer");
	}
}
