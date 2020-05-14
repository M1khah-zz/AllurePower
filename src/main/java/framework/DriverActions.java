package framework;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Log4j
public class DriverActions {

    static WebDriver driver = PlatformFactory.getDriver();

    public static void open(String url) {
        driver.get(url);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,550)", "");
    }

    public static void mouseOver(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}
