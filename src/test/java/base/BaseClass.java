package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;

public class BaseClass {

	private static final String URL = "http://www.quizful.net/LoginAction.loginForm";
	private static final String SET_PROPERTIY_VALUE = "C:\\Users\\User-PC\\Downloads\\chromedriver_win32\\chromedriver.exe";
	private static final String SET_PROPERTIY_KEY = "webdriver.chrome.driver";
	private static final By profilButton = By.cssSelector("li.last a");
	private static final By editButton = By.xpath("//a[@class='btn btn-default btn-xs']");
	public WebDriver driver;

	@BeforeTest
	public void startBrowser() {
		System.setProperty(SET_PROPERTIY_KEY, SET_PROPERTIY_VALUE);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void testLogin() throws InterruptedException {
		new LoginPage(driver).login("VeronikaAlifer", "isohad90");
	}

	@BeforeClass
	public void chooseEditProfile() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(profilButton).click();
		driver.findElement(editButton).click();
	}

	@AfterClass
	public void clossAplication() {
		driver.quit();
	}

}
