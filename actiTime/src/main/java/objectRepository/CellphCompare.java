package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphCompare {
	public CellphCompare(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getCellphproductselect() {
		return Cellphproductselect;
	}

	public WebElement getCellphProduct() {
		return CellphProduct;
	}

	public WebElement getCellphClick() {
		return CellphClick;
	}

	public WebElement getCellphtoCartClick() {
		return CellphtoCartClick;
	}


	@FindBy(partialLinkText ="Electronic")
	private WebElement Cellphproductselect;

	@FindBy(xpath = "(//img[@title='Show products in category Cell phones'])")
	private WebElement CellphProduct;
	
	@FindBy(xpath = "(//img[@title='Show details for Smartphone'])")
	private WebElement CellphClick;
	
	@FindBy(xpath = "(//input[@value='Add to compare list'])")
	private WebElement CellphtoCartClick;
	
	
	

}
