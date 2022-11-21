package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJavaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement  e =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		

//		driver.findElement(By.cssSelector("body > button")).click();
//		driver.switchTo().alert().accept();
		
//		System.out.println(driver.getTitle());
		
//		String script = "return document.title;";
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		System.out.println(js.executeScript(script));
		

//		javascript executor way to invoke function
//		js.executeScript("myFunction()");
//		driver.switchTo().alert().accept();
		

		WebElement e1 = driver.findElement(By.cssSelector("body > button"));
		js.executeScript("arguments[0].style.border = '5px dotted yellow'",e1);
		js.executeScript("arguments[0].style.color = 'red'",e1);
		js.executeScript("arguments[0].style.fontSize = '18px'",e1);
		js.executeScript("arguments[0].innerHTML = 'Press Button'",e1);
	}

}
