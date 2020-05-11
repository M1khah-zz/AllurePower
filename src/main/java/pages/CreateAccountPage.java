package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

@Log4j
public class CreateAccountPage extends BasePage {

    @FindBy(className = "page-heading")
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

    @FindBy(id = "address")
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


    public void selectMaleGender() {
        maleGenderButton.click();
    }

    public void inputFirstname(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLastname(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputPassword(String psswd) {
        passwordField.sendKeys(psswd);
    }

    public void inputCompanyName(String companyName) {
        companyField.sendKeys(companyName);
    }

    public void inputAddress(String address){
        addressField.sendKeys(address);
    }

    public void inputPostCode(String postCode){
        postcodeField.sendKeys(postCode);
    }

    public void inputCityName(String city){
        cityField.sendKeys(city);
    }

    public void inputMobilePhone(String phone) {
        mobilePhoneField.sendKeys(phone);
    }

    public void selectCountry() {
        Select list = new Select(countrySelector);
        list.selectByIndex(0);
    }

    public void selectState(String state) {
        Select list = new Select(stateSelector);
        list.selectByVisibleText(state);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public String getPageTitle() {
        return pageHeading.getText();
    }

    @Step("Fill in user details and reggister")
    public void registerUser(){
        selectMaleGender();
        inputFirstname("Kir");
        inputLastname("Alexeyenko");
        inputPassword("qwerty");
        inputCompanyName("Yalantis");
        inputAddress("Valley");
        inputCityName("Dnipro");
        inputPostCode("50049");
        inputMobilePhone("123456789");
        selectCountry();
        selectState("Nevada");
        clickRegisterButton();
        log.info("User created");
    }

}
