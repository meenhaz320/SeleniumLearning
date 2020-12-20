package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
private WebDriver driver;

public ElementUtil(WebDriver driver) {
	this.driver = driver;
}
	
public WebElement getElement(By locator) {
	return driver.findElement(locator);
}

public List <WebElement> getElements(By locator) {
	return driver.findElements(locator);
}

public String getAttribute(By locator, String attributeName) {
	return getElement(locator).getAttribute(attributeName);
}

public boolean doIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}

//use when you have alot of similar elements and want to print amount, names, and click on what you want 
public void clickElement(By locator, String value) {
	List <WebElement> eleUtil = getElements(locator);
	
	System.out.println(eleUtil.size());
	
	for(int i = 0; i<eleUtil.size(); i++) {
		String text = eleUtil.get(i).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase(value)) {
			eleUtil.get(i).click();
			break;
		}
	}
}

}
