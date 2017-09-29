package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Privacy extends Page{
	
	By privacyField = By.xpath("//div[@id = 'profile-privacy-form']/div[@class = 'title']");
	By profileVisibility = By.xpath("//input[@value = 'closed']");
	
	public void clickPrivacyField(){
		driver.findElement(privacyField).click();
	}
	
	public void clickProfileVisibility(){
	driver.findElement(profileVisibility).click();
	}
	
	

	public Privacy(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
