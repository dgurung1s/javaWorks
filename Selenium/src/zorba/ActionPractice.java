package zorba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		//Create object of the class
		Actions a = new Actions (driver);
		
		//Double Click
		WebElement d =  driver.findElement(By.id("double-click"));
		a.doubleClick(d).perform();
		
		//Drag & Drop-act.dragAndDrop(From, To).build().perform();
		WebElement from = driver.findElement(By.cssSelector("#draggable"));
		WebElement to = driver.findElement(By.cssSelector("#droppable"));
		a.dragAndDrop(from, to).build().perform();
		
		//Click and Hold
		
		WebElement d1 = driver.findElement(By.cssSelector("#click-box"));
		a.moveToElement(d1);  //this is a kind of action on the webpage in which the mouse cursor moves to a WebElemet
		a.clickAndHold().perform();
		
		//Context Click(Right Click)
		WebElement d2 = driver.findElement(By.cssSelector("#double-click"));
		a.contextClick().perform();
		
		//Hover over element
		WebElement d3 = driver.findElement(By.cssSelector(".dropbtn"));
		a.moveToElement(d3).perform();
		
		
		
	}

}
