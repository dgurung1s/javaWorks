package zorba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//Assignment-Click on every radio button
		
		List<WebElement> colorButtons = driver.findElements(By.cssSelector("input[name=\"color\"]"));
		for(int a = 0; a < colorButtons.size(); a++) {    
			System.out.println(a + " " + colorButtons.get(a).getAttribute("value"));
			if(!colorButtons.get(a).isSelected()) {
				colorButtons.get(a).click();
				Thread.sleep(2000);
			}
		}
		
		
		
		//Practice-RadioButtons
		
//		WebElement yellowButton = driver.findElement(By.cssSelector("input[value='yellow']"));
//		yellowButton.click();
//		//Assertion
//		if (yellowButton.isSelected()) {
//			System.out.println("Yellow Radio button selected.");
//		}
//		else {
//			System.out.println("Yellow Radio button not selected.");
//		}
	}

}
