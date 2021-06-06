package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctions extends Base {



    public static void insertText(WebElement retrunedWE, String insertText){
        wait.until(ExpectedConditions.elementToBeClickable(retrunedWE));
       retrunedWE.sendKeys(insertText);
    }

    public static void click(WebElement retrunedWE){
        wait.until(ExpectedConditions.elementToBeClickable(retrunedWE));
        retrunedWE.click();
    }

    public static void swithToParentFrame(WebElement retrunedWE){
        getDriver().switchTo().defaultContent();
        //getDriver().switchTo().frame(retrunedWE);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(retrunedWE));
        //getDriver().switchTo().frame(retrunedWE);
    }

    public static void swithToInsideFrame(WebElement retrunedWE){
        /*getDriver().switchTo().frame(retrunedWE);*/
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(retrunedWE));
    }

    public static void clickUsingSelect(WebElement retrunedWE,String value,String using){
        Select select=new Select(retrunedWE);
        wait.until(ExpectedConditions.elementToBeClickable(retrunedWE));
        switch (using)
        {
            case "byvalue":
                select.selectByValue(value);
                break;
            case "byvisibletext":
                select.selectByVisibleText(value);
                break;
        }

    }

    public static void waitTiming(WebElement retrunedWE){
       wait.until(ExpectedConditions.elementToBeClickable(retrunedWE));
    }

}
