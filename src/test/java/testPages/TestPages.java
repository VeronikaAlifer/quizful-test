package testPages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.Privacy;
import pages.ProfileNotificationsForm;
import pages.ProfilePersonalForm;
import pages.QuizfulPage;

public class TestPages {
	private WebDriver driver;
	String URL = "http://www.quizful.net/LoginAction.loginForm";
	
	@BeforeClass
	public void startBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test 
	public void testToLogin(){
		new LoginPage(driver).toLogin("VeronikaAlifer", "isohad90");
		String expected_title = "Quizful - тесты онлайн";
		Assert.assertEquals(driver.getTitle(), expected_title);
	}

//	@Test
//	public void testOpenQuisfulPage() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\User-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		QuizfulPage quizfulPage = new QuizfulPage(driver);
//		quizfulPage.openQuizfulPage();
//		String expected_title = "Quizful - тесты онлайн";
//		Assert.assertEquals(driver.getTitle(), expected_title);
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.typeLogin("VeronikaAlifer");
//		loginPage.typePassword("isohad90");
//		loginPage.clickOnLoginButton();
//	}

//	@Test
//	public void testPrifilePersonalForm() {
//		ProfilePersonalForm pForm = new ProfilePersonalForm(driver);
//		pForm.tt();
//		pForm.typeName();
//		pForm.typeSurname();
//		pForm.chooseCountry();
//		pForm.chooseCity();
//		pForm.chooseZone();
//		pForm.typeCompanyName();
//		pForm.typeBirthyear();
//		pForm.typeSiteName();
//		pForm.downloadAvatar();
//
//	}
//
//	@Test
//	public void testPrivacy() {
//		Privacy privacy = new Privacy(driver);
//		privacy.clickPrivacyField();
//		privacy.clickProfileVisibility();
//	}
//
//	@Test
//	public void testProfileNotificationsForm() throws InterruptedException {
//		ProfileNotificationsForm pNotificationsForm = new ProfileNotificationsForm(driver);
//		pNotificationsForm.clickOnNotification();
//
//		Thread.sleep(1000);
//		pNotificationsForm.clickOnNotificationEnable();
//		pNotificationsForm.clickOnDeliveryEnabled();
//		pNotificationsForm.clickOnSaveButton();
//	}
}
