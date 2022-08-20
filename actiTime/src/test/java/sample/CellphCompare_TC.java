package sample;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.CellphCompare;

public class CellphCompare_TC extends BaseClass{
	@Test
	public void CellPhoneDescription() {
		CellphCompare cellph = new CellphCompare(driver);
		
		String ExpectedCellPhModule= "Demo Web Shop. Electronics";
		String ExpectedCellPhOption="Demo Web Shop. Cell phones";
		String ExpectedCellPhSelect="Demo Web Shop. Smartphone";
		String ExpectedCellPhToCompare="Demo Web Shop. Compare Products";
		
		
		cellph.getCellphproductselect().click();
		assertEquals(ExpectedCellPhModule, driver.getTitle(),"Cell phone module click failed");
		Reporter.log("Cell phone module selected",true);
		
		
		
		cellph.getCellphProduct().click();
		assertEquals(ExpectedCellPhOption, driver.getTitle(),"Cell phone option is click failed");
		Reporter.log("Cell phone option is selected",true);
		
		
		cellph.getCellphClick().click();
		assertEquals(ExpectedCellPhSelect, driver.getTitle(),"Cell phone  select failed");
		Reporter.log("Cell phone is selected",true);
		
		
		cellph.getCellphtoCartClick().click();
		assertEquals(ExpectedCellPhToCompare, driver.getTitle(),"Cell phone to compare  click failed");
		Reporter.log("Cell phone added to compare",true);
	}

}
