package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	public void clickElement(WebElement element){
		element.click();
	}
	
	public void sendKeys(WebElement element, String text){
		element.sendKeys(text);
	}	
}