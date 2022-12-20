package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestcaseDataprovider extends BaseTest {
	
	@Test(dataProvider = "LoginCredentials")
	public static void logIn(String username, String password) throws InterruptedException {
		driver.get(config.getProperty("baseurl"));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(locators.getProperty("username"))).sendKeys(username);
		driver.findElement(By.cssSelector(locators.getProperty("password"))).sendKeys(password);
		driver.findElement(By.cssSelector(locators.getProperty("loginbutton"))).click();
		Thread.sleep(2000);
	}
	 
	@Test(dataProvider = "LoginCredentials")
	public static void GetTitle(String username, String password) throws InterruptedException {
		logIn(username,password);
		System.out.println("The title is "+driver.getTitle());
	}
		
	//Count Items 
	@Test(dataProvider = "LoginCredentials")
	public static void countItems(String username, String password) throws InterruptedException {
		logIn(username,password);
		System.out.println("Count page title "+driver.getTitle());
		List<WebElement> productsList = driver.findElements(By.className(locators.getProperty("itemcount")));
		System.out.println(productsList.size());    //size means total count of the product
		
		for(int i=0; i<productsList.size();i++)
		{
			System.out.println(productsList.get(i).getText());
		}
	}
	
}
