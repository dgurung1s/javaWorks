package zorba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoot\\OneDrive\\Desktop\\javaworks\\selenium-resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.espncricinfo.com/series/swaminarayan-pro-twenty-2022-23-1342104/mafuko-mavericks-vs-play-master-warriors-14th-match-1342125/full-scorecard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//How to manage tables
		//Get the number of rows
		//Get the total numbers of columns
		//Iterate rows and columns and print the text of column
		
		List<WebElement> totalTable = driver.findElements(By.xpath("//*[table]"));
		System.out.println(totalTable.size());
		//int cTables = totalTable.size();
		
		WebElement baseTable = driver.findElement(By.className("ci-scorecard-table"));
		List<WebElement> tableRows = baseTable.findElements(By.className("ds-table-row-compact-bottom"));
		String heading = tableRows.get(0).getText();
		System.out.println("Total Rows: " + tableRows.size());
		int totalRuns = 0;
		for (int x = 0; x <= tableRows.size()-1; x++) {
			List<WebElement> columns = tableRows.get(x).findElements(By.tagName("td"));
			String playerName = columns.get(0).getText();
			String totalPlayerRuns = columns.get(2).getText();
			//System.out.println(columns.get(1).getText());
			System.out.println(playerName+ " - " + totalPlayerRuns);
			int run = Integer.parseInt(totalPlayerRuns);
			totalRuns+=run;
		}
		
		WebElement extraRow = baseTable.findElement(By.xpath("//tr[@class = 'ds-text-tight-s']"));
		List<WebElement> extraRowTd = extraRow.findElements(By.className("ds-min-w-max"));
		//System.out.println(extraRowTd.size());
		int extraRun = Integer.parseInt(extraRowTd.get(2).getText());
		System.out.println("Extra Run: "+extraRun);
		System.out.println("Total Runs: "+ (totalRuns+extraRun));
		
		
		
		
		
		
		
		
		//List<WebElement> rowElements = driver.findElements(By.xpath(""));
		//System.out.println(rowElements.size());
		//int rowSize = rowElements.size();
		
//		List<WebElement> columnElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
//		System.out.println(columnElements.size());
//		int colSize = columnElements.size();
		
//		for (int a = 2; a <= rowSize; a++) {
//			for (int b = 1; b <= colSize; b++) {
//				String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + a + "]/td[" + b + "]")).getText();
//				System.out.println(text);
			
//			}
//		}
		//sum of all age
//		int sum = 0;
//		for(int x = 2; x <= rowSize; x++) {
//			String text = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + x + "]/td[3]")).getText();
//			System.out.println(text);
//			sum = sum + Integer.parseInt(text);  //changing string into integer
//		}
//		System.out.println(sum);
//		System.out.println(sum/(rowSize-1));
//			
	}

}
