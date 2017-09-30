package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePrivacyForm extends Page{
	
	private static final By privacyField = By.xpath("//div[@id = 'profile-privacy-form']/div[@class = 'title']");
	private static final By profileVisibility = By.xpath("//input[@value = 'closed']");
	private static final By ButtonSave = By.name("privacyForm.save");
	
	public void clickPrivacyField(){
		driver.findElement(privacyField).click();
	}
	
	public void clickProfileVisibility(){
	driver.findElement(profileVisibility).click();
	}
	
	public void clickButtonSave(){
		driver.findElement(ButtonSave);
	}
		
	public ProfilePrivacyForm(WebDriver driver) {
		super(driver);
	}
}
