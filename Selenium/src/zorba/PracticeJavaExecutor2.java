package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJavaExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.title;";
		System.out.println(js.executeScript(script));
		
		
		WebElement f = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(f);
		
		//click button
				//Selenium process
		//driver.findElement(By.xpath("/html/body/button")).click();
		//driver.switchTo().alert().accept();
		
		//Javascript process
		/*js.executeScript("myFunction()");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();*/
		
		//Highlight Element
		WebElement t = driver.findElement(By.xpath("/html/body/button"));
		js.executeScript("arguments[0].style.border='5px solid blue'", t);
		
		driver.navigate().to("https://www.w3schools.com/");
		WebElement t1 = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", t1);
		
	}

}
