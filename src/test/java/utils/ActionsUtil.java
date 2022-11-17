package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {
    private static Actions actions;

    static{
        actions = new Actions(Driver.getDriver());
    }

    public static void rightClick(WebElement element){
        actions.contextClick(element).perform();
    }

    /**
     * This method moves your mouse to the desired element
     *
     * @param element
     */
    public static void moveToElement(WebElement element){
        actions.moveToElement(element).perform();
    }
}
