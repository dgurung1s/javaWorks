package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class LoginPage {
	
		WebDriver driver;
		By userName = By.cssSelector("#user-name");
		By password = By.cssSelector("#password");
		By loginButton = By.cssSelector("#login-button");
		By logo = By.className("login_logo");
		By errorMsg =  By.className("error-button");
		
		LoginPage(WebDriver d){
			driver = d;
			
		}
		public void openBrowser() {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		}
		public void sendUserName (String username) {
			driver.findElement(userName).sendKeys(username);
		}
		public void sendPassword (String pw) {
			driver.findElement(password).sendKeys(pw);
		}
		public void clickloginButton () {
			driver.findElement(loginButton).click();
		}
		
		public Boolean LogoVisible() {
			return driver.findElement(logo).isDisplayed();
		}
		
		public void isLoginSuccessful() {
			List<WebElement> errors = driver.findElements(errorMsg);
			if(errors.size()== 0) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Invalid username or password");
			}
		}
		
		}

