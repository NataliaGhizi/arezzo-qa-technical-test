package pageobjects;

import models.BaseGeneric;
import utils.Element;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class BasePage extends Element {

    protected static void click(BaseGeneric generic) {
        waitForElementVisible(generic);
        WebElement element = element(generic);
        element.click();
    }

    protected static void fillInput(String text, BaseGeneric generic) {
        waitForElementVisible(generic);
        element(generic).clear();
        element(generic).sendKeys(text);
    }
    
    protected static void selectValue(String text, BaseGeneric generic) {
    	Select selectedElement = selectElement(generic);
    	selectedElement.selectByValue(text);
    }
    
    public static String expectedResult(BaseGeneric generic) {
        waitForElementVisible(generic);
        WebElement element = element(generic);
    	return element.getText();
    }
 
}
