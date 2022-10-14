package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("has-text-white")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("donnagrg@gmail.com");
		driver.findElement(By.cssSelector("#idToken2")).sendKeys("w123");
		driver.findElement(By.linkText("I forgot my password")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("password")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	

}
