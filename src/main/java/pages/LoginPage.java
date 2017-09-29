package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private static final By login = By.id("login");
	private static final By password = By.name("loginForm.password");
	private static final By loginButton = By.name("ok");
	private WebDriver driver;
	
	public void toLogin(String myLogin, String myPassword){
		driver.findElement(login).sendKeys(myLogin);
		driver.findElement(password).sendKeys(myPassword);
		driver.findElement(loginButton).click();
	}
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}

}
