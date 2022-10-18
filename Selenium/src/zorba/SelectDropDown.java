package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement dropDown = driver.findElement(By.id("dropdowm-menu-2"));
		
		Select select = new Select (dropDown); 
		
		//selectByIndex
		//select.selectByIndex(3);
		
		//selectByText
		//select.selectByVisibleText("Maven");
		
		//selectByValue
		select.selectByValue("junit");
	}

}
