package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Digitaldownloads{
	public Digitaldownloads(WebDriver driver) {
		PageFactory.initElements (driver,this);
	}
	@FindBy(partialLinkText = "Apparel")
	private WebElement DigitaldownloadsClick;
	
	@FindBy(xpath ="(//img[@title='Picture of Blue and green Sneaker'])")
	private WebElement shoesclick;
	
	@FindBy(id = "add-to-cart-button-28")
	private WebElement Addtocartclick;
	
	
	
	

}
