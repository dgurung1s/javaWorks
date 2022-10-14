package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("shootnstarz0012@gmail.com");
		//driver.close();
		
		driver.get("https://en.wikipedia.org/wiki/Rose");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("toctext")).click();
		 driver.findElement(By.partialLinkText("Log in")).click(); 
		driver.findElement(By.id("searchInput")).sendKeys("Lotus");
		Thread.sleep(5000);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		//Assertion:
		if(driver.getTitle().contains("Lotus")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.findElement(By.id("searchInput")).sendKeys("Lily");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		//Assertion:
		if(driver.getTitle().contains("Lily")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		Thread.sleep(5000);
		driver.close();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.partialLinkText("Forgot your password? ")).click();
		
		}

}
