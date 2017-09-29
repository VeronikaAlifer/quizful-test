package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePersonalForm extends Page {
	By profilButton = By.cssSelector("li.last a");
	By editButton = By.xpath("//a[@class='btn btn-default btn-xs']");
	By personalInformation = By.xpath("//div[@id='profile-personal-form']/div[@class = 'title']");
	By name = By.name("personalForm.name");
	By surname = By.name("personalForm.surname");
	By birthyear = By.name("personalForm.birthyear");
	By siteName = By.name("personalForm.site");
	By companyName = By.name("personalForm.company");
	By country = By.name("personalForm.countryId");
	By myCountry = By.xpath("//option[@value ='XisgEe4sJp28']");
	By cityField = By.name("personalForm.cityId");
	By city = By.xpath("//option[@value ='DeUeodssAWsT']");
	By zoneField = By.name("personalForm.zone");
	By zone = By.xpath("//option[@value ='Europe/Minsk']");
	By personalFormAbout = By.name("personalForm.about");
	By avatar = By.name("personalForm.avatar");
	
	public void tt(){
	driver.findElement(profilButton).click();
	driver.findElement(editButton).click();
	driver.findElement(personalInformation).click();
	
	}
	
	public void typeName(){
	driver.findElement(name).clear();
	driver.findElement(name).sendKeys("Veronika");
	}
	
	public void typeSurname(){
	driver.findElement(surname).clear();
	driver.findElement(surname).sendKeys("Alifer");
	}
	
	public void typeBirthyear(){
	driver.findElement(birthyear).clear();
	driver.findElement(birthyear).sendKeys("1984");
	}
	
	public void typeSiteName(){
	driver.findElement(siteName).clear();
	driver.findElement(siteName).sendKeys("www.quizful.net");
	
	}
	
	public void typeCompanyName(){
	driver.findElement(companyName).clear();
	driver.findElement(companyName).sendKeys("FunnyDog");
	}
	
	public void chooseCountry(){
	driver.findElement(country).click();
	driver.findElement(myCountry).click();
	}
	
	public void chooseCity(){
	driver.findElement(cityField).click();
	driver.findElement(city).click();
	}
	
	public void chooseZone(){
	driver.findElement(zoneField).click();
	driver.findElement(zone).click();
	}
	
	public void writePersonalFormAbout(){
	driver.findElement(personalFormAbout).clear();
	driver.findElement(personalFormAbout).sendKeys("I have a dog!!");
	}

	public void downloadAvatar(){
		driver.findElement(avatar).sendKeys("c:\\Users\\User-PC\\Pictures\\12.jpg");
	}

	public ProfilePersonalForm(WebDriver driver) {
		super(driver);
		}

}
