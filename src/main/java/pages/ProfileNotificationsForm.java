package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileNotificationsForm extends Page {
	By notification = By.xpath("//div[@id='profile-notifications-form']/div[@class='title']");
	By saveButton = By.name("notificationsForm.save");
	By notificationsEnabled = By.name("notificationsForm.notificationsEnabled");
	By deliveryEnabled = By.name("notificationsForm.deliveryEnabled");

	public void clickOnNotification() {

		driver.findElement(notification).click();
	}

	public void clickOnNotificationEnable() {
		driver.findElement(notificationsEnabled).click();
	}

	public void clickOnDeliveryEnabled() {
		driver.findElement(deliveryEnabled).click();
	}

	public void clickOnSaveButton() {
		driver.findElement(saveButton).click();
	}

	public ProfileNotificationsForm(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
