package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AssignmentWebElementMeth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//get()
		driver.get("http://automationpractice.com/index.php");
		
		//sendKeys()
	   	WebElement searchBox = driver.findElement(By.id("search_query_top"));
	   	searchBox.sendKeys("dress");
		
		//click()
		driver.findElement(By.name("submit_search")).click();
		
		//getAttribute()
		String compareClass = driver.findElement(By.className("bt_compare")).getAttribute("class");
		System.out.println(compareClass);
		
		//getText()
		String heading1 = driver.findElement(By.tagName("h1")).getText();
		System.out.println(heading1);
		
		//getTagName()
		String heading2 = driver.findElement(By.id("selectProductSort")).getTagName();
		System.out.println(heading2);
		
		//isDisplayed()
		boolean cartDisplayed = driver.findElement(By.className("shopping_cart")).isDisplayed();
		System.out.println(cartDisplayed);
		
		//isEnabled()
		boolean mainMenu = driver.findElement(By.id("block_top_menu")).isEnabled();
		System.out.println(mainMenu);
		
		//isSelected()
		WebElement sortBy = driver.findElement(By.id("uniform-selectProductSort"));
		sortBy.click();
		Thread.sleep(2000);
		
		WebElement dropDownOption = driver.findElement(By.xpath("//option[@value=\'price:asc\']"));
		dropDownOption.click();
		boolean dropDownOption1 = driver.findElement(By.xpath("//option[@value=\'price:asc\']")).isSelected();
		System.out.println(dropDownOption1);
		
	}

}
