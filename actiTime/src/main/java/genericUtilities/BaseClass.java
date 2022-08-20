package genericUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		//options.addArguments("--headless");
		driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

	}

	@BeforeMethod
	public void NavigatingToApplication() {
		driver.get("http://demowebshop.tricentis.com/");
		LoginPage login = new LoginPage(driver);
		login.getLogin().click();
		Reporter.log("Login page is displayed", true);
		login.getRegmailid().sendKeys("nikhilgowda@gmail.com");
		Reporter.log("Registered EmailID is entered", true);
		login.getRegpassword().sendKeys("nikhil.v");
		Reporter.log("Registered Password is entered", true);
		login.getRegLogin().click();
		Reporter.log("Home page is displayed", true);

	}

	@AfterMethod
	public void logoutoperation(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
//			ScreenshotUtility.takeScreenShot(driver, result.getName());

		}
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged out from application", true);

	}

	@AfterSuite
	public void closingTheApp() {
		driver.quit();
		Reporter.log("Browser exit sucessful", true);

	}

}
