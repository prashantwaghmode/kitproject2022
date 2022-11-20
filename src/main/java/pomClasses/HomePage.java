package pomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.Util1;

public class HomePage extends Util1{
	
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboardText;
	
	@FindBy(xpath="//span[text()='Funds']")
	private WebElement fundText;
	
	
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public boolean checkForHomePage() throws IOException {
		try {
			explicitWait(driver, dashboardText, 20);
		}catch(Exception e) {
			return false;
		}
	
		return true;
	}
	
	
	public void clickOnFundText() {
		fundText.click();
	}

}
