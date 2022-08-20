package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jewllery {
	
	public jewllery(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getJewlleryProductSearch() {
		return jewlleryProductSearch;
	}

	public WebElement getJewlleryProductClick() {
		return jewlleryProductClick;
	}

	public WebElement getRingclick() {
		return Ringclick;
	}

	public WebElement getEmailfriendclick() {
		return Emailfriendclick;
	}

	public WebElement getFriendmailId() {
		return FriendmailId;
	}

	public WebElement getSendmailClick() {
		return SendmailClick;
	}



	@FindBy(id = "small-searchterms")
	private WebElement  jewlleryProductSearch ;
	
	@FindBy(xpath="(//iput[@type='submit'])[1])")
	private WebElement jewlleryProductClick;
	
	@FindBy(xpath = "(//img[@title='Show details for Diamond Pave Earrings'])")
	private WebElement Ringclick;
	
	@FindBy(xpath = "(//input[@value='Email a friend'])")
	private WebElement Emailfriendclick;
	
	@FindBy(id = "FriendEmail")
	private WebElement FriendmailId;
	
	@FindBy(xpath = "(//input[@name='send-email'])")
	private WebElement SendmailClick;
	

}
