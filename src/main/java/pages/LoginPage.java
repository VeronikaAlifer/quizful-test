package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
	
	By login = By.id("login");
	By password = By.name("loginForm.password");
	By loginButton = By.name("ok");
	
	public void typeLogin(String myLogin){
		driver.findElement(login).sendKeys(myLogin);
	}
	
	public void typePassword(String myPassword){
		driver.findElement(password).sendKeys(myPassword);
	}
	
	public void clickOnLoginButton(){
		driver.findElement(loginButton).click();
	}
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

}
