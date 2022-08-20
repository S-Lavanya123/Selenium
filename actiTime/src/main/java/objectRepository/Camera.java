package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Camera {
	
	public Camera(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getCameraproductselect() {
		return cameraproductselect;
	}

	public WebElement getCameraproduct() {
		return cameraproduct;
	}

	public WebElement getCamerashoppingcart() {
		return Camerashoppingcart;
	}

	public WebElement getMailafrd() {
		return Mailafrd;
	}

	public WebElement getTofrdmail() {
		return Tofrdmail;
	}
	
	public WebElement getSendmail() {
		return Sendmail;
	}




	@FindBy(partialLinkText ="Electronic")
	private WebElement cameraproductselect;
	
	@FindBy(xpath="(//img[@title='Show products in category Camera, photo'])")
	private WebElement cameraproduct;
	
	@FindBy(xpath = "(//img[@title='Show details for Digital SLR Camera 12.2 Mpixel'])")
	private WebElement Camerashoppingcart;
	
	@FindBy(xpath = "(//input[@value='Email a friend'])")
	private WebElement Mailafrd;
	
	@FindBy(id = "FriendEmail")
	private WebElement Tofrdmail;
	
	@FindBy(xpath = "(//input[@name='send-email'])")
	private WebElement Sendmail;
	
	

}
