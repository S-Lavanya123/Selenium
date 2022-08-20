package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryChain {
	public JewelryChain(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	public WebElement getJewelryClick() {
		return JewelryClick;
	}

	public WebElement getChainImageClick() {
		return ChainImageClick;
	}

	public WebElement getLengthSendkeys() {
		return LengthSendkeys;
	}

	public WebElement getQtySendkeys() {
		return QtySendkeys;
	}

	public WebElement getAddtoWishlistClickButton() {
		return AddtoWishlistClickButton;
	}

	public WebElement getCheckboxClick() {
		return CheckboxClick;
	}

	//public WebElement getAddtocartClick() {
		//return AddtocartClick;
	

	@FindBy(partialLinkText = "Jewelry")
	private WebElement JewelryClick;
	
	@FindBy(xpath = "// img[@title='Show details for Create Your Own Jewelry']")
	private WebElement ChainImageClick;
	
	@FindBy(id = "product_attribute_71_10_16")
	private WebElement LengthSendkeys;
	
	@FindBy(id = "addtocart_71_EnteredQuantity")
	 private WebElement QtySendkeys;
	
	 @FindBy(id = "add-to-wishlist-button-71")
	 private WebElement AddtoWishlistClickButton;
	 
	 @FindBy(name = "addtocart")
	 private WebElement CheckboxClick;
	 
	// @FindBy(name = "addtocartbutton")
	 //private WebElement AddtocartClick;
	 
	 
	 
	 
			 
	 
	
}
