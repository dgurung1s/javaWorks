package zorba;

import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentwithCoupons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		UUID uuid = UUID.randomUUID();
		String username = uuid +"@gmail.com";
		//Automation for registration
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html//input[@id='customer-first-name']")).sendKeys("Dona");
		driver.findElement(By.id("customer-last-name")).sendKeys("Gurung");
		driver.findElement(By.id("customer-email")).sendKeys(username);
		driver.findElement(By.id("customer-password")).sendKeys("Dona123!");
		driver.findElement(By.className("ws-v2-button-primary")).click();
		
		//Purchase with credit/coupon
		//Automation for login
		driver.get("https://qatest.commentsoldrt.com/webstore-login?destination=/account");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys("Dona123!");
		driver.findElement(By.className("ws-v2-button-primary")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Confirm
		List<WebElement> pinkButtons = driver.findElements(By.id("pink-button"));
		if (pinkButtons.size()>0) {
			WebElement a1 = driver.findElement(By.id("pink-button"));
			System.out.println(a1.getText());
			driver.findElement(By.id("pink-button")).click();
		}
		//Adding to cart
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.xpath("//button[contains(@aria-label, 'close')]")).click();
		driver.findElement(By.cssSelector("[data-testid='promo-grid-item'")).click();
		driver.findElement(By.linkText("Tie-Dye Socks")).click();
		driver.findElement(By.xpath("//label[@for='4-Color-Blue']")).click();
		driver.findElement(By.xpath("//button[contains(@aria-label, 'Increase quantity')]")).click();
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		
		//Shipping Info
		driver.findElement(By.id("one")).click();
		WebElement a = driver.findElement(By.className("modal-shipping"));
		driver.findElement(By.cssSelector("[autocomplete='address-line1']")).sendKeys("113 Silver Springs Street" );
		driver.findElement(By.id("locality")).sendKeys("Cape");
		WebElement dropDown = driver.findElement(By.name("state"));
		Select select = new Select (dropDown);
		select.selectByValue("MO");
		driver.findElement(By.name("state")).sendKeys("Missouri");
		driver.findElement(By.cssSelector("[autocomplete='postal-code']")).sendKeys("63703");
		driver.findElement(By.id("save-button")).click();
//		driver.findElement(By.id("back")).click();
		
		//CreditCard
		driver.findElement(By.xpath("//label[contains(@for, 'credit-card')]")).click();
		WebElement  e =driver.findElement(By.xpath("//iframe[contains(@title, 'Secure card payment input frame')]"));
		driver.switchTo().frame(e);
		driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242");
		driver.findElement(By.name("exp-date")).sendKeys("05/24");
		driver.findElement(By.name("cvc")).sendKeys("111");
		driver.findElement(By.name("postal")).sendKeys("63701");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("stripe-button")).click();
		Thread.sleep(10000);
		
		//Add Coupon Code
		driver.findElement(By.cssSelector("._right-column ._pill-button")).click();
		
		driver.findElement(By.cssSelector(".coupon-input.default-input")).sendKeys("5OFF20");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(10000);
		
		//Submit Payment
		// driver.findElement(By.className("_cta-button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("_cta-button")));
		driver.findElement(By.className("_cta-button")).click();
		
	
		//Close and Continue
		Thread.sleep(10000);
		driver.findElement(By.className("webstore-checkout-btn")).click();
		
		//Go to Account
		driver.findElement(By.xpath("//a[contains(@aria-label, 'Account')]")).click();
		
		//Logout
		driver.findElement(By.className("red")).click();
		

		driver.quit();
	}
	
	
	
}
