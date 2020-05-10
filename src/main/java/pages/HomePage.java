package pages;

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
        log.info("Search parameters were entered");
    }

    @FindBy(name = "submit_search")
    public  WebElement submitSearchButton;

    public  void  submitSearch() {
        submitSearchButton.click();
    }

    @FindBy(className = "login")
    public WebElement signInButton;

    public void clickSignIn() {
        signInButton.click();
    }

    @FindBy(id = "email_create")
    public  WebElement emailSignUpField;

    public void inputSignUpEmail(String email) {
        emailSignUpField.click();
        emailSignUpField.sendKeys(email);
    }

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    @Step("Create user")
    public  void createUser(){
        clickSignIn();
        inputSignUpEmail(int_random + "user@test.com");
        clickCreateAccountButton();
    }
}
