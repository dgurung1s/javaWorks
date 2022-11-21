package zorba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		// Explicit Wait----- Dynamic Wait 
		// Explicit wait is to specific element specified by user
		// Explicit wait will wait for condition to match
		// Throws errors when the condition is not meet
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	    Actions action = new Actions(driver);
	    action.moveToElement(e).perform();
	    wait.until(ExpectedConditions.elementToBeClickable(e));           
	}

}
