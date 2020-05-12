package pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static framework.Wait.waitUntilVisible;

@Log4j
public class CreateAccountPage extends BasePage {

    Faker faker = new Faker();

    @FindBy(xpath = "//*[@class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@class='page-heading']")
    public WebElement pageHeading;

    @FindBy(id = "uniform-id_gender1")
    public WebElement maleGenderButton;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameField;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "company")
    public WebElement companyField;

    @FindBy(id = "address1")
    public WebElement addressField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "id_state")
    public WebElement stateSelector;

    @FindBy(id = "id_country")
    public WebElement countrySelector;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneField;

    @FindBy(id = "postcode")
    public WebElement postcodeField;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id = "email_create")
    public  WebElement emailSignUpField;

    public void selectMaleGender() {
        waitUntilVisible(maleGenderButton);
        maleGenderButton.click();
        log.info("Gender selected");
    }

    public void inputFirstname(String firstName) {
        firstNameField.sendKeys(firstName);
        log.info("Firstname entered");
    }

    public void inputLastname(String lastName) {
        lastNameField.sendKeys(lastName);
        log.info("Lastname entered");
    }

    public void inputPassword(String psswd) {
        passwordField.sendKeys(psswd);
        log.info("Password entered");
    }

    public void inputCompanyName(String companyName) {
        companyField.sendKeys(companyName);
        log.info("Company named");
    }

    public void inputAddress(String address){
        addressField.sendKeys(address);
        log.info("Address entered");
    }

    public void inputPostCode(String postCode){
        postcodeField.sendKeys(postCode);
        log.info("Postcode entered");
    }

    public void inputCityName(String city){
        cityField.sendKeys(city);
        log.info("City name entered");
    }

    public void inputMobilePhone(String phone) {
        mobilePhoneField.sendKeys(phone);
        log.info("Phone entered");
    }

    public void selectCountry() {
        Select list = new Select(countrySelector);
        list.selectByValue("21");
        log.info("Country selected");
    }

    public void selectState() {
        Select list = new Select(stateSelector);
        list.selectByValue("2");
        log.info("State selected");
    }

    public void clickRegisterButton(){
        registerButton.click();
        log.info("Register button clicked");
    }

    public String getPageTitle() {
        return pageHeading.getText();
    }

    public void clickSignIn() {
        waitUntilVisible(signInButton);
        signInButton.click();
        log.info("Clicked log in button");
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
        log.info("Creaate account button clicked");
    }

    public void inputSignUpEmail(String email) {
        emailSignUpField.click();
        emailSignUpField.sendKeys(email);
        log.info("Email inputted");
    }

    public void createUser(){
        clickSignIn();
        inputSignUpEmail(faker.internet().emailAddress());
        clickCreateAccountButton();
        log.info("Moved to create account screen");
    }

    @Step("Fill in user details and register")
    public void registerUser(){
        selectMaleGender();
        inputFirstname(faker.funnyName().name());
        inputLastname(faker.ancient().primordial());
        inputPassword(faker.internet().password());
        inputCompanyName(faker.company().name());
        inputAddress(faker.address().streetAddress());
        inputCityName(faker.address().city());
        inputPostCode(faker.address().zipCode());
        inputMobilePhone(faker.phoneNumber().cellPhone());
        selectCountry();
        selectState();
        clickRegisterButton();
        log.info("User created");
    }

}
