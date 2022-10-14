package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//get
		driver.get("https://github.com/Minskoleopc/seleniumTutorials/blob/main/src/ui/WebdriveMethods.java");
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		// getCurrentUrl()
			//driver.getCurrentUrl();  OR write like below
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//manage()
			//To maximize the window
		driver.manage().window().maximize();
		
		//getPageSource()
		//driver.getPageSource();  //------or write like below by assigning to variables
		String pageSource = driver.getPageSource();
		
		//navigate()
		driver.navigate().to("https://webdriveruniversity.com/");
		
		//findElement() ----finds only one webElement
		 driver.findElement(By.id("button-clicks")).click();
		
		
		
		//quit() -- //closes all browser tabs
		driver.quit();
		
		//Close()
		driver.close();
		
		
	}

}
