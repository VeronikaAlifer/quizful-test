package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	private static final String URL = "http://www.quizful.net/LoginAction.loginForm";
	private static final String SET_PROPERTIY_VALUE = "C:\\Users\\User-PC\\Downloads\\chromedriver_win32\\chromedriver.exe";
	private static final String SET_PROPERTIY_KEY = "webdriver.chrome.driver";
	private static final By profileButton = By.cssSelector("li.last a");
	private static final By editButton = By.xpath("//a[@class='btn btn-default btn-xs']");
	public static WebDriver driver;

	@BeforeSuite
	public void startBrowser() {
		System.setProperty(SET_PROPERTIY_KEY, SET_PROPERTIY_VALUE);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("@BeforeSuite startBrowser");
	}

	@BeforeClass
	public void chooseEditProfile() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(profileButton).click();
		driver.findElement(editButton).click();
		System.out.println("@BeforeClass chooseEditProfile");
	}

	@AfterSuite
	public void closeAplication() {
		driver.close();
		System.out.println(	"@AfterTest clossAplication");
	}
}
