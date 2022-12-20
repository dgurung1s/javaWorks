package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestcaseParameter extends BaseTest {
	@Parameters({"username","password","loginbuttonLocator","itemcountLocator","usernameLocator","passwordLocator"})
	@Test 
	public static void logIn(String username, String password,String loginbuttonLocator, String usernameLocator, String passwordLocator) throws InterruptedException {
		System.out.println("username: " + username);
		driver.get(config.getProperty("baseurl"));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(usernameLocator)).sendKeys(username);
		driver.findElement(By.cssSelector(passwordLocator)).sendKeys(password);
		driver.findElement(By.cssSelector(loginbuttonLocator)).click();
		Thread.sleep(2000);
	}
	
	@Parameters({"username","password","loginbuttonLocator","itemcountLocator","usernameLocator","passwordLocator"})
	@Test
	public static void GetTitle(String username, String password,String loginbuttonLocator, String usernameLocator, String passwordLocator) throws InterruptedException {
		logIn(username, password,loginbuttonLocator,usernameLocator, passwordLocator);
		System.out.println("The title is "+driver.getTitle());
	}
		
	//Count Items
	@Parameters({"username","password","loginbuttonLocator","itemcountLocator","usernameLocator","passwordLocator"})
	@Test
	public static void countItems(String username, String password,String loginbuttonLocator, String usernameLocator, String passwordLocator, String itemcountLocator) throws InterruptedException {
		logIn(username, password,loginbuttonLocator,usernameLocator, passwordLocator);
		System.out.println("Count page title "+driver.getTitle());
		List<WebElement> productsList = driver.findElements(By.className(itemcountLocator));
		System.out.println(productsList.size());    //size means total count of the product
		
		for(int i=0; i<productsList.size();i++)
		{
			System.out.println(productsList.get(i).getText());
		}
	}
	
}
