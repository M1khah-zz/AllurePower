package pages;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j
public class SearchResultPage extends BasePage{

    @FindBy(className = "product-container")
    public WebElement resultCell;

    public WebElement resultsExist() {
        return resultCell;
    }

}
