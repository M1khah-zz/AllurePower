package pages;


import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j
public class CheckoutPage extends BasePage {

    Faker faker = new Faker();

    @FindBy(xpath = "//*[@title=\"Add to cart\" and @data-id-product=\"1\"]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[1]")
    public WebElement proceedToCheckoutButtonModal;

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[2]")
    public WebElement proceedToCheckoutButtonPage;

    @FindBy(xpath = "//h1[@id = 'cart_title']")
    public WebElement cartTitle;

    @FindBy(xpath = "//i[@class = 'icon-plus']")
    public WebElement increaseProdictAmountButton;

    @FindBy(id = "summary_products_quantity")
    public WebElement summaryProductQuantity;

    @FindBy(xpath = "//button[@name='processAddress']")
    public WebElement processAddressButton;

    @FindBy(xpath = "//button[@name='processCarrier']")
    public WebElement processCarrierButton;

    @FindBy(id = "cgv")
    public WebElement tosCheckbox;

    @FindBy(xpath = "//a[@class='bankwire']")
    public WebElement bankwirePaymentButton;

    @FindBy(xpath = "//*[text()='I confirm my order']")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//*[text()='Your order on My Store is complete.']")
    public WebElement successSign;


}
