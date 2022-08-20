package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apperal {
	public Apperal(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getApparel() {
		return Apparel;
	}

	public WebElement getBag() {
		return Bag;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getShoppingcart() {
		return Shoppingcart;
	}

	public WebElement getContinueShopping() {
		return ContinueShopping;
	}

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement Apparel;

	@FindBy(xpath = "((//img[@title='Show details for Genuine Leather Handbag with Cell Phone Holder & Many Pockets'])[2])")
	private WebElement Bag;

	@FindBy(id = "add-to-cart-button-29")
	private WebElement Cart;

	@FindBy(linkText = "Shopping cart")
	private WebElement Shoppingcart;

	@FindBy(xpath = "(//input[@value='Continue shopping'])")
	private WebElement ContinueShopping;

}
