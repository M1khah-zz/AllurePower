package pages;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;


@Log4j
public class HomePage extends  BasePage{

    @FindBy(id = "search_query_top")
    public WebElement topSearchField;

    @Step("Input search parameters: {0}")
    public void inputSearchParameters(String searchParams) {
        waitUntilVisible(topSearchField);
        topSearchField.click();
        topSearchField.sendKeys(searchParams);
        log.info("Search parameters was entered");
    }

    @FindBy(name = "submit_search")
    public  WebElement submitSearchButton;

    @Step("Submit search")
    public  void  submitSearch() {
        submitSearchButton.click();
    }


}
