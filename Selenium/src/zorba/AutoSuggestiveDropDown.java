package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromCity")).sendKeys("Mum");
		Thread.sleep(2000);
		driver.findElement(By.className("react-autosuggest__input--open")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		//driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		driver.findElement(By.className("react-autosuggest__input--open")).sendKeys(Keys.ENTER);
		
	}

}
