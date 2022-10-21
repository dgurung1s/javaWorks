package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		/*
		 * driver.get("https://webdriveruniversity.com/IFrame/index.html"); WebElement
		 * frame = driver.findElement(By.id("frame")); driver.switchTo().frame(frame);
		 * driver.findElement(By.cssSelector("a[href=\"index.html\"]")).click();
		 * System.out.println(driver.getTitle()); driver.switchTo().parentFrame();
		 */
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement  e =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		driver.findElement(By.cssSelector("body > button")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
