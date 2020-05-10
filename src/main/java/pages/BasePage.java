package pages;

import framework.PlatformFactory;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;


@Log4j
public abstract class BasePage {

    Random rand = new Random();
    int upperbound = 999999;
    int int_random = rand.nextInt(upperbound);

    public BasePage() {

        PageFactory.initElements(PlatformFactory.getDriver(), this);

    }

}
