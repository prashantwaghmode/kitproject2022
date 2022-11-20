package utilClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {
	
	
	public static String getDataFromConfig(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("configuration\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		return prop.getProperty(key);
		
	}
	
	
	public static void explicitWait(WebDriver driver, WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public static List<String> getWindowAddressList(WebDriver driver) {
		
	//	List<String> address = new ArrayList<>(driver.getWindowHandles());
	
		return new ArrayList<>(driver.getWindowHandles());
	}
	
	

}
