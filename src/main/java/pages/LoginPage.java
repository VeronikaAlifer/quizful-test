package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

	private static final By login = By.id("login");
	private static final By password = By.name("loginForm.password");
	private static final By loginButton = By.name("ok");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String userLogin, String userPassword) {
		driver.findElement(login).sendKeys(userLogin);
		driver.findElement(password).sendKeys(userPassword);
		driver.findElement(loginButton).click();
	}
}
