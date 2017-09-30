package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

	private static final By login = By.id("login");
	private static final By password = By.name("loginForm.password");
	private static final By loginButton = By.name("ok");

	public void login(String myLogin, String myPassword) {
		driver.findElement(login).sendKeys(myLogin);
		driver.findElement(password).sendKeys(myPassword);
		driver.findElement(loginButton).click();
	}

	public LoginPage(WebDriver driver) {
		super(driver);
	}
}
