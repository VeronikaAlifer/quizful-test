package pages;

import org.openqa.selenium.WebDriver;

public class QuizfulPage extends Page {
	
	String URL = "http://www.quizful.net/LoginAction.loginForm";
	
	public void openQuizfulPage()
	{
		getDriver().get(URL);
	}
	

	public QuizfulPage(WebDriver driver) {
		super(driver);
		
	}

}
