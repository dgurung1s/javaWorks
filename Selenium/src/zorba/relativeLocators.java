package zorba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.saucedemo.com/");		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String products = driver.findElement(By.cssSelector(".title")).getText();
		System.out.println("products");
		Thread.sleep(2000);
		
		//RelativeLocator
		//Above
		By product1 = RelativeLocator.with(By.className("title")).above(By.cssSelector("a[id='item_4_title_link'] div[class='inventory_item_name']"));
		String aa = driver.findElement(product1).getText();
		System.out.println(aa);
		
		//Below
		By product2 = RelativeLocator.with(By.className("inventory_item_price")).below(By.id("item_1_title_link"));
		String a1 = driver.findElement(product2).getText();
		System.out.println(a1);
		
		//leftOf
		By product3 = RelativeLocator.with(By.className("inventory_item_price")).toLeftOf(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		String a2 = driver.findElement(product3).getText();
		System.out.println(a2);
		
		//rightOf
		By product4 = RelativeLocator.with(By.className("product_sort_container")).toRightOf(By.className("peek"));
		String a3 = driver.findElement(product4).getText();
		System.out.println(a3);
		
		//Find multiple elements
		List<WebElement> productsList = driver.findElements(By.className("inventory_item_name"));
		System.out.println(productsList.size());    //size means total count of the product
		
		for(int i=0; i<productsList.size();i++)
		{
			System.out.println(productsList.get(i).getText());
		}
	}

}
