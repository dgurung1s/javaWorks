package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		/*
		 * driver.findElement(By.id("button1")).click(); Thread.sleep(2000);
		 * driver.switchTo().alert().accept();
		 */
		
		driver.findElement(By.id("button4")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();   //or to cancel
		driver.switchTo().alert().dismiss();
	}

}
