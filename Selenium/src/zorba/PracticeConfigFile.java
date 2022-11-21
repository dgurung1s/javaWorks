package zorba;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeConfigFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties config = new Properties();
		FileInputStream inputStream = new FileInputStream("C:\\Users\\shoot\\OneDrive\\Desktop\\javaWorks\\Selenium\\src\\zorba\\Testing.Properties");
		config.load(inputStream);
		inputStream.close();
		
		System.setProperty("webdriver.chrome.driver",config.getProperty("seleniumDriver"));
		WebDriver driver = new ChromeDriver();
		String baseUrl = config.getProperty("baseUrl");
		driver.get(baseUrl);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(config.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(config.getProperty("password"));
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		System.out.println(config.getProperty("employeeName"));
		
		//Output
		FileOutputStream output = new FileOutputStream("C:\\Users\\shoot\\OneDrive\\Desktop\\javaWorks\\Selenium\\src\\zorba\\Testing.Properties");
		config.setProperty("employeeName", "Nick");
		config.store(output, "Added employee name");
		config.setProperty("employeeId", "ID#4582");
		config.store(output, "Added employee ID");
		config.setProperty("employeeAddress", "1012 Sprigg St");
		config.store(output, "Added employee Address");
		//or can also be written as config.store(output, "added employee name, id, address);
		output.close();
	}

}
