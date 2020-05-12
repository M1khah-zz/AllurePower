package pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Wait.waitUntilVisible;


@Log4j
public class HomePage extends  BasePage{

    Faker faker = new Faker();

    @FindBy(id = "search_query_top")
    public WebElement topSearchField;

    @FindBy(name = "submit_search")
    public  WebElement submitSearchButton;

    @FindBy(xpath = "//*[@class='login']")
    public WebElement signInButton;

    @FindBy(id = "email_create")
    public  WebElement emailSignUpField;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(className = "lighter")
    public WebElement searchName;

    @FindBy(id = "create_account_error")
    public WebElement accountError;

    @FindBy(className = "page-heading")
    public WebElement authHeader;

    public String getSearchName() {
        return searchName.getText();
    }

    public String getAuthHeader(){
        return authHeader.getText();
    }

    @Step("Input search parameters: {0}")
    public void inputSearchParameters(String searchParams) {
        waitUntilVisible(topSearchField);
        topSearchField.click();
        topSearchField.sendKeys(searchParams);
        log.info("Search parameters were entered");
    }

    public  void  submitSearch() {
        submitSearchButton.click();
    }

    public void clickSignIn() {
        waitUntilVisible(signInButton);
        signInButton.click();
    }

    public void inputSignUpEmail(String email) {
        emailSignUpField.click();
        emailSignUpField.sendKeys(email);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public void createUser(){
        clickSignIn();
        inputSignUpEmail(faker.internet().emailAddress());
        clickCreateAccountButton();
        log.info("Moved to create account screen");
    }

}
