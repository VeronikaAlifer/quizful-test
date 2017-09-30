package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePersonalForm extends Page {
	
	private static final By personalInformation = By.xpath("//div[@id='profile-personal-form']/div[@class = 'title']");
	private static final By name = By.name("personalForm.name");
	private static final By surname = By.name("personalForm.surname");
	private static final By birthyear = By.name("personalForm.birthyear");
	private static final By siteName = By.name("personalForm.site");
	private static final By companyName = By.name("personalForm.company");
	private static final By country = By.name("personalForm.countryId");
	private static final By myCountry = By.xpath("//option[@value ='XisgEe4sJp28']");
	private static final By cityField = By.name("personalForm.cityId");
	private static final By city = By.xpath("//option[@value ='DeUeodssAWsT']");
	private static final By zoneField = By.name("personalForm.zone");
	private static final By zone = By.xpath("//option[@value ='Europe/Minsk']");
	private static final By personalFormAbout = By.name("personalForm.about");
	private static final By avatar = By.name("personalForm.avatar");
	private static final By savePersonalForm = By.name("personalForm.save");
	

	public void typeName(String userName) {
		driver.findElement(personalInformation).click();
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys(userName);
		
	}

	public void typeSurname(String userSurename) {
		driver.findElement(surname).clear();
		driver.findElement(surname).sendKeys(userSurename);
	}

	public void typeBirthyear(String userBirthyear) {
		driver.findElement(birthyear).clear();
		driver.findElement(birthyear).sendKeys(userBirthyear);
	}

	public void typeSiteName(String userSiteName) {
		driver.findElement(siteName).clear();
		driver.findElement(siteName).sendKeys(userSiteName);

	}

	public void typeCompanyName(String userCompanyName) {
		driver.findElement(companyName).clear();
		driver.findElement(companyName).sendKeys(userCompanyName);
	}

	public void chooseCountry() {
		driver.findElement(country).click();
		driver.findElement(myCountry).click();
	}

	public void chooseCity() {
		driver.findElement(cityField).click();
		driver.findElement(city).click();
	}

	public void chooseZone() {
		driver.findElement(zoneField).click();
		driver.findElement(zone).click();
	}

	public void writePersonalInformation(String persanalInformation) {
		driver.findElement(personalFormAbout).clear();
		driver.findElement(personalFormAbout).sendKeys(persanalInformation);
	}

	public void downloadAvatar() {
		driver.findElement(avatar).sendKeys("c:\\Users\\User-PC\\Pictures\\12.jpg");
	}
	
	public void clickOnSaveButton(){
		driver.findElement(savePersonalForm).click();;
	}

	public ProfilePersonalForm(WebDriver driver) {
		super(driver);
	}

}
