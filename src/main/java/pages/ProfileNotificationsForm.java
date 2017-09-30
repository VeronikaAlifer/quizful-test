package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileNotificationsForm extends Page {
	
	private static final By notification = By.xpath("//div[@id='profile-notifications-form']/div[@class='title']");
	private static final By saveButton = By.name("notificationsForm.save");
	private static final By notificationsEnabled = By.name("notificationsForm.notificationsEnabled");
	private static final By deliveryEnabled = By.name("notificationsForm.deliveryEnabled");

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
	}
}
