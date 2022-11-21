package zorba;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class PracticeFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.ebay.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	    Actions action = new Actions(driver);
	    action.moveToElement(a).perform();
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		  .withTimeout(Duration.ofSeconds(20))   //---no error thrown before 30 sec
	    		  .pollingEvery(Duration.ofSeconds(8))
	    		  .withMessage("Finding element")
	    		  .ignoring(NoSuchElementException.class);
		 wait.until(ExpectedConditions.elementToBeClickable(a));
		    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
	}

}
