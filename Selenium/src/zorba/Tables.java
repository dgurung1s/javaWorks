package zorba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		
		//How to manage tables
		//Get the number of rows
		//Get the total numbers of columns
		//Iterate rows and columns and print the text of column
		
		//List<WebElement> totalTable = driver.findElements(By.cssSelector("div#thumbnail-1 > table:nth-of-type(1) > tbody"));
		List<WebElement> totalTable = driver.findElements(By.xpath("//*[table]"));
		System.out.println(totalTable.size());
		int cTables = totalTable.size();
		
		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(rowElements.size());
		int rowSize = rowElements.size();
		
		List<WebElement> columnElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(columnElements.size());
		int colSize = columnElements.size();
		
//		for (int a = 2; a <= rowSize; a++) {
//			for (int b = 1; b <= colSize; b++) {
//				String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + a + "]/td[" + b + "]")).getText();
//				System.out.println(text);
			
//			}
//		}
		//sum of all age
		int sum = 0;
		for(int x = 2; x <= rowSize; x++) {
			String text = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + x + "]/td[3]")).getText();
			System.out.println(text);
			sum = sum + Integer.parseInt(text);  //changing string into integer
		}
		System.out.println(sum);
		System.out.println(sum/(rowSize-1));
			
	}

}
