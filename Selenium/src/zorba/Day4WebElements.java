package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class Day4WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		//Sendkeys()
		//driver.findElement(By.id("text")).sendKeys("dgurung1s");  //or write like below by assigning to variables
		WebElement username = driver.findElement(By.id("text"));
		username.sendKeys("dgurung1s");
		Thread.sleep(2000);
		//clear()
		username.clear();
		
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		//getText()
		//String a = driver.findElement(By.id("contact-us")).getText(); 
		String a = driver.findElement(By.xpath("//h1[@ style=\"color:#f45950;\"]")).getText(); //-------xPath finding Element inside element
		//String a = driver.findElement(By.xpath("//div[@id='udemy-promo-thumbnail']//h1")).getText(); //--------xPath finding Element inside element
		System.out.println(a);
		Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("Contact Us Form")).click();		
		//driver.close();
		
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		
		//Above
		//WebElement button2 = driver.findElement(By.id("button2"));
		//WebElement h2 = driver.findElement(with(By.tagName("h2")).above(button2));
		//System.out.println(h2.getText());
		By aa = RelativeLocator.with(By.id("button2")).below(By.tagName("h2"));
		String aaValue = driver.findElement(aa).getText();
		System.out.println(aaValue);
		
		//Below
		By bb = RelativeLocator.with(By.tagName("h2")).below(By.id("main-header"));
		System.out.println(driver.findElement(bb).getText());
		
		//left-of
		By cc = RelativeLocator.with(By.tagName("b")).toLeftOf(By.id("button2"));
		System.out.println(driver.findElement(cc).getText());
		
		//right-of
		By dd = RelativeLocator.with(By.id("button2")).toRightOf(By.id("button1"));
		System.out.println(driver.findElement(dd).getText());
		
		//near
		By ee = RelativeLocator.with(By.id("button2")).near(By.className("section-title"));
		System.out.println(driver.findElement(ee).getText());
		
	}

}
