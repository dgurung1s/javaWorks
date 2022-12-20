package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties locators = new Properties();
	
	@DataProvider(name="LoginCredentials")
	public Object [][] dataset2(){  
		return new Object [][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
	};
	} 
		
	@BeforeTest
	public void setUp() throws IOException {
		if(driver == null)
		{
			FileInputStream inputStream = new FileInputStream(
					System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			config.load(inputStream);
			FileInputStream inputLocatorsStream = new FileInputStream(
					System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			locators.load(inputLocatorsStream);
			
		}
		
		String browser = config.getProperty("browser");
		System.out.println(browser);
		System.out.println(browser.equals("chrome"));
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
