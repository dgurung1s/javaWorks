package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginPageTest {
	@Test
	public void VerifyLogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		LoginPage loginPage = new LoginPage (driver);
		loginPage.openBrowser();
		loginPage.sendUserName("standard_user");
		loginPage.sendPassword("secret_sauce");
		loginPage.clickloginButton();
		Thread.sleep(3000);
		
		//Validation
		
		loginPage.isLoginSuccessful();
		
		//System.out.println(loginPage.LogoVisible());
		
		loginPage.openBrowser();
		loginPage.sendUserName("standard_us");
		loginPage.sendPassword("secret");
		loginPage.clickloginButton();
		Thread.sleep(3000);
		
		//Validation
		loginPage.isLoginSuccessful();
		driver.close();
		
		
	}
}
