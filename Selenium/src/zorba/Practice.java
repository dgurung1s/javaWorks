package zorba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.saucedemo.com/");		
		driver.getTitle();
		
		Thread.sleep(2000);
	}

}
