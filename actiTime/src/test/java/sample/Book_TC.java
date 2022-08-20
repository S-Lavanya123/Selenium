package sample;

import static org.testng.Assert.assertEquals;

//import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class Book_TC extends BaseClass {
	@Test
	

	
	public void BookDescription(){
		String ExpectedBookmodule= "Demo Web Shop. Books";
		String ExpectedBookSelect= "Demo Web Shop. Computing and Internet";
		String ExpectedBookToCart= "Demo Web Shop. Computing and Internet";
		
		Book books= new Book(driver);
		
		books.getBookproductSelect().click();
		assertEquals(ExpectedBookmodule, driver.getTitle(),"Book module click failed");
		Reporter.log("Book module is selected",true);
		
		
		books.getBookproduct().click();
		assertEquals(ExpectedBookSelect, driver.getTitle(),"Book select click failed");
		Reporter.log("Book is selected",true);
		
		
		books.getBookToCart().click();
		assertEquals(ExpectedBookToCart, driver.getTitle(),"Book add to cart click failed");
		Reporter.log("Book is added to cart",true);
		
		
		
	}

}
