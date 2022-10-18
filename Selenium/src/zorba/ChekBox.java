package zorba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//3As = Arrangement, Action, Assertion
		
		//Arrangement-
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//Action
		WebElement checkBoxOne = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
		checkBoxOne.click();
		
		//Assertion
		if(checkBoxOne.isSelected()) {
			System.out.println("Checkbox is selected.");
		}
		else {
			System.out.println("Checkbox is not selected.");
		}
		
		// selecting all the check box
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		for(int i = 0 ; i < checkBoxes.size() ; i++ ) {
			System.out.println(i + "-"+ checkBoxes.get(i).getAttribute("value"));
			if(!checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}
			
		}
		
		
	}

}
