package pages;


import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j
public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//*[@title=\"Add to cart\" and @data-id-product=\"1\"]")
    public WebElement addToCartButton;

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

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[1]")
    public WebElement proceedToCheckoutButtonModal;

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[2]")
    public WebElement proceedToCheckoutButtonPage;

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[1] or (//a[@title=\"Proceed to checkout\"])[2]) or '//button[@name='processCarrier' or //button[@name='processCarrier']")
    public WebElement proceedToCheckoutButton;

    @FindBy(id = "cgv")
    public WebElement tosCheckbox;

    @FindBy(xpath = "//a[@class='bankwire']")
    public WebElement bankwirePaymentButton;

    @FindBy(xpath = "//*[text()='I confirm my order']")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//*[text()='Your order on My Store is complete.']")
    public WebElement successSign;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement logoutButton;

    public void addItemToCart() {
        addToCartButton.click();
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }

    public String getCartTitle() {
        return cartTitle.getText();
    }

    public void increaseProductAmount() {
        increaseProdictAmountButton.click();
        log.info("Product amount increased");
    }

    public String getProductQuantity() {
        return summaryProductQuantity.getText();
    }

    public void acceptToS() {
        tosCheckbox.click();
        log.info("ToS accepted");
    }

    public void selectBankwire() {
        bankwirePaymentButton.click();
        log.info("Bankwire selected");
    }

    public void confirmOrder() {
        confirmOrderButton.click();
        log.info("Order confirmed");
    }

    public String checkSuccessSign(){
        return successSign.getText();
    }

    public void clickSignOutButton(){
        logoutButton.click();
        log.info("Signed out");
    }

}
