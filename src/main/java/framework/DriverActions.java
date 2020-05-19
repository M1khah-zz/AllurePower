package framework;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;

@Log4j
public class DriverActions {

    static WebDriver driver = PlatformFactory.getDriver();

    public static void open(String url) {
        driver.get(url);
    }
}
