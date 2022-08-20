package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard {

	public GiftCard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setGiftCardClick(WebElement giftCardClick) {
		GiftCardClick = giftCardClick;
	}

	public void setCartClick(WebElement cartClick) {
		CartClick = cartClick;
	}

	public void setNameSendkeys(WebElement nameSendkeys) {
		NameSendkeys = nameSendkeys;
	}

	public void setMessageSendkeys(WebElement messageSendkeys) {
		MessageSendkeys = messageSendkeys;
	}

	public void setAddToCartClick(WebElement addToCartClick) {
		AddToCartClick = addToCartClick;
	}

	public WebElement getGiftCardClick() {
		return GiftCardClick;
	}

	public WebElement getCartClick() {
		return CartClick;
	}

	public WebElement getNameSendkeys() {
		return NameSendkeys;
	}

	public WebElement getMessageSendkeys() {
		return MessageSendkeys;
	}

	public WebElement getAddToCartClick() {
		return AddToCartClick;
	}

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement GiftCardClick;

	@FindBy(partialLinkText = "button-2 product-box-add-to-cart-button")
	private WebElement CartClick;

	@FindBy(id = " giftcard_4_RecipientName")
	private WebElement NameSendkeys;

	@FindBy(id = "giftcard_4_Message")
	private WebElement MessageSendkeys;

	@FindBy(id = "add-to-cart-button-4")
	private WebElement AddToCartClick;

}
