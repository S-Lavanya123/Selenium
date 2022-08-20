package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book {
	
	public Book(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement getBookproductSelect() {
		return BookproductSelect;
	}

	public WebElement getBookproduct() {
		return Bookproduct;
	}

	public WebElement getBookToCart() {
		return BookToCart;
	}


	@FindBy(partialLinkText = "Books")
	private WebElement BookproductSelect;
	
	@FindBy(xpath = "((//img[@title='Show details for Computing and Internet'])[2])")
	private WebElement Bookproduct;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])")
	private WebElement BookToCart;
	
	

}
