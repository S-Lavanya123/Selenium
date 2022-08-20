package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement Login;

	@FindBy(id = "Email")
	private WebElement Regmailid;

	@FindBy(id = "Password")
	private WebElement Regpassword;

	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement RegLogin;

	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement Logout;

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getRegmailid() {
		return Regmailid;
	}

	public WebElement getRegpassword() {
		return Regpassword;
	}

	public WebElement getRegLogin() {
		return RegLogin;
	}

	public WebElement getLogout() {
		return Logout;
	}

}
